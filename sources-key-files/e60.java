package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.os.Build;
import java.io.Serializable;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLException;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class e60 {
    public final tu2 a;
    public final Context b;
    public final ci4 c;
    public final b13 d;
    public final jb e;
    public final bv0 f;
    public final fy2 g;
    public final yq3 h;
    public final yq3 i;
    public final kt1 j;
    public final tn2 k;
    public final String l;
    public final yq3 m;
    public final yq3 n;
    public final yq3 o;
    public final yq3 p;
    public final yq3 q;

    public e60(Context context) {
        tu2 tu2Var = new tu2(context);
        this.a = tu2Var;
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = new ci4(context, 14);
        applicationContext.getClass();
        this.d = new b13(applicationContext);
        this.e = new jb(applicationContext);
        this.f = new bv0(applicationContext);
        fy2 fy2Var = new fy2();
        int i = 0;
        fy2Var.c = new yq3(new s2(applicationContext, i));
        int i2 = 1;
        fy2Var.d = xr0.G(new f2(i2));
        this.g = fy2Var;
        this.h = new yq3(new g50(this, 6));
        this.i = new yq3(new g50(this, 7));
        this.j = xr0.G(new f2(11));
        sn2 sn2Var = new sn2();
        sn2Var.j = tu2Var;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        sn2Var.r = ka4.b(15L, timeUnit);
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        timeUnit2.getClass();
        sn2Var.s = ka4.b(0L, timeUnit2);
        sn2Var.c.add(new hx(this));
        this.k = new tn2(sn2Var);
        this.l = "https://notrack.ai";
        this.m = new yq3(new g50(this, 8));
        this.n = new yq3(new g50(this, 9));
        this.o = new yq3(new g50(this, 10));
        this.p = new yq3(new g50(this, i));
        this.q = new yq3(new g50(this, i2));
    }

    public static final String a(e60 e60Var) {
        ps2 ps2Var;
        Context context = e60Var.b;
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (Build.VERSION.SDK_INT >= 30) {
                InstallSourceInfo installSourceInfo = packageManager.getInstallSourceInfo(packageName);
                installSourceInfo.getClass();
                ps2Var = new ps2(g1.n(installSourceInfo), g1.A(installSourceInfo));
            } else {
                packageManager.getInstallerPackageName(packageName);
                ps2Var = new ps2("com.android.vending", "com.android.vending");
            }
            return (kr1.n((String) ps2Var.c, "com.android.vending") || kr1.n((String) ps2Var.d, "com.android.vending")) ? "play" : "other";
        } catch (Exception unused) {
            return "none";
        }
    }

    public static final l50 b(e60 e60Var, JSONObject jSONObject) {
        Iterator<String> itKeys;
        e60Var.getClass();
        if (!jSONObject.has("scope")) {
            return null;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("limits");
        String strOptString = jSONObject.optString("scope");
        strOptString.getClass();
        String strOptString2 = jSONObject.optString("plan", "free");
        strOptString2.getClass();
        int iOptInt = jSONObject.optInt("limit", 0);
        int iOptInt2 = jSONObject.optInt("retry_after", 0);
        o92 o92Var = new o92();
        if (jSONObjectOptJSONObject != null && (itKeys = jSONObjectOptJSONObject.keys()) != null) {
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                next.getClass();
                o92Var.put(next, Integer.valueOf(jSONObjectOptJSONObject.optInt(next)));
            }
        }
        return new l50(iOptInt, iOptInt2, strOptString, strOptString2, o92Var.b());
    }

    public static final m50 c(e60 e60Var, JSONObject jSONObject) {
        e60Var.getClass();
        if (!jSONObject.has("left")) {
            return null;
        }
        String strOptString = jSONObject.optString("plan", "free");
        strOptString.getClass();
        return new m50(strOptString, jSONObject.optInt("limit", 0), jSONObject.optInt("left", 0));
    }

    public static k81 e(e60 e60Var, String str, String str2, ArrayList arrayList, String str3, String str4, int i) {
        boolean z = (i & 8) == 0;
        boolean z2 = (i & 16) == 0;
        String str5 = (i & 32) != 0 ? null : str3;
        String str6 = (i & 64) != 0 ? null : str4;
        e60Var.getClass();
        str.getClass();
        y50 y50Var = new y50(e60Var, str, str2, arrayList, z, z2, str5, str6, null);
        fy fyVar = fy.c;
        x21 x21Var = x21.c;
        e00 e00Var = new e00(y50Var, x21Var, -2, fyVar);
        jt0 jt0Var = sw0.a;
        at0 at0Var = at0.c;
        if (at0Var.get(bg1.s) == null) {
            return at0Var != x21Var ? gm4.y(e00Var, at0Var, 0, null, 6) : e00Var;
        }
        m51.z(at0Var, "Flow context cannot contain job in it. Had ");
        return null;
    }

    public static k50 l(String str) {
        Object i63Var;
        Iterator<String> itKeys;
        Iterator<String> itKeys2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("strings");
            o92 o92Var = new o92();
            if (jSONObjectOptJSONObject != null && (itKeys2 = jSONObjectOptJSONObject.keys()) != null) {
                while (itKeys2.hasNext()) {
                    String next = itKeys2.next();
                    String strOptString = jSONObjectOptJSONObject.optString(next);
                    strOptString.getClass();
                    if (mo3.C0(strOptString)) {
                        strOptString = null;
                    }
                    if (strOptString != null) {
                        o92Var.put(next, strOptString);
                    }
                }
            }
            o92 o92VarB = o92Var.b();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("examples");
            c52 c52VarA = kr1.A();
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject2 != null) {
                        String strOptString2 = jSONObjectOptJSONObject2.optString("label");
                        String strOptString3 = jSONObjectOptJSONObject2.optString("text");
                        strOptString2.getClass();
                        if (!mo3.C0(strOptString2)) {
                            strOptString3.getClass();
                            if (!mo3.C0(strOptString3)) {
                                c52VarA.add(new ps2(strOptString2, strOptString3));
                            }
                        }
                    }
                }
            }
            c52 c52VarQ = kr1.q(c52VarA);
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("input_limits");
            boolean zOptBoolean = jSONObject.optBoolean("enabled", true);
            int iX = py.x(jSONObject.optInt("max", 2000), 100, 20000);
            List listL0 = ke0.L0(12, c52VarQ);
            o92 o92Var2 = new o92();
            if (jSONObjectOptJSONObject3 != null && (itKeys = jSONObjectOptJSONObject3.keys()) != null) {
                while (itKeys.hasNext()) {
                    String next2 = itKeys.next();
                    int iOptInt = jSONObjectOptJSONObject3.optInt(next2);
                    Integer numValueOf = Integer.valueOf(iOptInt);
                    if (iOptInt < 4000) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        int iIntValue = numValueOf.intValue();
                        next2.getClass();
                        if (iIntValue > 50000) {
                            iIntValue = 50000;
                        }
                        o92Var2.put(next2, Integer.valueOf(iIntValue));
                    }
                }
            }
            i63Var = new k50(zOptBoolean, iX, o92VarB, listL0, o92Var2.b());
        } catch (Throwable th) {
            i63Var = new i63(th);
        }
        return (k50) (i63Var instanceof i63 ? null : i63Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, uo0 uo0Var) throws Throwable {
        v50 v50Var;
        if (uo0Var instanceof v50) {
            v50Var = (v50) uo0Var;
            int i = v50Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                v50Var.h = i - Integer.MIN_VALUE;
            } else {
                v50Var = new v50(this, uo0Var);
            }
        } else {
            v50Var = new v50(this, uo0Var);
        }
        Object objA = v50Var.c;
        int i2 = v50Var.h;
        so0 so0Var = null;
        if (i2 == 0) {
            g13.O(objA);
            jt0 jt0Var = sw0.a;
            at0 at0Var = at0.c;
            w50 w50Var = new w50(this, str, so0Var, 0);
            v50Var.h = 1;
            objA = g60.a(at0Var, w50Var, v50Var);
            hq0 hq0Var = hq0.c;
            if (objA == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(objA);
        }
        return ((j63) objA).c;
    }

    public final k2 f() {
        return (k2) this.h.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(String str, uo0 uo0Var) throws Throwable {
        a60 a60Var;
        if (uo0Var instanceof a60) {
            a60Var = (a60) uo0Var;
            int i = a60Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                a60Var.h = i - Integer.MIN_VALUE;
            } else {
                a60Var = new a60(this, uo0Var);
            }
        } else {
            a60Var = new a60(this, uo0Var);
        }
        Object objA = a60Var.c;
        int i2 = a60Var.h;
        so0 so0Var = null;
        if (i2 == 0) {
            g13.O(objA);
            jt0 jt0Var = sw0.a;
            at0 at0Var = at0.c;
            w50 w50Var = new w50(this, str, so0Var, 2);
            a60Var.h = 1;
            objA = g60.a(at0Var, w50Var, a60Var);
            hq0 hq0Var = hq0.c;
            if (objA == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(objA);
        }
        return ((j63) objA).c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(uo0 uo0Var) throws Throwable {
        b60 b60Var;
        if (uo0Var instanceof b60) {
            b60Var = (b60) uo0Var;
            int i = b60Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                b60Var.h = i - Integer.MIN_VALUE;
            } else {
                b60Var = new b60(this, uo0Var);
            }
        } else {
            b60Var = new b60(this, uo0Var);
        }
        Object objA = b60Var.c;
        int i2 = b60Var.h;
        so0 so0Var = null;
        if (i2 == 0) {
            g13.O(objA);
            jt0 jt0Var = sw0.a;
            at0 at0Var = at0.c;
            r50 r50Var = new r50(this, so0Var, 2);
            b60Var.h = 1;
            objA = g60.a(at0Var, r50Var, b60Var);
            hq0 hq0Var = hq0.c;
            if (objA == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(objA);
        }
        return ((j63) objA).c;
    }

    public final yg1 i() {
        return (yg1) this.o.getValue();
    }

    public final SharedPreferences j() {
        return (SharedPreferences) this.p.getValue();
    }

    public final String k(Throwable th, boolean z) {
        th.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.b.getSystemService(ConnectivityManager.class);
        if (connectivityManager != null && connectivityManager.getActiveNetwork() == null) {
            return "OFFLINE";
        }
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return "DNS";
            }
            if (th instanceof SocketTimeoutException) {
                return "TIMEOUT";
            }
            if (th instanceof SSLException) {
                return "TLS";
            }
            if (th instanceof ConnectException) {
                return "CONNECT";
            }
            if (th instanceof NoRouteToHostException) {
                return "ROUTE";
            }
            th = th.getCause();
        }
        return z ? "STREAM" : "NET";
    }

    public final String m() {
        String string = j().getString("persona", null);
        if (string == null) {
            return "normal";
        }
        String str = g60.a.contains(string) ? string : null;
        return str == null ? "normal" : str;
    }

    public final Object n(String str, String str2, String str3, String str4, mq3 mq3Var) {
        jt0 jt0Var = sw0.a;
        Object objA = g60.a(at0.c, new z50(str, str2, str4, str3, this, null, 1), mq3Var);
        return objA == hq0.c ? objA : w84.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object o(String str, byte[] bArr, uo0 uo0Var) {
        d60 d60Var;
        if (uo0Var instanceof d60) {
            d60Var = (d60) uo0Var;
            int i = d60Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                d60Var.h = i - Integer.MIN_VALUE;
            } else {
                d60Var = new d60(this, uo0Var);
            }
        } else {
            d60Var = new d60(this, uo0Var);
        }
        Object objA = d60Var.c;
        int i2 = d60Var.h;
        if (i2 == 0) {
            g13.O(objA);
            jt0 jt0Var = sw0.a;
            at0 at0Var = at0.c;
            x50 x50Var = new x50(str, (Serializable) bArr, this, (so0) null, 3);
            d60Var.h = 1;
            objA = g60.a(at0Var, x50Var, d60Var);
            hq0 hq0Var = hq0.c;
            if (objA == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(objA);
        }
        return ((j63) objA).c;
    }
}
