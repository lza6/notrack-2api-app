package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class zf1 implements Handler.Callback {
    public static final Status o = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status p = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object q = new Object();
    public static zf1 r;
    public long a;
    public boolean b;
    public gt3 c;
    public al4 d;
    public final Context e;
    public final vf1 f;
    public final mi4 g;
    public final AtomicInteger h;
    public final AtomicInteger i;
    public final ConcurrentHashMap j;
    public final ul k;
    public final ul l;
    public final el4 m;
    public volatile boolean n;

    public zf1(Context context, Looper looper) {
        vf1 vf1Var = vf1.c;
        this.a = 10000L;
        this.b = false;
        this.h = new AtomicInteger(1);
        this.i = new AtomicInteger(0);
        this.j = new ConcurrentHashMap(5, 0.75f, 1);
        this.k = new ul(0);
        this.l = new ul(0);
        this.n = true;
        this.e = context;
        el4 el4Var = new el4(looper, this);
        Looper.getMainLooper();
        this.m = el4Var;
        this.f = vf1Var;
        this.g = new mi4(12);
        PackageManager packageManager = context.getPackageManager();
        if (gm4.q == null) {
            gm4.q = Boolean.valueOf(sf3.J() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (gm4.q.booleanValue()) {
            this.n = false;
        }
        el4Var.sendMessage(el4Var.obtainMessage(6));
    }

    public static Status b(vg vgVar, ml0 ml0Var) {
        return new Status(17, "API: " + ((String) vgVar.b.h) + " is not available on this device. Connection failed with: " + String.valueOf(ml0Var), ml0Var.h, ml0Var);
    }

    public static zf1 d(Context context) {
        zf1 zf1Var;
        HandlerThread handlerThread;
        synchronized (q) {
            if (r == null) {
                synchronized (ss4.g) {
                    try {
                        handlerThread = ss4.i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            ss4.i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = ss4.i;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = vf1.b;
                r = new zf1(applicationContext, looper);
            }
            zf1Var = r;
        }
        return zf1Var;
    }

    public final boolean a(ml0 ml0Var, int i) {
        boolean zBooleanValue;
        PendingIntent activity;
        Boolean bool;
        vf1 vf1Var = this.f;
        Context context = this.e;
        vf1Var.getClass();
        synchronized (xp1.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = xp1.a;
            if (context2 == null || (bool = xp1.b) == null || context2 != applicationContext) {
                xp1.b = null;
                if (sf3.J()) {
                    xp1.b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                } else {
                    try {
                        context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        xp1.b = Boolean.TRUE;
                    } catch (ClassNotFoundException unused) {
                        xp1.b = Boolean.FALSE;
                    }
                }
                xp1.a = applicationContext;
                zBooleanValue = xp1.b.booleanValue();
            } else {
                zBooleanValue = bool.booleanValue();
            }
        }
        if (zBooleanValue) {
            return false;
        }
        int i2 = ml0Var.d;
        if (i2 == 0 || (activity = ml0Var.h) == null) {
            Intent intentA = vf1Var.a(i2, context, null);
            activity = intentA != null ? PendingIntent.getActivity(context, 0, intentA, 201326592) : null;
        }
        if (activity == null) {
            return false;
        }
        int i3 = ml0Var.d;
        int i4 = GoogleApiActivity.d;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        vf1Var.f(context, i3, PendingIntent.getActivity(context, 0, intent, bl4.a | 134217728));
        return true;
    }

    public final ek4 c(al4 al4Var) {
        vg vgVar = al4Var.e;
        ConcurrentHashMap concurrentHashMap = this.j;
        ek4 ek4Var = (ek4) concurrentHashMap.get(vgVar);
        if (ek4Var == null) {
            ek4Var = new ek4(this, al4Var);
            concurrentHashMap.put(vgVar, ek4Var);
        }
        if (ek4Var.e.k()) {
            this.l.add(vgVar);
        }
        ek4Var.m();
        return ek4Var;
    }

    public final void e(ml0 ml0Var, int i) {
        if (a(ml0Var, i)) {
            return;
        }
        el4 el4Var = this.m;
        el4Var.sendMessage(el4Var.obtainMessage(5, i, 0, ml0Var));
    }

    /* JADX WARN: Code duplicated, block: B:218:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:220:0x03be  */
    /* JADX WARN: Code duplicated, block: B:222:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:224:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:80:0x011b  */
    /* JADX WARN: Code duplicated, block: B:82:0x011f  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v6 ek4, still in use, count: 2, list:
          (r2v6 ek4) from 0x03b0: IGET (r2v6 ek4) A[WRAPPED] ek4.j int
          (r2v6 ek4) from 0x03b6: PHI (r2 I:??) = (r2v3 ek4), (r2v6 ek4) binds: [B:216:0x03b5, B:279:0x03b6] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r11) {
        /*
            Method dump skipped, instruction units count: 1234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zf1.handleMessage(android.os.Message):boolean");
    }
}
