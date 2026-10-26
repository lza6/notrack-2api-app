package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class i20 implements f64 {
    public final sz0 a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final ld0 e;
    public final ld0 f;
    public final int g;

    public i20(Context context, ld0 ld0Var, ld0 ld0Var2) {
        at1 at1Var = new at1();
        qn qnVar = qn.a;
        at1Var.a(jt.class, qnVar);
        at1Var.a(io.class, qnVar);
        tn tnVar = tn.a;
        at1Var.a(s72.class, tnVar);
        at1Var.a(po.class, tnVar);
        rn rnVar = rn.a;
        at1Var.a(jd0.class, rnVar);
        at1Var.a(jo.class, rnVar);
        pn pnVar = pn.a;
        at1Var.a(r9.class, pnVar);
        at1Var.a(go.class, pnVar);
        sn snVar = sn.a;
        at1Var.a(p72.class, snVar);
        at1Var.a(oo.class, snVar);
        un unVar = un.a;
        at1Var.a(rk2.class, unVar);
        at1Var.a(ro.class, unVar);
        at1Var.l = true;
        this.a = new sz0(at1Var);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(oz.c);
        this.e = ld0Var2;
        this.f = ld0Var;
        this.g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(fq2.m("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:30:0x010b  */
    public final mo a(mo moVar) {
        int type;
        int subtype;
        HashMap map;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        f13 f13VarC = moVar.c();
        int i = Build.VERSION.SDK_INT;
        HashMap map2 = (HashMap) f13VarC.e;
        if (map2 == null) {
            u41.r("Property \"autoMetadata\" has not been set");
            return null;
        }
        map2.put("sdk-version", String.valueOf(i));
        f13VarC.a("model", Build.MODEL);
        f13VarC.a("hardware", Build.HARDWARE);
        f13VarC.a("device", Build.DEVICE);
        f13VarC.a("product", Build.PRODUCT);
        f13VarC.a("os-uild", Build.ID);
        f13VarC.a("manufacturer", Build.MANUFACTURER);
        f13VarC.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map3 = (HashMap) f13VarC.e;
        if (map3 == null) {
            u41.r("Property \"autoMetadata\" has not been set");
            return null;
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = qk2.c;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = (HashMap) f13VarC.e;
        if (map4 == null) {
            u41.r("Property \"autoMetadata\" has not been set");
            return null;
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = pk2.c;
                subtype = 100;
            } else if (((pk2) pk2.c.get(subtype)) == null) {
            }
            map = (HashMap) f13VarC.e;
            if (map != null) {
                u41.r("Property \"autoMetadata\" has not been set");
                return null;
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            f13VarC.a("country", Locale.getDefault().getCountry());
            f13VarC.a("locale", Locale.getDefault().getLanguage());
            Context context = this.c;
            f13VarC.a("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                xr0.U("CctTransportBackend", "Unable to find version code for package", e);
            }
            f13VarC.a("application_build", Integer.toString(i2));
            return f13VarC.c();
        }
        SparseArray sparseArray3 = pk2.c;
        subtype = 0;
        map = (HashMap) f13VarC.e;
        if (map != null) {
            u41.r("Property \"autoMetadata\" has not been set");
            return null;
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        f13VarC.a("country", Locale.getDefault().getCountry());
        f13VarC.a("locale", Locale.getDefault().getLanguage());
        Context context2 = this.c;
        f13VarC.a("mcc_mnc", ((TelephonyManager) context2.getSystemService("phone")).getSimOperator());
        i2 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        f13VarC.a("application_build", Integer.toString(i2));
        return f13VarC.c();
    }
}
