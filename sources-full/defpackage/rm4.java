package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class rm4 implements ServiceConnection {
    public final sz0 a;
    public final lm4 b;
    public final lm4 c;
    public final /* synthetic */ au d;

    public rm4(au auVar, sz0 sz0Var) {
        this.d = auVar;
        im4 im4Var = auVar.C;
        this.b = new lm4(im4Var);
        this.c = new lm4(im4Var);
        this.a = sz0Var;
    }

    public final Long a(boolean z) {
        au auVar = this.d;
        try {
            if (z) {
                synchronized (auVar.a) {
                    try {
                        lm4 lm4Var = this.b;
                        if (!lm4Var.b) {
                            return null;
                        }
                        long jB = lm4Var.a.b();
                        if (!lm4Var.b) {
                            throw new IllegalStateException("This stopwatch is already stopped.");
                        }
                        lm4Var.b = false;
                        long j = (jB - lm4Var.d) + lm4Var.c;
                        lm4Var.c = j;
                        return Long.valueOf(j / 1000000);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            synchronized (auVar.a) {
                try {
                    lm4 lm4Var2 = this.c;
                    if (!lm4Var2.b) {
                        return null;
                    }
                    long jB2 = lm4Var2.a.b();
                    if (!lm4Var2.b) {
                        throw new IllegalStateException("This stopwatch is already stopped.");
                    }
                    lm4Var2.b = false;
                    long j2 = (jB2 - lm4Var2.d) + lm4Var2.c;
                    lm4Var2.c = j2;
                    return Long.valueOf(j2 / 1000000);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            tm4.i("BillingClient", "Exception getting connection establishment duration.", th3);
            return null;
        }
        tm4.i("BillingClient", "Exception getting connection establishment duration.", th3);
        return null;
    }

    public final void b(fu fuVar, int i, String str, boolean z, int i2) {
        try {
            dr4 dr4VarQ = er4.q();
            int i3 = fuVar.a;
            dr4VarQ.b();
            er4.p((er4) dr4VarQ.d, i3);
            String str2 = fuVar.c;
            dr4VarQ.b();
            er4.s((er4) dr4VarQ.d, str2);
            dr4VarQ.b();
            er4.v((er4) dr4VarQ.d, i);
            dr4VarQ.b();
            er4.t((er4) dr4VarQ.d, i2);
            if (str != null) {
                dr4VarQ.b();
                er4.r((er4) dr4VarQ.d, str);
            }
            Long lA = a(z);
            au auVar = this.d;
            if (!z) {
                yr4 yr4VarP = zr4.p();
                yr4VarP.b();
                zr4.q((zr4) yr4VarP.d, (er4) dr4VarQ.a());
                if (lA != null) {
                    long jLongValue = lA.longValue();
                    yr4VarP.b();
                    zr4.r((zr4) yr4VarP.d, jLongValue);
                }
                auVar.h.s((zr4) yr4VarP.a());
                return;
            }
            bs4 bs4VarP = cs4.p();
            bs4VarP.c(false);
            bs4VarP.d();
            bs4VarP.b();
            cs4.t((cs4) bs4VarP.d, i2);
            if (lA != null) {
                long jLongValue2 = lA.longValue();
                bs4VarP.b();
                cs4.s((cs4) bs4VarP.d, jLongValue2);
            }
            zq4 zq4VarS = ar4.s();
            zq4VarS.c(dr4VarQ);
            zq4VarS.b();
            ar4.r((ar4) zq4VarS.d, 6);
            zq4VarS.d(bs4VarP);
            auVar.s((ar4) zq4VarS.a());
        } catch (Throwable th) {
            tm4.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void c(int i, boolean z) {
        try {
            Long lA = a(z);
            au auVar = this.d;
            if (!z) {
                yr4 yr4VarP = zr4.p();
                dr4 dr4VarQ = er4.q();
                dr4VarQ.b();
                er4.p((er4) dr4VarQ.d, 0);
                dr4VarQ.b();
                er4.t((er4) dr4VarQ.d, i);
                yr4VarP.b();
                zr4.q((zr4) yr4VarP.d, (er4) dr4VarQ.a());
                if (lA != null) {
                    long jLongValue = lA.longValue();
                    yr4VarP.b();
                    zr4.r((zr4) yr4VarP.d, jLongValue);
                }
                auVar.h.s((zr4) yr4VarP.a());
                return;
            }
            br4 br4VarQ = cr4.q();
            br4VarQ.b();
            cr4.p((cr4) br4VarQ.d, 6);
            bs4 bs4VarP = cs4.p();
            bs4VarP.c(false);
            bs4VarP.d();
            bs4VarP.b();
            cs4.t((cs4) bs4VarP.d, i);
            if (lA != null) {
                long jLongValue2 = lA.longValue();
                bs4VarP.b();
                cs4.s((cs4) bs4VarP.d, jLongValue2);
            }
            br4VarQ.b();
            cr4.u((cr4) br4VarQ.d, (cs4) bs4VarP.a());
            auVar.t((cr4) br4VarQ.a());
        } catch (Throwable th) {
            tm4.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void d(fu fuVar) {
        au auVar = this.d;
        synchronized (auVar.a) {
            try {
                if (auVar.b == 3) {
                    return;
                }
                try {
                    this.a.u(fuVar);
                } catch (Throwable th) {
                    tm4.i("BillingClient", "Exception while calling onBillingSetupFinished.", th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(Exception exc, boolean z, int i) {
        int i2;
        tm4.i("BillingClient", "Exception while invoking initialize AIDL method", exc);
        boolean z2 = exc instanceof DeadObjectException;
        if (z2) {
            i2 = 132;
        } else if (exc instanceof RemoteException) {
            i2 = 134;
        } else {
            i2 = exc instanceof SecurityException ? 133 : 131;
        }
        int i3 = i2;
        String strA = go4.a(exc);
        this.d.v(0);
        b(z2 ? jo4.h : jo4.f, i3, strA, z, i);
        d(z2 ? jo4.h : jo4.f);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    public final void f(Exception exc, boolean z) {
        int i;
        int i2;
        String strA;
        fu fuVar;
        fu fuVar2;
        tm4.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", exc);
        boolean z2 = exc instanceof DeadObjectException;
        if (z2) {
            i2 = 91;
        } else {
            if (!(exc instanceof RemoteException)) {
                if (exc instanceof SecurityException) {
                    i2 = 92;
                } else {
                    i = 42;
                }
                if (fq2.b(i, 42)) {
                    strA = go4.a(exc);
                } else {
                    strA = null;
                }
                String str = strA;
                this.d.v(0);
                if (z2) {
                    fuVar = jo4.h;
                } else {
                    fuVar = jo4.f;
                }
                b(fuVar, i, str, z, 0);
                if (z2) {
                    fuVar2 = jo4.h;
                } else {
                    fuVar2 = jo4.f;
                }
                d(fuVar2);
            }
            i2 = 90;
        }
        i = i2;
        if (fq2.b(i, 42)) {
            strA = go4.a(exc);
        } else {
            strA = null;
        }
        String str2 = strA;
        this.d.v(0);
        if (z2) {
            fuVar = jo4.h;
        } else {
            fuVar = jo4.f;
        }
        b(fuVar, i, str2, z, 0);
        if (z2) {
            fuVar2 = jo4.h;
        } else {
            fuVar2 = jo4.f;
        }
        d(fuVar2);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean z;
        tm4.h("BillingClient", "Billing service died.");
        try {
            au auVar = this.d;
            synchronized (auVar.a) {
                z = true;
                if (auVar.b != 1) {
                    z = false;
                }
            }
            fy2 fy2Var = auVar.h;
            if (z) {
                zq4 zq4VarS = ar4.s();
                zq4VarS.b();
                ar4.r((ar4) zq4VarS.d, 6);
                dr4 dr4VarQ = er4.q();
                dr4VarQ.b();
                er4.v((er4) dr4VarQ.d, 110);
                zq4VarS.c(dr4VarQ);
                bs4 bs4VarP = cs4.p();
                bs4VarP.c(false);
                bs4VarP.d();
                zq4VarS.d(bs4VarP);
                fy2Var.l((ar4) zq4VarS.a());
            } else {
                fy2Var.p(fr4.p());
            }
        } catch (Throwable th) {
            tm4.i("BillingClient", "Unable to log.", th);
        }
        au auVar2 = this.d;
        synchronized (auVar2.a) {
            if (auVar2.b != 3 && auVar2.b != 0) {
                auVar2.v(0);
                auVar2.x();
                try {
                    this.a.t();
                } catch (Throwable th2) {
                    tm4.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        am4 yl4Var;
        tm4.g("BillingClient", "Billing service connected.");
        au auVar = this.d;
        synchronized (auVar.a) {
            try {
                if (auVar.b == 3) {
                    return;
                }
                int i = zl4.e;
                if (iBinder == null) {
                    yl4Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    yl4Var = iInterfaceQueryLocalInterface instanceof am4 ? (am4) iInterfaceQueryLocalInterface : new yl4(iBinder, "com.android.vending.billing.IInAppBillingService", 1);
                }
                auVar.i = yl4Var;
                if (au.e(new Callable() { // from class: om4
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v0, types: [rm4] */
                    /* JADX WARN: Type inference failed for: r3v10 */
                    /* JADX WARN: Type inference failed for: r3v7 */
                    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
                    /* JADX WARN: Type inference failed for: r9v19 */
                    /* JADX WARN: Type inference failed for: r9v3 */
                    /* JADX WARN: Type inference failed for: r9v4 */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Bundle bundle;
                        am4 am4Var;
                        ?? r9;
                        ?? r1 = this.a;
                        au auVar2 = r1.d;
                        synchronized (auVar2.a) {
                            try {
                                if (auVar2.b == 3) {
                                    return null;
                                }
                                int i2 = 1;
                                boolean z = false;
                                if (auVar2.b == 1) {
                                    z = true;
                                }
                                if (TextUtils.isEmpty(null)) {
                                    bundle = null;
                                } else {
                                    bundle = new Bundle();
                                    bundle.putString("accountName", null);
                                    tm4.b(bundle, auVar2.d, auVar2.B.longValue());
                                }
                                synchronized (auVar2.a) {
                                    am4Var = auVar2.i;
                                }
                                au auVar3 = r1.d;
                                if (am4Var == null) {
                                    auVar3.v(0);
                                    fu fuVar = jo4.h;
                                    auVar3.u(107, fuVar);
                                    r1.d(fuVar);
                                    return null;
                                }
                                String packageName = auVar3.g.getPackageName();
                                try {
                                    yl4 yl4Var2 = (yl4) am4Var;
                                    if (yl4Var2.e(packageName, "inapp", 25) != 0) {
                                        int iE = 3;
                                        int i3 = 29;
                                        while (true) {
                                            if (i3 < 3) {
                                                r9 = z;
                                                break;
                                            }
                                            try {
                                                tm4.g("BillingClient", il4.a(i3 == true ? 1 : 0, "trying subs apiVersion: "));
                                                iE = bundle == null ? yl4Var2.e(packageName, "subs", i3 == true ? 1 : 0) : yl4Var2.g(i3 == true ? 1 : 0, packageName, "subs", bundle);
                                                if (iE == 0) {
                                                    tm4.g("BillingClient", il4.a(i3 == true ? 1 : 0, "highestLevelSupportedForSubs: "));
                                                    r9 = i3;
                                                    break;
                                                }
                                                i3 = (i3 == true ? 1 : 0) - 1;
                                            } catch (Exception e) {
                                                r1.f(e, z);
                                            }
                                        }
                                        au auVar4 = r1.d;
                                        auVar4.getClass();
                                        auVar4.k = r9 >= 3 ? true : z;
                                        if (r9 < 3) {
                                            tm4.g("BillingClient", "In-app billing API does not support subscription on this device.");
                                            i2 = 9;
                                        }
                                        for (int i4 = 29; i4 >= 3; i4--) {
                                            tm4.g("BillingClient", il4.a(i4, "trying inapp apiVersion: "));
                                            iE = bundle == null ? yl4Var2.e(packageName, "inapp", i4) : yl4Var2.g(i4, packageName, "inapp", bundle);
                                            if (iE == 0) {
                                                auVar4.l = i4;
                                                tm4.g("BillingClient", "mHighestLevelSupportedForInApp: " + i4);
                                                break;
                                            }
                                        }
                                        au.k(auVar4, auVar4.l);
                                        if (auVar4.l < 3) {
                                            tm4.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                            i2 = 36;
                                        }
                                        int i5 = i2;
                                        au.l(auVar4, iE);
                                        if (iE == 0) {
                                            r1.c(z, z);
                                            r1.d(jo4.g);
                                            return null;
                                        }
                                        fu fuVar2 = jo4.a;
                                        r1.b(fuVar2, i5, null, z, 0);
                                        r1.d(fuVar2);
                                        return null;
                                    }
                                    au auVar5 = r1.d;
                                    Context context = auVar5.g;
                                    synchronized (yo4.class) {
                                    }
                                    synchronized (yo4.class) {
                                    }
                                    synchronized (yo4.class) {
                                    }
                                    synchronized (yo4.class) {
                                    }
                                    long jMin = 100;
                                    ?? r3 = z;
                                    Exception e2 = null;
                                    while (true) {
                                        long j = (long) r3;
                                        if (j > 3) {
                                            break;
                                        }
                                        try {
                                            Boolean boolValueOf = Boolean.valueOf(z);
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putString("callingPackage", auVar5.g.getPackageName());
                                            tm4.b(bundle2, auVar5.d, auVar5.B.longValue());
                                            if (auVar5.y != null) {
                                                bundle2.putBoolean("enablePendingPurchases", true);
                                            }
                                            yl4Var2.m(auVar5.g.getPackageName(), bundle2, new an4(auVar5, r1, boolValueOf, r3));
                                        } catch (SecurityException e3) {
                                            r1.e(e3, z, r3);
                                        } catch (Exception e4) {
                                            e2 = e4;
                                            if (j != 3) {
                                                tm4.i("BillingClient", "Transient error during initialize(), retrying in " + jMin + "ms", e2);
                                                try {
                                                    Thread.sleep(jMin);
                                                    jMin = (long) Math.min(jMin * 2.0d, 60000.0d);
                                                    r3++;
                                                } catch (InterruptedException e5) {
                                                    Thread.currentThread().interrupt();
                                                    r1.e(e5, z, r3);
                                                }
                                            } else {
                                                r1.e(e2, z, r3);
                                            }
                                        }
                                    }
                                    r1.e(e2, z, r3);
                                } catch (Exception e6) {
                                    r1.f(e6, z);
                                }
                                return null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }, 30000L, new im(18, this), Looper.myLooper() == null ? auVar.e : new Handler(Looper.myLooper()), auVar.d()) == null) {
                    fu fuVarH = auVar.h();
                    auVar.u(25, fuVarH);
                    d(fuVarH);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z;
        tm4.h("BillingClient", "Billing service disconnected.");
        try {
            au auVar = this.d;
            synchronized (auVar.a) {
                z = true;
                if (auVar.b != 1) {
                    z = false;
                }
            }
            fy2 fy2Var = auVar.h;
            if (z) {
                zq4 zq4VarS = ar4.s();
                zq4VarS.b();
                ar4.r((ar4) zq4VarS.d, 6);
                dr4 dr4VarQ = er4.q();
                dr4VarQ.b();
                er4.v((er4) dr4VarQ.d, 109);
                zq4VarS.c(dr4VarQ);
                bs4 bs4VarP = cs4.p();
                bs4VarP.c(false);
                bs4VarP.d();
                zq4VarS.d(bs4VarP);
                fy2Var.l((ar4) zq4VarS.a());
            } else {
                fy2Var.t(as4.p());
            }
        } catch (Throwable th) {
            tm4.i("BillingClient", "Unable to log.", th);
        }
        au auVar2 = this.d;
        synchronized (auVar2.a) {
            try {
                if (ki4.c) {
                    if (auVar2.b != 3 && auVar2.b != 0) {
                        lm4 lm4Var = this.c;
                        lm4Var.c = 0L;
                        lm4Var.b = false;
                        lm4Var.a();
                    }
                    return;
                }
                lm4 lm4Var2 = this.c;
                lm4Var2.c = 0L;
                lm4Var2.b = false;
                lm4Var2.a();
                if (auVar2.b == 3) {
                    return;
                }
                auVar2.v(0);
                try {
                    this.a.t();
                } catch (Throwable th2) {
                    tm4.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
