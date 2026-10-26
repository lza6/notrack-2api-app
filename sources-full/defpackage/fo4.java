package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class fo4 extends au {
    public final Context D;
    public volatile int E;
    public volatile hm4 F;
    public volatile zn4 G;
    public volatile ScheduledExecutorService H;

    public fo4(qn0 qn0Var, Context context, tw2 tw2Var, zt ztVar) {
        super(qn0Var, context, tw2Var, ztVar);
        this.E = 0;
        this.D = context;
    }

    public fo4(qn0 qn0Var, Context context, zt ztVar) {
        super(qn0Var, context, ztVar);
        this.E = 0;
        this.D = context;
    }

    public final synchronized boolean C() {
        return (this.E != 2 || this.F == null || this.G == null) ? false : true;
    }

    public final mo4 D(int i) {
        int i2 = 0;
        if (!C()) {
            tm4.h("BillingClientTesting", "Billing Override Service is not ready.");
            E(94, 28, jo4.a(-1, "Billing Override Service connection is disconnected."));
            return new ko4(0);
        }
        kn4 kn4Var = new kn4(i, i2, this);
        ms4 ms4Var = new ms4();
        ms4Var.c = new bt4();
        ws4 ws4Var = new ws4(ms4Var);
        ms4Var.b = ws4Var;
        ms4Var.a = kn4.class;
        try {
            kn4Var.q(ms4Var);
            ms4Var.a = "billingOverrideService.getBillingOverride";
            return ws4Var;
        } catch (Exception e) {
            mp4 mp4Var = new mp4(e);
            rh4 rh4Var = js4.n;
            vs4 vs4Var = ws4Var.d;
            if (rh4Var.e(vs4Var, null, mp4Var)) {
                js4.d(vs4Var);
            }
            return ws4Var;
        }
    }

    public final void E(int i, int i2, fu fuVar) {
        int i3 = go4.a;
        ar4 ar4VarB = go4.b(i, i2, fuVar, null, gr4.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(ar4VarB, "ApiFailure should not be null");
        this.h.l(ar4VarB);
    }

    @Override // defpackage.au
    public final fu a(Activity activity, sd sdVar) {
        int iIntValue = 0;
        try {
            iIntValue = ((Integer) D(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e) {
            E(102, 28, jo4.q);
            tm4.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e);
        } catch (Exception e2) {
            if (e2 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            E(95, 28, jo4.q);
            tm4.i("BillingClientTesting", "An error occurred while retrieving billing override.", e2);
        }
        if (iIntValue > 0) {
            fu fuVarA = jo4.a(iIntValue, "Billing override value was set by a license tester.");
            E(93, 2, fuVarA);
            A(fuVarA);
            return fuVarA;
        }
        try {
            return super.a(activity, sdVar);
        } catch (Exception e3) {
            fu fuVar = jo4.f;
            E(103, 2, fuVar);
            tm4.i("BillingClientTesting", "An internal error occurred.", e3);
            return fuVar;
        }
    }

    @Override // defpackage.au
    public final void b(c23 c23Var, bu buVar) {
        ScheduledExecutorService scheduledExecutorService;
        int i = 2;
        wb1 wb1Var = new wb1(i, buVar);
        hm0 hm0Var = new hm0(this, c23Var, buVar, i);
        mo4 mo4VarD = D(7);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.H == null) {
                    this.H = Executors.newSingleThreadScheduledExecutor();
                }
                scheduledExecutorService = this.H;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!mo4VarD.isDone()) {
            oo4 oo4Var = new oo4();
            oo4Var.p = mo4VarD;
            im imVar = new im();
            imVar.d = oo4Var;
            oo4Var.q = scheduledExecutorService.schedule(imVar, 28500L, timeUnit);
            mo4VarD.b(imVar, eo4.c);
            mo4VarD = oo4Var;
        }
        iy2 iy2Var = new iy2(this, wb1Var, hm0Var);
        mo4VarD.b(new io4(mo4VarD, 0, iy2Var), d());
    }

    @Override // defpackage.au
    public final void c(sz0 sz0Var) {
        synchronized (this) {
            if (C()) {
                tm4.g("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                int i = go4.a;
                cr4 cr4VarC = go4.c(26, gr4.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(cr4VarC, "ApiSuccess should not be null");
                fy2 fy2Var = this.h;
                fy2Var.getClass();
                try {
                    fy2Var.v(cr4VarC, (lr4) fy2Var.c);
                } catch (Throwable th) {
                    tm4.i("BillingLogger", "Unable to log.", th);
                }
            } else {
                int i2 = 1;
                if (this.E == 1) {
                    tm4.h("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                } else if (this.E == 3) {
                    tm4.h("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                    E(38, 26, jo4.a(-1, "Billing Override Service connection is disconnected."));
                } else {
                    this.E = 1;
                    tm4.g("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.G = new zn4(0, this);
                    Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                    intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                    Context context = this.D;
                    List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        i2 = 41;
                    } else {
                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                                tm4.h("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                if (context.bindService(intent2, this.G, 1)) {
                                    tm4.g("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                } else {
                                    tm4.h("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                }
                            }
                            i2 = 39;
                        }
                    }
                    this.E = 0;
                    tm4.g("BillingClientTesting", "Billing Override Service unavailable on device.");
                    E(i2, 26, jo4.a(2, "Billing Override Service unavailable on device."));
                }
            }
        }
        w(sz0Var);
    }
}
