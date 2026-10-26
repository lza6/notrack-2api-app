package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import app.template.extension.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ca4 {
    public final Context a;
    public final zd2 b;
    public final o83 c;
    public final ci4 d;
    public final Executor e;
    public final o83 f;
    public final ld0 g;
    public final ld0 h;
    public final o83 i;

    public ca4(Context context, zd2 zd2Var, o83 o83Var, ci4 ci4Var, Executor executor, o83 o83Var2, ld0 ld0Var, ld0 ld0Var2, o83 o83Var3) {
        this.a = context;
        this.b = zd2Var;
        this.c = o83Var;
        this.d = ci4Var;
        this.e = executor;
        this.f = o83Var2;
        this.g = ld0Var;
        this.h = ld0Var2;
        this.i = o83Var3;
    }

    public final void a(final vo voVar, int i) {
        byte[] bArr;
        long j;
        ho hoVar;
        String str;
        ho hoVar2;
        int i2;
        jl jlVarF;
        String str2;
        Integer numValueOf;
        s44 s44Var;
        final ca4 ca4Var = this;
        final vo voVar2 = voVar;
        byte[] bArr2 = voVar2.b;
        f64 f64VarA = ca4Var.b.a(voVar2.a);
        long jMax = 0;
        while (true) {
            final int i3 = 0;
            xq3 xq3Var = new xq3(ca4Var) { // from class: aa4
                public final /* synthetic */ ca4 d;

                {
                    this.d = ca4Var;
                }

                @Override // defpackage.xq3
                public final Object d() {
                    Boolean bool;
                    int i4 = i3;
                    vo voVar3 = voVar2;
                    ca4 ca4Var2 = this.d;
                    switch (i4) {
                        case 0:
                            o83 o83Var = ca4Var2.c;
                            SQLiteDatabase sQLiteDatabaseA = o83Var.a();
                            sQLiteDatabaseA.beginTransaction();
                            try {
                                Long lC = o83.c(sQLiteDatabaseA, voVar3);
                                if (lC == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = o83Var.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lC.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseA.setTransactionSuccessful();
                                sQLiteDatabaseA.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseA.endTransaction();
                                throw th2;
                            }
                        default:
                            o83 o83Var2 = ca4Var2.c;
                            o83Var2.getClass();
                            return (Iterable) o83Var2.h(new nj1(o83Var2, 2, voVar3));
                    }
                }
            };
            o83 o83Var = ca4Var.f;
            if (!((Boolean) o83Var.x(xq3Var)).booleanValue()) {
                o83Var.x(new l83(jMax, ca4Var, voVar2));
                return;
            }
            final int i4 = 1;
            final Iterable iterable = (Iterable) o83Var.x(new xq3(ca4Var) { // from class: aa4
                public final /* synthetic */ ca4 d;

                {
                    this.d = ca4Var;
                }

                @Override // defpackage.xq3
                public final Object d() {
                    Boolean bool;
                    int i5 = i4;
                    vo voVar3 = voVar2;
                    ca4 ca4Var2 = this.d;
                    switch (i5) {
                        case 0:
                            o83 o83Var2 = ca4Var2.c;
                            SQLiteDatabase sQLiteDatabaseA = o83Var2.a();
                            sQLiteDatabaseA.beginTransaction();
                            try {
                                Long lC = o83.c(sQLiteDatabaseA, voVar3);
                                if (lC == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = o83Var2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lC.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseA.setTransactionSuccessful();
                                sQLiteDatabaseA.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseA.endTransaction();
                                throw th2;
                            }
                        default:
                            o83 o83Var3 = ca4Var2.c;
                            o83Var3.getClass();
                            return (Iterable) o83Var3.h(new nj1(o83Var3, 2, voVar3));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (f64VarA == null) {
                xr0.S("Uploader", "Unknown backend for %s, deleting event batch for it...", voVar2);
                hoVar2 = new ho(-1L, 3);
                bArr = bArr2;
                j = jMax;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((so) it.next()).c);
                }
                if (bArr2 != null) {
                    o83 o83Var2 = ca4Var.i;
                    Objects.requireNonNull(o83Var2);
                    kd0 kd0Var = (kd0) o83Var.x(new y94(o83Var2, i3));
                    f13 f13Var = new f13();
                    f13Var.e = new HashMap();
                    f13Var.c = Long.valueOf(ca4Var.g.a());
                    f13Var.d = Long.valueOf(ca4Var.h.a());
                    f13Var.a = "GDT_CLIENT_METRICS";
                    j31 j31Var = new j31("proto");
                    kd0Var.getClass();
                    iy2 iy2Var = e13.a;
                    iy2Var.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        iy2Var.c(kd0Var, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    f13Var.b = new g31(j31Var, byteArrayOutputStream.toByteArray());
                    arrayList.add(((i20) f64VarA).a(f13Var.c()));
                }
                i20 i20Var = (i20) f64VarA;
                HashMap map = new HashMap();
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    mo moVar = (mo) obj;
                    String str3 = moVar.a;
                    if (map.containsKey(str3)) {
                        ((List) map.get(str3)).add(moVar);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(moVar);
                        map.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    mo moVar2 = (mo) ((List) entry.getValue()).get(0);
                    b23 b23Var = b23.c;
                    long jA = i20Var.f.a();
                    long jA2 = i20Var.e.a();
                    jo joVar = new jo(new go(Integer.valueOf(moVar2.b("sdk-version")), moVar2.a("model"), moVar2.a("hardware"), moVar2.a("device"), moVar2.a("product"), moVar2.a("os-uild"), moVar2.a("manufacturer"), moVar2.a("fingerprint"), moVar2.a("locale"), moVar2.a("country"), moVar2.a("mcc_mnc"), moVar2.a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (mo moVar3 : (List) entry.getValue()) {
                        byte[] bArr3 = bArr2;
                        g31 g31Var = moVar3.c;
                        j31 j31Var2 = g31Var.a;
                        byte[] bArr4 = g31Var.b;
                        long j2 = jMax;
                        if (j31Var2.equals(new j31("proto"))) {
                            s44Var = new s44();
                            s44Var.l = bArr4;
                        } else {
                            if (j31Var2.equals(new j31("json"))) {
                                String str4 = new String(bArr4, Charset.forName("UTF-8"));
                                s44 s44Var2 = new s44();
                                s44Var2.m = str4;
                                s44Var = s44Var2;
                            } else {
                                String strD0 = xr0.d0("CctTransportBackend");
                                if (Log.isLoggable(strD0, 5)) {
                                    Log.w(strD0, "Received event of unsupported encoding " + j31Var2 + ". Skipping...");
                                }
                            }
                            bArr2 = bArr3;
                            jMax = j2;
                        }
                        s44Var.c = Long.valueOf(moVar3.d);
                        s44Var.h = Long.valueOf(moVar3.e);
                        String str5 = (String) moVar3.f.get("tz-offset");
                        s44Var.n = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        s44Var.o = new ro((qk2) qk2.c.get(moVar3.b("net-type")), (pk2) pk2.c.get(moVar3.b("mobile-subtype")));
                        Integer num = moVar3.b;
                        if (num != null) {
                            s44Var.d = num;
                        }
                        String strConcat = ((Long) s44Var.c) == null ? " eventTimeMs" : BuildConfig.VERSION_NAME;
                        if (((Long) s44Var.h) == null) {
                            strConcat = strConcat.concat(" eventUptimeMs");
                        }
                        if (((Long) s44Var.n) == null) {
                            strConcat = strConcat.concat(" timezoneOffsetSeconds");
                        }
                        if (!strConcat.isEmpty()) {
                            u41.r("Missing required properties:".concat(strConcat));
                            return;
                        } else {
                            arrayList4.add(new oo(((Long) s44Var.c).longValue(), (Integer) s44Var.d, ((Long) s44Var.h).longValue(), (byte[]) s44Var.l, (String) s44Var.m, ((Long) s44Var.n).longValue(), (ro) s44Var.o));
                            bArr2 = bArr3;
                            jMax = j2;
                        }
                    }
                    arrayList3.add(new po(jA, jA2, joVar, numValueOf, str2, arrayList4));
                    bArr2 = bArr2;
                }
                bArr = bArr2;
                j = jMax;
                io ioVar = new io(arrayList3);
                URL urlB = i20Var.d;
                if (bArr != null) {
                    try {
                        oz ozVarA = oz.a(bArr);
                        str = ozVarA.b;
                        if (str == null) {
                            str = null;
                        }
                        urlB = i20.b(ozVarA.a);
                    } catch (IllegalArgumentException unused3) {
                        hoVar = new ho(-1L, 3);
                    }
                } else {
                    str = null;
                }
                try {
                    int i6 = 13;
                    ci4 ci4Var = new ci4(urlB, ioVar, str, i6);
                    f4 f4Var = new f4(1, i20Var);
                    int i7 = 5;
                    do {
                        jlVarF = f4Var.f(ci4Var);
                        URL url = (URL) jlVarF.c;
                        if (url != null) {
                            xr0.S("CctTransportBackend", "Following redirect to: %s", url);
                            ci4Var = new ci4(url, (io) ci4Var.h, (String) ci4Var.l, i6);
                        } else {
                            ci4Var = null;
                        }
                        if (ci4Var == null) {
                            break;
                        } else {
                            i7--;
                        }
                    } while (i7 >= 1);
                    int i8 = jlVarF.a;
                    if (i8 == 200) {
                        hoVar2 = new ho(jlVarF.b, 1);
                    } else {
                        if (i8 >= 500 || i8 == 404) {
                            hoVar = new ho(-1L, 2);
                        } else if (i8 == 400) {
                            try {
                                hoVar = new ho(-1L, 4);
                            } catch (IOException e) {
                                e = e;
                                xr0.U("CctTransportBackend", "Could not make request to the backend", e);
                                i2 = 2;
                                hoVar2 = new ho(-1L, 2);
                            }
                        } else {
                            hoVar = new ho(-1L, 3);
                        }
                        hoVar2 = hoVar;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            }
            i2 = 2;
            int i9 = hoVar2.a;
            if (i9 == i2) {
                final long j3 = j;
                o83Var.x(new xq3() { // from class: ba4
                    @Override // defpackage.xq3
                    public final Object d() {
                        ca4 ca4Var2 = this.c;
                        o83 o83Var3 = ca4Var2.c;
                        o83Var3.getClass();
                        Iterable iterable2 = iterable;
                        if (iterable2.iterator().hasNext()) {
                            String strConcat2 = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(o83.A(iterable2));
                            SQLiteDatabase sQLiteDatabaseA = o83Var3.a();
                            sQLiteDatabaseA.beginTransaction();
                            try {
                                sQLiteDatabaseA.compileStatement(strConcat2).execute();
                                Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                                while (cursorRawQuery.moveToNext()) {
                                    try {
                                        o83Var3.p(cursorRawQuery.getInt(0), q72.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                cursorRawQuery.close();
                                sQLiteDatabaseA.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                                sQLiteDatabaseA.setTransactionSuccessful();
                                sQLiteDatabaseA.endTransaction();
                            } catch (Throwable th2) {
                                sQLiteDatabaseA.endTransaction();
                                throw th2;
                            }
                        }
                        o83Var3.h(new k83(ca4Var2.g.a() + j3, voVar));
                        return null;
                    }
                });
                this.d.H(voVar, i + 1, true);
                return;
            }
            ca4Var = this;
            voVar2 = voVar;
            jMax = j;
            o83Var.x(new nj1(ca4Var, 4, iterable));
            if (i9 == 1) {
                jMax = Math.max(jMax, hoVar2.b);
                if (bArr != null) {
                    o83Var.x(new f4(8, ca4Var));
                }
            } else if (i9 == 4) {
                HashMap map2 = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String str6 = ((so) it2.next()).c.a;
                    if (map2.containsKey(str6)) {
                        map2.put(str6, Integer.valueOf(((Integer) map2.get(str6)).intValue() + 1));
                    } else {
                        map2.put(str6, 1);
                    }
                }
                o83Var.x(new nj1(ca4Var, 5, map2));
            }
            bArr2 = bArr;
        }
    }
}
