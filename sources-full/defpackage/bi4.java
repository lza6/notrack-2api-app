package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.common.api.Status;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public final class bi4 implements ps3, i21 {
    public Object c;
    public Object d;

    public bi4(int i) {
        switch (i) {
            case 12:
                this.c = Collections.synchronizedMap(new WeakHashMap());
                this.d = Collections.synchronizedMap(new WeakHashMap());
                break;
        }
    }

    public bi4(fu fuVar, ArrayList arrayList) {
        this.c = arrayList;
        this.d = fuVar;
    }

    public /* synthetic */ bi4(Object obj, Object obj2) {
        this.c = obj;
        this.d = obj2;
    }

    public bi4(String[] strArr, jy jyVar) {
        this.d = jyVar;
        strArr.getClass();
        this.c = strArr;
    }

    @Override // defpackage.i21
    public Object a() {
        return (g94) this.c;
    }

    @Override // defpackage.i21
    public boolean b(CharSequence charSequence, int i, int i2, h74 h74Var) {
        if ((h74Var.c & 4) > 0) {
            return true;
        }
        if (((g94) this.c) == null) {
            this.c = new g94(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((qn0) this.d).getClass();
        ((g94) this.c).setSpan(new i74(h74Var), i, i2, 33);
        return true;
    }

    public d23 c() {
        String str = (String) this.d;
        if ("first_party".equals(str)) {
            u41.k("Serialized doc id must be provided for first party products.");
            return null;
        }
        if (((String) this.c) == null) {
            u41.k("Product id must be provided.");
            return null;
        }
        if (str != null) {
            return new d23(this);
        }
        u41.k("Product type must be provided.");
        return null;
    }

    @Override // defpackage.ps3
    public void d(am1 am1Var) {
        tm tmVar = (tm) this.d;
        tm.k(tmVar, new qm(am1Var != null ? gm4.e(am1Var, ((pm1) this.c).a, tmVar.x) : null));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    public CctBackendFactory e(String str) {
        Bundle bundle;
        Map map;
        Object obj;
        if (((Map) this.d) == null) {
            Context context = (Context) this.c;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), Uuid.SIZE_BITS);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                    if (bundle == null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap map2 = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            obj = bundle.get(str2);
                            if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String strTrim = str3.trim();
                                    if (!strTrim.isEmpty()) {
                                        map2.put(strTrim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = map2;
                    }
                    this.d = map;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            bundle = null;
            if (bundle == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map3 = new HashMap();
                while (r6.hasNext()) {
                    obj = bundle.get(str2);
                    if (!(obj instanceof String)) {
                    }
                }
                map = map3;
            }
            this.d = map;
        }
        String str4 = (String) ((Map) this.d).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e2);
            return null;
        } catch (InstantiationException e3) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e5);
            return null;
        }
    }

    public vb2 f() {
        return (vb2) ((ft2) this.d).getValue();
    }

    @Override // defpackage.ps3
    public void g(am1 am1Var) {
    }

    @Override // defpackage.ps3
    public void h(am1 am1Var) {
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0061  */
    /* JADX WARN: Code duplicated, block: B:14:0x006d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0095  */
    /* JADX WARN: Code duplicated, block: B:25:0x009d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f3  */
    public jq2 i(pm1 pm1Var, ai3 ai3Var) {
        Context context;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        LinkedHashMap linkedHashMap;
        Context context2 = pm1Var.a;
        ma3 ma3Var = pm1Var.r;
        wx2 wx2Var = pm1Var.s;
        String str = pm1Var.f;
        a71 a71Var = pm1Var.g;
        tz tzVar = pm1Var.k;
        tz tzVar2 = pm1Var.l;
        tz tzVar3 = pm1Var.m;
        f61 f61Var = sm1.b;
        Bitmap.Config config = (Bitmap.Config) y64.z(pm1Var, f61Var);
        f61 f61Var2 = sm1.g;
        boolean zBooleanValue = ((Boolean) y64.z(pm1Var, f61Var2)).booleanValue();
        f61 f61Var3 = rm1.a;
        if (!((List) y64.z(pm1Var, f61Var3)).isEmpty()) {
            context = context2;
            if (!vl.f0(ta4.a, (Bitmap.Config) y64.z(pm1Var, f61Var))) {
                z = false;
            }
            if (yh4.I((Bitmap.Config) y64.z(pm1Var, f61Var))) {
                if (yh4.I((Bitmap.Config) y64.z(pm1Var, f61Var)) || ((Boolean) y64.z(pm1Var, sm1.f)).booleanValue()) {
                    z2 = z;
                    if (((nh1) this.d).n(ai3Var)) {
                    }
                    if (z2 || !z3) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    if (zBooleanValue || !((List) y64.z(pm1Var, f61Var3)).isEmpty() || config == Bitmap.Config.ALPHA_8) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    Map map = pm1Var.v.n.a;
                    Map map2 = pm1Var.t.a;
                    map.getClass();
                    map2.getClass();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
                    linkedHashMap2.putAll(map2);
                    linkedHashMap = new LinkedHashMap(linkedHashMap2);
                    if (config != ((Bitmap.Config) y64.z(pm1Var, f61Var))) {
                        if (config != null) {
                            linkedHashMap.put(f61Var, config);
                        } else {
                            linkedHashMap.remove(f61Var);
                        }
                    }
                    if (z4 != ((Boolean) y64.z(pm1Var, f61Var2)).booleanValue()) {
                        linkedHashMap.put(f61Var2, Boolean.valueOf(z4));
                    }
                    return new jq2(context, ai3Var, ma3Var, wx2Var, str, a71Var, tzVar, tzVar2, tzVar3, new g61(av1.L(linkedHashMap)));
                }
                z2 = z;
                z3 = false;
                if (z2) {
                    config = Bitmap.Config.ARGB_8888;
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (zBooleanValue) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                Map map3 = pm1Var.v.n.a;
                Map map4 = pm1Var.t.a;
                map3.getClass();
                map4.getClass();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(map3);
                linkedHashMap3.putAll(map4);
                linkedHashMap = new LinkedHashMap(linkedHashMap3);
                if (config != ((Bitmap.Config) y64.z(pm1Var, f61Var))) {
                    if (config != null) {
                        linkedHashMap.put(f61Var, config);
                    } else {
                        linkedHashMap.remove(f61Var);
                    }
                }
                if (z4 != ((Boolean) y64.z(pm1Var, f61Var2)).booleanValue()) {
                    linkedHashMap.put(f61Var2, Boolean.valueOf(z4));
                }
                return new jq2(context, ai3Var, ma3Var, wx2Var, str, a71Var, tzVar, tzVar2, tzVar3, new g61(av1.L(linkedHashMap)));
            }
            z2 = z;
            z3 = true;
            if (z2) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.ARGB_8888;
            }
            if (zBooleanValue) {
                z4 = false;
            } else {
                z4 = false;
            }
            Map map5 = pm1Var.v.n.a;
            Map map6 = pm1Var.t.a;
            map5.getClass();
            map6.getClass();
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(map5);
            linkedHashMap4.putAll(map6);
            linkedHashMap = new LinkedHashMap(linkedHashMap4);
            if (config != ((Bitmap.Config) y64.z(pm1Var, f61Var))) {
                if (config != null) {
                    linkedHashMap.put(f61Var, config);
                } else {
                    linkedHashMap.remove(f61Var);
                }
            }
            if (z4 != ((Boolean) y64.z(pm1Var, f61Var2)).booleanValue()) {
                linkedHashMap.put(f61Var2, Boolean.valueOf(z4));
            }
            return new jq2(context, ai3Var, ma3Var, wx2Var, str, a71Var, tzVar, tzVar2, tzVar3, new g61(av1.L(linkedHashMap)));
        }
        context = context2;
        z = true;
        if (yh4.I((Bitmap.Config) y64.z(pm1Var, f61Var))) {
            if (yh4.I((Bitmap.Config) y64.z(pm1Var, f61Var))) {
                z2 = z;
                if (((nh1) this.d).n(ai3Var)) {
                }
                if (z2) {
                    config = Bitmap.Config.ARGB_8888;
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (zBooleanValue) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                Map map7 = pm1Var.v.n.a;
                Map map8 = pm1Var.t.a;
                map7.getClass();
                map8.getClass();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(map7);
                linkedHashMap5.putAll(map8);
                linkedHashMap = new LinkedHashMap(linkedHashMap5);
                if (config != ((Bitmap.Config) y64.z(pm1Var, f61Var))) {
                    if (config != null) {
                        linkedHashMap.put(f61Var, config);
                    } else {
                        linkedHashMap.remove(f61Var);
                    }
                }
                if (z4 != ((Boolean) y64.z(pm1Var, f61Var2)).booleanValue()) {
                    linkedHashMap.put(f61Var2, Boolean.valueOf(z4));
                }
                return new jq2(context, ai3Var, ma3Var, wx2Var, str, a71Var, tzVar, tzVar2, tzVar3, new g61(av1.L(linkedHashMap)));
            }
            z2 = z;
            z3 = false;
            if (z2) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.ARGB_8888;
            }
            if (zBooleanValue) {
                z4 = false;
            } else {
                z4 = false;
            }
            Map map9 = pm1Var.v.n.a;
            Map map10 = pm1Var.t.a;
            map9.getClass();
            map10.getClass();
            LinkedHashMap linkedHashMap6 = new LinkedHashMap(map9);
            linkedHashMap6.putAll(map10);
            linkedHashMap = new LinkedHashMap(linkedHashMap6);
            if (config != ((Bitmap.Config) y64.z(pm1Var, f61Var))) {
                if (config != null) {
                    linkedHashMap.put(f61Var, config);
                } else {
                    linkedHashMap.remove(f61Var);
                }
            }
            if (z4 != ((Boolean) y64.z(pm1Var, f61Var2)).booleanValue()) {
                linkedHashMap.put(f61Var2, Boolean.valueOf(z4));
            }
            return new jq2(context, ai3Var, ma3Var, wx2Var, str, a71Var, tzVar, tzVar2, tzVar3, new g61(av1.L(linkedHashMap)));
        }
        z2 = z;
        z3 = true;
        if (z2) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        if (zBooleanValue) {
            z4 = false;
        } else {
            z4 = false;
        }
        Map map11 = pm1Var.v.n.a;
        Map map12 = pm1Var.t.a;
        map11.getClass();
        map12.getClass();
        LinkedHashMap linkedHashMap7 = new LinkedHashMap(map11);
        linkedHashMap7.putAll(map12);
        linkedHashMap = new LinkedHashMap(linkedHashMap7);
        if (config != ((Bitmap.Config) y64.z(pm1Var, f61Var))) {
            if (config != null) {
                linkedHashMap.put(f61Var, config);
            } else {
                linkedHashMap.remove(f61Var);
            }
        }
        if (z4 != ((Boolean) y64.z(pm1Var, f61Var2)).booleanValue()) {
            linkedHashMap.put(f61Var2, Boolean.valueOf(z4));
        }
        return new jq2(context, ai3Var, ma3Var, wx2Var, str, a71Var, tzVar, tzVar2, tzVar3, new g61(av1.L(linkedHashMap)));
    }

    public jq2 j(jq2 jq2Var) {
        g61 g61Var;
        boolean z;
        g61 g61Var2 = jq2Var.j;
        f61 f61Var = sm1.b;
        if (!yh4.I((Bitmap.Config) y64.A(jq2Var, f61Var)) || ((nh1) this.d).i()) {
            g61Var = g61Var2;
            z = false;
        } else {
            g61Var2.getClass();
            Map map = g61Var2.a;
            map.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (config != null) {
                linkedHashMap.put(f61Var, config);
            } else {
                linkedHashMap.remove(f61Var);
            }
            g61 g61Var3 = new g61(av1.L(linkedHashMap));
            z = true;
            g61Var = g61Var3;
        }
        return z ? new jq2(jq2Var.a, jq2Var.b, jq2Var.c, jq2Var.d, jq2Var.e, jq2Var.f, jq2Var.g, jq2Var.h, jq2Var.i, g61Var) : jq2Var;
    }

    public void k(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.c)) {
            map = new HashMap((Map) this.c);
        }
        synchronized (((Map) this.d)) {
            map2 = new HashMap((Map) this.d);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                m51.t();
                return;
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((us3) entry2.getKey()).a(new ug(status));
            }
        }
    }
}
