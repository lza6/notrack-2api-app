package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.api.ProxyBillingActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class au {
    public ExecutorService A;
    public final Long B;
    public final im4 C;
    public final String c;
    public final String d;
    public volatile ft4 f;
    public final Context g;
    public final fy2 h;
    public volatile am4 i;
    public volatile rm4 j;
    public boolean k;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public final qn0 y;
    public zm4 z;
    public final Object a = new Object();
    public volatile int b = 0;
    public final Handler e = new Handler(Looper.getMainLooper());
    public int l = 0;

    public au(qn0 qn0Var, Context context, tw2 tw2Var, zt ztVar) {
        int i = zm4.h;
        this.z = in4.r;
        long jNextLong = new Random().nextLong();
        this.B = Long.valueOf(jNextLong);
        this.C = jm4.a;
        this.c = "9.1.0";
        String strJ = j();
        this.d = strJ;
        this.g = context.getApplicationContext();
        kr4 kr4VarZ = lr4.z();
        kr4VarZ.h();
        if (strJ != null) {
            kr4VarZ.b();
            lr4.y((lr4) kr4VarZ.d, strJ);
        }
        kr4VarZ.g(this.g.getPackageName());
        kr4VarZ.b();
        lr4.D((lr4) kr4VarZ.d, jNextLong);
        kr4VarZ.b();
        lr4.w((lr4) kr4VarZ.d);
        kr4VarZ.c(Build.VERSION.SDK_INT);
        kr4VarZ.f();
        m(kr4VarZ, context);
        try {
            kr4VarZ.d(this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            tm4.i("BillingClient", "Error getting app version code.", th);
        }
        this.h = new fy2(this.g, (lr4) kr4VarZ.a());
        if (tw2Var == null) {
            tm4.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f = new ft4(this.g, tw2Var, this.h);
        this.y = qn0Var;
        this.g.getPackageName();
    }

    public au(qn0 qn0Var, Context context, zt ztVar) {
        int i = zm4.h;
        this.z = in4.r;
        long jNextLong = new Random().nextLong();
        this.B = Long.valueOf(jNextLong);
        this.C = jm4.a;
        this.c = "9.1.0";
        String strJ = j();
        this.d = strJ;
        this.g = context.getApplicationContext();
        kr4 kr4VarZ = lr4.z();
        kr4VarZ.h();
        if (strJ != null) {
            kr4VarZ.b();
            lr4.y((lr4) kr4VarZ.d, strJ);
        }
        kr4VarZ.g(this.g.getPackageName());
        kr4VarZ.b();
        lr4.D((lr4) kr4VarZ.d, jNextLong);
        kr4VarZ.b();
        lr4.w((lr4) kr4VarZ.d);
        kr4VarZ.c(Build.VERSION.SDK_INT);
        kr4VarZ.f();
        m(kr4VarZ, context);
        try {
            kr4VarZ.d(this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            tm4.i("BillingClient", "Error getting app version code.", th);
        }
        this.h = new fy2(this.g, (lr4) kr4VarZ.a());
        tm4.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f = new ft4(this.g, null, this.h);
        this.y = qn0Var;
        this.g.getPackageName();
    }

    public static Future e(Callable callable, long j, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new io4(futureSubmit, 17, runnable), (long) (j * 0.95d));
            return futureSubmit;
        } catch (Exception e) {
            tm4.i("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public static String j() {
        try {
            return (String) py.class.getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void k(au auVar, int i) {
        auVar.l = i;
        auVar.x = i >= 28;
        auVar.w = i >= 26;
        auVar.v = i >= 24;
        auVar.u = i >= 21;
        auVar.t = i >= 20;
        auVar.s = i >= 19;
        auVar.r = i >= 17;
        auVar.q = i >= 16;
        auVar.p = i >= 15;
        auVar.o = i >= 14;
        auVar.n = i >= 9;
        auVar.m = i >= 6;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void l(au auVar, int i) {
        if (i != 0) {
            auVar.v(0);
            return;
        }
        synchronized (auVar.a) {
            try {
                if (auVar.b == 3) {
                    return;
                }
                auVar.v(2);
                ft4 ft4Var = auVar.f != null ? auVar.f : null;
                if (ft4Var != null) {
                    boolean z = auVar.u;
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                    IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                    intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                    ft4Var.f = z;
                    et4 et4Var = ft4Var.e;
                    Context context = ft4Var.a;
                    et4Var.a(context, intentFilter2);
                    boolean z2 = ft4Var.f;
                    et4 et4Var2 = ft4Var.d;
                    if (!z2) {
                        et4Var2.a(context, intentFilter);
                        return;
                    }
                    synchronized (et4Var2) {
                        try {
                            if (et4Var2.a) {
                                return;
                            }
                            if (Build.VERSION.SDK_INT >= 33) {
                                context.registerReceiver(et4Var2, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != et4Var2.b ? 4 : 2);
                            } else {
                                context.registerReceiver(et4Var2, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                            }
                            et4Var2.a = true;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final void m(kr4 kr4Var, Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                int i = (int) (memoryInfo.totalMem / 1048576);
                kr4Var.b();
                lr4.v((lr4) kr4Var.d, i);
                String str = Build.BRAND;
                kr4Var.b();
                lr4.r((lr4) kr4Var.d);
                String str2 = Build.MODEL;
                kr4Var.b();
                lr4.u((lr4) kr4Var.d);
                String str3 = Build.MANUFACTURER;
                kr4Var.b();
                lr4.t((lr4) kr4Var.d);
                String str4 = Build.FINGERPRINT;
                kr4Var.b();
                lr4.s((lr4) kr4Var.d);
            }
        } catch (RuntimeException e) {
            tm4.i("BillingClient", "Runtime error while populating device info.", e);
        }
    }

    public final void A(fu fuVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.e.post(new io4(this, 16, fuVar));
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0318 A[EDGE_INSN: B:136:0x0318->B:104:0x025c BREAK  A[LOOP:6: B:98:0x0228->B:116:0x02a4]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0116  */
    /* JADX WARN: Code duplicated, block: B:59:0x011a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v0, types: [au] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r5v11, types: [long] */
    /* JADX WARN: Type inference failed for: r5v12, types: [long] */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r7v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    public fu a(Activity activity, final sd sdVar) {
        String str;
        String str2;
        fu fuVarA;
        xz2 xz2Var;
        fu fuVarA2;
        long j;
        long j2;
        boolean z;
        ?? r6;
        Future futureE;
        String str3;
        ?? r7;
        ?? r4;
        ?? r8;
        ?? r5;
        int iD;
        int i;
        String string;
        String str4;
        String str5;
        ArrayList arrayList;
        boolean z2;
        int i2;
        long jNextLong = new Random().nextLong();
        if (this.f == null || this.f.b == null) {
            fu fuVar = jo4.p;
            p(12, fuVar, jNextLong);
            return fuVar;
        }
        try {
            tm4.g("BillingClient", "Already connected or not opted into auto reconnection.");
            fu fuVar2 = jo4.g;
            TimeUnit.MILLISECONDS.getClass();
            int i3 = fuVar2.a;
            if (i3 == 0) {
                tm4.g("BillingClient", "Reconnection succeeded with result: " + i3);
            } else {
                tm4.h("BillingClient", "Reconnection failed with result: " + i3);
            }
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            tm4.i("BillingClient", "Error during reconnection attempt: ", e);
        }
        if (!z()) {
            fu fuVar3 = jo4.h;
            p(2, fuVar3, jNextLong);
            A(fuVar3);
            return fuVar3;
        }
        synchronized (this.a) {
            try {
                if (this.j != null) {
                    this.j.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll((ArrayList) sdVar.e);
        xm4 xm4Var = (xm4) sdVar.d;
        Iterator it = arrayList2.iterator();
        if ((it.hasNext() ? it.next() : null) != null) {
            m51.t();
            return null;
        }
        pm4 pm4Var = (pm4) xm4Var.iterator();
        cu cuVar = (cu) (pm4Var.hasNext() ? pm4Var.next() : null);
        a03 a03Var = cuVar.a;
        String str6 = a03Var.c;
        String str7 = a03Var.d;
        if (str7.equals("subs") && !this.k) {
            tm4.h("BillingClient", "Current client doesn't support subscriptions.");
            fu fuVar4 = jo4.j;
            q(9, fuVar4, jNextLong, false);
            A(fuVar4);
            return fuVar4;
        }
        if (((String) sdVar.b) == null) {
            du duVar = (du) sdVar.c;
            duVar.getClass();
            if (duVar.b == 0 && !sdVar.a) {
                xm4 xm4Var2 = (xm4) sdVar.d;
                if (xm4Var2 != null) {
                    int size = xm4Var2.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ((cu) xm4Var2.get(i4)).getClass();
                    }
                }
            } else if (!this.m) {
                tm4.h("BillingClient", "Current client doesn't support extra params for buy intent.");
                fu fuVar5 = jo4.e;
                q(18, fuVar5, jNextLong, false);
                A(fuVar5);
                return fuVar5;
            }
        } else if (!this.m) {
            tm4.h("BillingClient", "Current client doesn't support extra params for buy intent.");
            fu fuVar6 = jo4.e;
            q(18, fuVar6, jNextLong, false);
            A(fuVar6);
            return fuVar6;
        }
        if (arrayList2.size() > 1 && !this.q) {
            tm4.h("BillingClient", "Current client doesn't support multi-item purchases.");
            fu fuVar7 = jo4.k;
            q(19, fuVar7, jNextLong, false);
            A(fuVar7);
            return fuVar7;
        }
        if (!xm4Var.isEmpty() && !this.r) {
            tm4.h("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            fu fuVar8 = jo4.n;
            q(20, fuVar8, jNextLong, false);
            A(fuVar8);
            return fuVar8;
        }
        pm4 pm4VarListIterator = xm4Var.listIterator(0);
        while (pm4VarListIterator.hasNext()) {
            String str8 = ((cu) pm4VarListIterator.next()).b;
            if (str8 != null) {
                if (str8.contains(":") && !this.x) {
                    tm4.h("BillingClient", "Current Play Store version doesn't support gift code purchase.");
                    fu fuVar9 = jo4.m;
                    q(143, fuVar9, jNextLong, false);
                    A(fuVar9);
                    return fuVar9;
                }
            }
        }
        if (!((xm4) sdVar.d).isEmpty()) {
            cu cuVar2 = (cu) ((xm4) sdVar.d).get(0);
            int i5 = 1;
            str = null;
            while (true) {
                if (i5 >= ((xm4) sdVar.d).size()) {
                    str2 = str6;
                    a03 a03Var2 = cuVar2.a;
                    String strOptString = a03Var2.b.optString("packageName");
                    HashMap map = new HashMap();
                    HashSet hashSet = new HashSet();
                    xm4 xm4Var3 = (xm4) sdVar.d;
                    int size2 = xm4Var3.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 < size2) {
                            xm4 xm4Var4 = xm4Var3;
                            cu cuVar3 = (cu) xm4Var3.get(i6);
                            cuVar3.getClass();
                            int i7 = size2;
                            a03 a03Var3 = cuVar3.a;
                            int i8 = i6;
                            String str9 = a03Var3.c;
                            HashSet hashSet2 = hashSet;
                            if (a03Var3.i != null && cuVar3.b == null) {
                                fuVarA = jo4.a(5, "offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: " + str9);
                                break;
                            }
                            if (map.containsKey(str9)) {
                                fuVarA = jo4.a(5, "ProductId can not be duplicated. Invalid product id: " + str9 + ".");
                                break;
                            }
                            map.put(str9, cuVar3);
                            if (!a03Var2.d.equals("play_pass_subs") && !a03Var3.d.equals("play_pass_subs") && !strOptString.equals(a03Var3.b.optString("packageName"))) {
                                fuVarA = jo4.a(5, "All products must have the same package name.");
                                break;
                            }
                            i6 = i8 + 1;
                            size2 = i7;
                            xm4Var3 = xm4Var4;
                            hashSet = hashSet2;
                        } else {
                            Iterator it2 = hashSet.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    ArrayList arrayList3 = a03Var2.j;
                                    String str10 = cuVar2.b;
                                    if (str10 != null && arrayList3 != null) {
                                        int size3 = arrayList3.size();
                                        int i9 = 0;
                                        do {
                                            if (i9 >= size3) {
                                                xz2Var = null;
                                                break;
                                            }
                                            Object obj = arrayList3.get(i9);
                                            i9++;
                                            xz2Var = (xz2) obj;
                                        } while (!str10.equals(xz2Var.a));
                                        if (xz2Var != null && xz2Var.d != null) {
                                            fuVarA = jo4.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                                            break;
                                        }
                                        fuVarA = jo4.g;
                                        break;
                                    }
                                    fuVarA = jo4.g;
                                    break;
                                }
                                String str11 = (String) it2.next();
                                if (map.containsKey(str11)) {
                                    ((cu) map.get(str11)).getClass();
                                    fuVarA = jo4.a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str11 + ".");
                                    break;
                                }
                            }
                        }
                    }
                    fuVarA2 = fuVarA;
                    break;
                }
                cu cuVar4 = (cu) ((xm4) sdVar.d).get(i5);
                str2 = str6;
                if (!cuVar4.a.d.equals(cuVar2.a.d) && !cuVar4.a.d.equals("play_pass_subs")) {
                    fuVarA2 = jo4.a(5, "All products should have same ProductType.");
                    break;
                }
                i5++;
                str6 = str2;
            }
        } else {
            str2 = str6;
            fuVarA2 = jo4.g;
            str = null;
        }
        if (fuVarA2 != jo4.g) {
            q(108, fuVarA2, jNextLong, false);
            A(fuVarA2);
            return fuVarA2;
        }
        if (this.m) {
            boolean z3 = this.n;
            this.y.getClass();
            this.y.getClass();
            String str12 = this.d;
            long jLongValue = this.B.longValue();
            this.g.getPackageName();
            z = false;
            final Bundle bundle = new Bundle();
            tm4.b(bundle, str12, jLongValue);
            bundle.putLong("billingClientTransactionId", j);
            int i10 = ((du) sdVar.c).b;
            if (i10 != 0) {
                j = r4;
                bundle.putInt("prorationMode", i10);
            }
            j = r4;
            if (!TextUtils.isEmpty((String) sdVar.b)) {
                bundle.putString("accountId", (String) sdVar.b);
            }
            if (TextUtils.isEmpty(str)) {
                str4 = str;
            } else {
                str4 = str;
                bundle.putString("obfuscatedProfileId", str4);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(str4)));
            }
            if (!TextUtils.isEmpty(((du) sdVar.c).c)) {
                bundle.putString("oldSkuPurchaseToken", ((du) sdVar.c).c);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("oldSkuPurchaseId", null);
            }
            ((du) sdVar.c).getClass();
            if (!TextUtils.isEmpty(null)) {
                ((du) sdVar.c).getClass();
                bundle.putString("originalExternalTransactionId", null);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("paymentsPurchaseParams", null);
            }
            if (z3) {
                bundle.putBoolean("enablePendingPurchases", true);
            }
            ArrayList arrayList4 = new ArrayList();
            pm4 pm4VarListIterator2 = ((xm4) sdVar.d).listIterator(0);
            while (pm4VarListIterator2.hasNext()) {
                ((cu) pm4VarListIterator2.next()).getClass();
            }
            if (!arrayList4.isEmpty()) {
                wo4 wo4VarP = xo4.p();
                wo4VarP.b();
                xo4.q((xo4) wo4VarP.d, arrayList4);
                bundle.putByteArray("subscriptionProductReplacementParamsList", ((xo4) wo4VarP.a()).b());
            }
            if (arrayList2.isEmpty()) {
                ArrayList<String> arrayList5 = new ArrayList<>(xm4Var.size() - 1);
                ArrayList<String> arrayList6 = new ArrayList<>(xm4Var.size() - 1);
                ArrayList<String> arrayList7 = new ArrayList<>();
                ArrayList<String> arrayList8 = new ArrayList<>();
                ArrayList<String> arrayList9 = new ArrayList<>();
                ArrayList<Integer> arrayList10 = new ArrayList<>();
                int i11 = 0;
                while (i11 < xm4Var.size()) {
                    cu cuVar5 = (cu) xm4Var.get(i11);
                    a03 a03Var4 = cuVar5.a;
                    long j3 = j;
                    if (!a03Var4.g.isEmpty()) {
                        arrayList7.add(a03Var4.g);
                    }
                    String str13 = cuVar5.b;
                    arrayList8.add(str13);
                    if (TextUtils.isEmpty(str13) || (arrayList = a03Var4.j) == null || arrayList.isEmpty()) {
                        str5 = a03Var4.h;
                        break;
                    }
                    int size4 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size4) {
                            str5 = a03Var4.h;
                            break;
                        }
                        Object obj2 = arrayList.get(i12);
                        int i13 = i12 + 1;
                        ArrayList arrayList11 = arrayList;
                        xz2 xz2Var2 = (xz2) obj2;
                        if (!TextUtils.isEmpty(xz2Var2.c) && Objects.equals(xz2Var2.a, str13)) {
                            str5 = xz2Var2.c;
                            break;
                        }
                        i12 = i13;
                        arrayList = arrayList11;
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        arrayList9.add(str5);
                    }
                    if (i11 > 0) {
                        arrayList5.add(((cu) xm4Var.get(i11)).a.c);
                        arrayList6.add(((cu) xm4Var.get(i11)).a.d);
                    }
                    i11++;
                    j = j3;
                }
                j2 = j;
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList8);
                if (!arrayList10.isEmpty()) {
                    bundle.putIntegerArrayList("autoPayBalanceThresholdList", arrayList10);
                }
                if (!arrayList7.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList7);
                }
                if (!arrayList9.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList9);
                }
                if (!arrayList5.isEmpty()) {
                    bundle.putStringArrayList("additionalSkus", arrayList5);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList6);
                }
            } else {
                ArrayList<String> arrayList12 = new ArrayList<>();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                Iterator it3 = arrayList2.iterator();
                if (it3.hasNext()) {
                    it3.next().getClass();
                    m51.t();
                    return null;
                }
                if (!arrayList12.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList12);
                }
                if (arrayList2.size() > 1) {
                    ArrayList<String> arrayList13 = new ArrayList<>(arrayList2.size() - 1);
                    ArrayList<String> arrayList14 = new ArrayList<>(arrayList2.size() - 1);
                    if (arrayList2.size() > 1) {
                        arrayList2.get(1).getClass();
                        m51.t();
                        return null;
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList13);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList14);
                }
                j2 = j;
            }
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.o) {
                fu fuVar10 = jo4.l;
                q(21, fuVar10, j2, false);
                A(fuVar10);
                return fuVar10;
            }
            if (TextUtils.isEmpty(cuVar.a.b.optString("packageName"))) {
                z2 = false;
            } else {
                bundle.putString("skuPackageName", cuVar.a.b.optString("packageName"));
                z2 = true;
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("accountName", null);
            }
            Intent intent = activity.getIntent();
            if (intent == null) {
                tm4.h("BillingClient", "Activity's intent is null.");
            } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                bundle.putString("proxyPackage", stringExtra);
                try {
                    bundle.putString("proxyPackageVersion", this.g.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                } catch (PackageManager.NameNotFoundException unused) {
                    bundle.putString("proxyPackageVersion", "package not found");
                }
            }
            if (this.x) {
                i2 = 28;
            } else if (this.r && !xm4Var.isEmpty()) {
                i2 = 17;
            } else if (this.p && z2) {
                i2 = 15;
            } else {
                i2 = this.n ? 9 : 6;
            }
            final int i14 = i2;
            final String str14 = str2;
            final String str15 = str7;
            futureE = e(new Callable(i14, str14, str15, sdVar, bundle) { // from class: rl4
                public final /* synthetic */ int b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ Bundle e;

                {
                    this.e = bundle;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundleC;
                    am4 am4Var;
                    au auVar = this.a;
                    int i15 = this.b;
                    String str16 = this.c;
                    String str17 = this.d;
                    Bundle bundle2 = this.e;
                    try {
                        synchronized (auVar.a) {
                            am4Var = auVar.i;
                        }
                        if (am4Var == null) {
                            return tm4.c(107, jo4.h);
                        }
                        return ((yl4) am4Var).i(i15, auVar.g.getPackageName(), str16, str17, bundle2);
                    } catch (DeadObjectException e2) {
                        fu fuVar11 = jo4.h;
                        String strA = go4.a(e2);
                        bundleC = tm4.c(5, fuVar11);
                        if (strA != null) {
                            bundleC.putString("ADDITIONAL_LOG_DETAILS", strA);
                        }
                        return bundleC;
                    } catch (Exception e3) {
                        fu fuVar12 = jo4.f;
                        String strA2 = go4.a(e3);
                        bundleC = tm4.c(5, fuVar12);
                        if (strA2 != null) {
                            bundleC.putString("ADDITIONAL_LOG_DETAILS", strA2);
                        }
                        return bundleC;
                    }
                }
            }, 5000L, null, this.e, d());
            str3 = str15;
            r6 = bundle;
        } else {
            j = r4;
            j2 = j;
            z = false;
            String str16 = str7;
            r6 = 5000;
            futureE = e(new tl4(this, str2, str16, 0), 5000L, null, this.e, d());
            str3 = str16;
        }
        try {
            if (futureE == null) {
                try {
                    fu fuVar11 = jo4.b;
                    q(25, fuVar11, j2, z);
                    A(fuVar11);
                    return fuVar11;
                } catch (CancellationException e2) {
                    e = e2;
                    r8 = z;
                    r5 = j2;
                    tm4.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    fu fuVar12 = jo4.i;
                    r(4, fuVar12, go4.a(e), r5, r8);
                    A(fuVar12);
                    return fuVar12;
                } catch (TimeoutException e3) {
                    e = e3;
                    r8 = z;
                    r5 = j2;
                    tm4.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    fu fuVar13 = jo4.i;
                    r(4, fuVar13, go4.a(e), r5, r8);
                    A(fuVar13);
                    return fuVar13;
                } catch (Exception e4) {
                    e = e4;
                    r7 = z;
                    r4 = j2;
                    tm4.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                    fu fuVar14 = jo4.h;
                    r(5, fuVar14, go4.a(e), r4, r7);
                    A(fuVar14);
                    return fuVar14;
                }
            }
            boolean z4 = z;
            long j4 = j2;
            Bundle bundle2 = (Bundle) futureE.get(5000L, TimeUnit.MILLISECONDS);
            int iA = tm4.a("BillingClient", bundle2);
            String strF = tm4.f("BillingClient", bundle2);
            if (iA == 0) {
                Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                intent2.putExtra("BUY_INTENT", (PendingIntent) bundle2.getParcelable("BUY_INTENT"));
                intent2.putExtra("billingClientTransactionId", j4);
                intent2.putExtra("wasServiceAutoReconnected", z4);
                activity.startActivity(intent2);
                return jo4.g;
            }
            tm4.h("BillingClient", il4.a(iA, "Unable to buy item, Error response code: "));
            fu fuVarA3 = jo4.a(iA, strF);
            if (bundle2 == null) {
                i = 1;
                iD = 1;
            } else {
                try {
                    Object obj3 = bundle2.get("LOG_REASON");
                    if (obj3 != null) {
                        if (obj3 instanceof Integer) {
                            iD = ud2.d(((Integer) obj3).intValue());
                            i = 1;
                        } else {
                            tm4.h("BillingClient", "Unexpected type for bundle log reason: " + obj3.getClass().getName());
                        }
                    }
                } catch (Throwable th2) {
                    tm4.h("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th2.getMessage())));
                }
                i = 1;
                iD = 1;
            }
            if (iD == i) {
                iD = 23;
            }
            if (bundle2 == null) {
                string = null;
            } else {
                try {
                    string = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                } catch (Throwable th3) {
                    tm4.h("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th3.getMessage())));
                    string = null;
                }
            }
            try {
                r(iD, fuVarA3, string, j4, z4);
                A(fuVarA3);
                return fuVarA3;
            } catch (CancellationException e5) {
                e = e5;
                r5 = j4;
                r8 = z4;
                tm4.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                fu fuVar15 = jo4.i;
                r(4, fuVar15, go4.a(e), r5, r8);
                A(fuVar15);
                return fuVar15;
            } catch (TimeoutException e6) {
                e = e6;
                r5 = j4;
                r8 = z4;
                tm4.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                fu fuVar16 = jo4.i;
                r(4, fuVar16, go4.a(e), r5, r8);
                A(fuVar16);
                return fuVar16;
            } catch (Exception e7) {
                e = e7;
                r4 = j4;
                r7 = z4;
                tm4.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                fu fuVar17 = jo4.h;
                r(5, fuVar17, go4.a(e), r4, r7);
                A(fuVar17);
                return fuVar17;
            }
        } catch (CancellationException e8) {
            e = e8;
            r5 = str3;
            r8 = r6;
        } catch (TimeoutException e9) {
            e = e9;
            r5 = str3;
            r8 = r6;
        } catch (Exception e10) {
            e = e10;
            r4 = str3;
            r7 = r6;
        }
    }

    public void b(c23 c23Var, bu buVar) {
        if (e(new tl4(this, buVar, c23Var, 1), 30000L, new io4(this, 18, buVar), Looper.myLooper() == null ? this.e : new Handler(Looper.myLooper()), d()) == null) {
            fu fuVarH = h();
            o(25, 7, fuVarH);
            pm4 pm4Var = xm4.d;
            cn4 cn4Var = cn4.m;
            ag0 ag0Var = buVar.a;
            fuVarH.getClass();
            ag0Var.M(new b03(fuVarH, cn4Var));
        }
    }

    public void c(sz0 sz0Var) {
        w(sz0Var);
    }

    public final synchronized ExecutorService d() {
        try {
            if (this.A == null) {
                this.A = Executors.newFixedThreadPool(tm4.a, new mm4(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.A;
    }

    public final gj f(fu fuVar, int i, String str, Exception exc) {
        tm4.i("BillingClient", str, exc);
        try {
            s(go4.b(i, 7, fuVar, go4.a(exc), gr4.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            tm4.i("BillingClient", "Unable to log.", th);
        }
        return new gj(fuVar.a, fuVar.c, new ArrayList(), new ArrayList());
    }

    public final fu g() {
        tm4.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        br4 br4VarQ = cr4.q();
        br4VarQ.b();
        cr4.p((cr4) br4VarQ.d, 6);
        bs4 bs4VarP = cs4.p();
        bs4VarP.b();
        cs4.u((cs4) bs4VarP.d);
        bs4VarP.c(false);
        bs4VarP.d();
        br4VarQ.b();
        cr4.u((cr4) br4VarQ.d, (cs4) bs4VarP.a());
        t((cr4) br4VarQ.a());
        return jo4.g;
    }

    public final fu h() {
        int[] iArr = {0, 3};
        synchronized (this.a) {
            for (int i = 0; i < 2; i++) {
                if (this.b == iArr[i]) {
                    return jo4.h;
                }
            }
            return jo4.f;
        }
    }

    public final void i() {
        if (TextUtils.isEmpty(null)) {
            this.g.getPackageName();
        }
    }

    public final bi4 n(fu fuVar, int i, String str, Exception exc) {
        try {
            s(go4.b(i, 9, fuVar, go4.a(exc), gr4.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            tm4.i("BillingClient", "Unable to log.", th);
        }
        tm4.i("BillingClient", str, exc);
        return new bi4(fuVar, (ArrayList) null);
    }

    public final void o(int i, int i2, fu fuVar) {
        try {
            int i3 = go4.a;
            s(go4.b(i, i2, fuVar, null, gr4.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            tm4.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void p(int i, fu fuVar, long j) {
        try {
            int i2 = go4.a;
            try {
                this.h.m(go4.b(i, 2, fuVar, null, gr4.BROADCAST_ACTION_UNSPECIFIED), this.l, j);
            } catch (Throwable th) {
                tm4.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            tm4.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void q(int i, fu fuVar, long j, boolean z) {
        try {
            int i2 = go4.a;
            try {
                this.h.o(go4.b(i, 2, fuVar, null, gr4.BROADCAST_ACTION_UNSPECIFIED), this.l, j, z);
            } catch (Throwable th) {
                tm4.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            tm4.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void r(int i, fu fuVar, String str, long j, boolean z) {
        try {
            int i2 = go4.a;
            try {
                this.h.o(go4.b(i, 2, fuVar, str, gr4.BROADCAST_ACTION_UNSPECIFIED), this.l, j, z);
            } catch (Throwable th) {
                tm4.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            tm4.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void s(ar4 ar4Var) {
        try {
            fy2 fy2Var = this.h;
            int i = this.l;
            fy2Var.getClass();
            try {
                kr4 kr4Var = (kr4) ((lr4) fy2Var.c).l();
                kr4Var.b();
                lr4.C((lr4) kr4Var.d, i);
                fy2Var.c = (lr4) kr4Var.a();
                fy2Var.l(ar4Var);
            } catch (Throwable th) {
                tm4.i("BillingLogger", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            tm4.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void t(cr4 cr4Var) {
        try {
            fy2 fy2Var = this.h;
            int i = this.l;
            fy2Var.getClass();
            try {
                kr4 kr4Var = (kr4) ((lr4) fy2Var.c).l();
                kr4Var.b();
                lr4.C((lr4) kr4Var.d, i);
                lr4 lr4Var = (lr4) kr4Var.a();
                fy2Var.c = lr4Var;
                try {
                    fy2Var.v(cr4Var, lr4Var);
                } catch (Throwable th) {
                    tm4.i("BillingLogger", "Unable to log.", th);
                }
            } catch (Throwable th2) {
                tm4.i("BillingLogger", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            tm4.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void u(int i, fu fuVar) {
        try {
            int i2 = go4.a;
            zq4 zq4Var = (zq4) go4.b(i, 6, fuVar, null, gr4.BROADCAST_ACTION_UNSPECIFIED).l();
            bs4 bs4VarP = cs4.p();
            bs4VarP.c(false);
            bs4VarP.d();
            zq4Var.d(bs4VarP);
            s((ar4) zq4Var.a());
        } catch (Throwable th) {
            tm4.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void v(int i) {
        String str;
        String str2;
        synchronized (this.a) {
            try {
                if (this.b == 3) {
                    return;
                }
                int i2 = this.b;
                if (i2 == 0) {
                    str = "DISCONNECTED";
                } else if (i2 != 1) {
                    str = i2 != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str = "CONNECTING";
                }
                if (i == 0) {
                    str2 = "DISCONNECTED";
                } else if (i != 1) {
                    str2 = i != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str2 = "CONNECTING";
                }
                tm4.g("BillingClient", "Setting clientState from " + str + " to " + str2);
                this.b = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(sz0 sz0Var) {
        int i;
        fu fuVarG;
        fu fuVar;
        synchronized (this.a) {
            try {
                if (z()) {
                    fuVarG = g();
                } else {
                    if (this.b == 1) {
                        tm4.h("BillingClient", "Client is already in the process of connecting to billing service.");
                        fuVar = jo4.c;
                        u(37, fuVar);
                    } else if (this.b == 3) {
                        tm4.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                        fuVar = jo4.h;
                        u(38, fuVar);
                    } else {
                        v(1);
                        x();
                        tm4.g("BillingClient", "Starting in-app billing setup.");
                        this.j = new rm4(this, sz0Var);
                        rm4 rm4Var = this.j;
                        synchronized (rm4Var.d.a) {
                            lm4 lm4Var = rm4Var.b;
                            lm4Var.c = 0L;
                            lm4Var.b = false;
                            lm4Var.a();
                        }
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> listQueryIntentServices = this.g.getPackageManager().queryIntentServices(intent, 0);
                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                            i = 41;
                        } else {
                            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                            i = 40;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                    tm4.h("BillingClient", "The device doesn't have valid Play Store.");
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.c);
                                    synchronized (this.a) {
                                        try {
                                            if (this.b == 2) {
                                                fuVarG = g();
                                            } else if (this.b != 1) {
                                                tm4.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                fuVar = jo4.h;
                                                u(105, fuVar);
                                            } else {
                                                rm4 rm4Var2 = this.j;
                                                if (this.g.bindService(intent2, rm4Var2, 1)) {
                                                    tm4.g("BillingClient", "Service was bonded successfully.");
                                                    fuVarG = null;
                                                } else {
                                                    tm4.h("BillingClient", "Connection to Billing service is blocked.");
                                                    i = 39;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            } else {
                                tm4.h("BillingClient", "The device doesn't have valid Play Store.");
                            }
                        }
                        v(0);
                        tm4.g("BillingClient", "Billing service unavailable on device.");
                        fu fuVar2 = jo4.a;
                        u(i, fuVar2);
                        fuVarG = fuVar2;
                    }
                    fuVarG = fuVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (fuVarG != null) {
            sz0Var.u(fuVarG);
        }
    }

    public final void x() {
        synchronized (this.a) {
            if (this.j != null) {
                try {
                    this.g.unbindService(this.j);
                    this.i = null;
                    this.j = null;
                } catch (Throwable th) {
                    try {
                        tm4.i("BillingClient", "There was an exception while unbinding service!", th);
                        this.i = null;
                        this.j = null;
                    } catch (Throwable th2) {
                        this.i = null;
                        this.j = null;
                        throw th2;
                    }
                }
            }
        }
    }

    public final boolean y(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        im4 im4Var = this.C;
        if (im4Var == null) {
            m51.x("ticker");
            return false;
        }
        long jB = im4Var.b();
        int i = ki4.b;
        long jB2 = j;
        for (int i2 = 1; i2 <= i; i2++) {
            try {
                if (Math.max(0L, jB2) <= 0) {
                    tm4.h("BillingClient", "No time remaining for reconnection attempt.");
                    return z();
                }
                tm4.g("BillingClient", "Already connected or not opted into auto reconnection.");
                fu fuVar = jo4.g;
                timeUnit.getClass();
                int i3 = fuVar.a;
                if (i3 == 0) {
                    tm4.g("BillingClient", "Reconnection succeeded with result: " + i3);
                    return z();
                }
                tm4.h("BillingClient", "Reconnection failed with result: " + i3);
                jB2 = j - (((im4Var.b() - jB) + 0) / 1000000);
                long jPow = ((long) Math.pow(2.0d, i2 - 1)) * 1000;
                if (jB2 < jPow) {
                    tm4.h("BillingClient", "Reconnection failed due to timeout limit reached.");
                    return z();
                }
                if (i2 < i && jPow > 0) {
                    try {
                        Thread.sleep(jPow);
                        jB2 = j - (((im4Var.b() - jB) + 0) / 1000000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        tm4.i("BillingClient", "Error sleeping during reconnection attempt: ", e);
                    }
                }
            } catch (Exception e2) {
                if (e2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                tm4.i("BillingClient", "Error during reconnection attempt: ", e2);
            }
        }
        tm4.h("BillingClient", "Max retries reached.");
        return z();
    }

    public final boolean z() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.b == 2 && this.i != null && this.j != null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
