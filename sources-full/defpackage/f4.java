package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.compose.ui.platform.FocusFinderCompat;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f4 implements r3, FocusFinderCompat.UserSpecifiedFocusComparator.NextFocusGetter, bp1, p42, xq3, zp3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f4(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.zp3
    public aq3 a(yp3 yp3Var) {
        Context context = (Context) this.d;
        String str = yp3Var.b;
        gj gjVar = yp3Var.c;
        gjVar.getClass();
        if (str != null && str.length() != 0) {
            return new fe1(context, str, gjVar, true, true);
        }
        u41.k("Must set a non-null database name to a configuration that uses the no backup directory.");
        return null;
    }

    @Override // defpackage.r3
    public void b(Object obj) {
        ((le1) ((gn3) this.d).getValue()).invoke(obj);
    }

    @Override // defpackage.bp1
    public boolean c(sz0 sz0Var, int i, Bundle bundle) {
        kn0 jbVar;
        dj djVar = (dj) this.d;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((dp1) sz0Var.c).e();
                Parcelable parcelable = (Parcelable) ((dp1) sz0Var.c).b();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        dp1 dp1Var = (dp1) sz0Var.c;
        ClipData clipData = new ClipData(dp1Var.a(), new ClipData.Item(dp1Var.c()));
        if (i2 >= 31) {
            jbVar = new jb(clipData, 2);
        } else {
            ln0 ln0Var = new ln0();
            ln0Var.d = clipData;
            ln0Var.h = 2;
            jbVar = ln0Var;
        }
        jbVar.n(dp1Var.f());
        jbVar.setExtras(bundle);
        return zc4.f(djVar, jbVar.build()) == null;
    }

    @Override // defpackage.xq3
    public Object d() {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 8:
                o83 o83Var = ((ca4) obj).i;
                SQLiteDatabase sQLiteDatabaseA = o83Var.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    sQLiteDatabaseA.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseA.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + o83Var.d.a()).execute();
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return null;
                } finally {
                    sQLiteDatabaseA.endTransaction();
                }
            default:
                ir3 ir3Var = (ir3) obj;
                SQLiteDatabase sQLiteDatabaseA2 = ((o83) ir3Var.d).a();
                sQLiteDatabaseA2.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseA2.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                    try {
                        ArrayList arrayList = new ArrayList();
                        while (cursorRawQuery.moveToNext()) {
                            ci4 ci4VarA = vo.a();
                            ci4VarA.I(cursorRawQuery.getString(1));
                            ci4VarA.l = mz2.b(cursorRawQuery.getInt(2));
                            String string = cursorRawQuery.getString(3);
                            ci4VarA.h = string == null ? null : Base64.decode(string, 0);
                            arrayList.add(ci4VarA.o());
                            break;
                        }
                        cursorRawQuery.close();
                        sQLiteDatabaseA2.setTransactionSuccessful();
                        sQLiteDatabaseA2.endTransaction();
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj2 = arrayList.get(i2);
                            i2++;
                            ((ci4) ir3Var.h).H((vo) obj2, 1, false);
                        }
                        return null;
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    sQLiteDatabaseA2.endTransaction();
                    throw th2;
                }
        }
    }

    @Override // defpackage.p42
    public void e(View view, String str) {
        le1 le1Var = (le1) this.d;
        view.getClass();
        str.getClass();
        le1Var.invoke(str);
    }

    public jl f(ci4 ci4Var) throws IOException {
        i20 i20Var = (i20) this.d;
        URL url = (URL) ci4Var.d;
        String strD0 = xr0.d0("CctTransportBackend");
        if (Log.isLoggable(strD0, 4)) {
            Log.i(strD0, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(i20Var.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.8 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) ci4Var.l;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    sz0 sz0Var = i20Var.a;
                    io ioVar = (io) ci4Var.h;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    at1 at1Var = (at1) sz0Var.c;
                    zt1 zt1Var = new zt1(bufferedWriter, at1Var.c, at1Var.d, at1Var.h, at1Var.l);
                    zt1Var.e(ioVar);
                    zt1Var.g();
                    zt1Var.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    String strD1 = xr0.d0("CctTransportBackend");
                    if (Log.isLoggable(strD1, 4)) {
                        Log.i(strD1, String.format("Status Code: %d", numValueOf));
                    }
                    xr0.S("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    xr0.S("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new jl(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new jl(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            jl jlVar = new jl(responseCode, null, qo.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return jlVar;
                        } catch (Throwable th) {
                            if (gZIPInputStream == null) {
                                throw th;
                            }
                            try {
                                gZIPInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        if (inputStream == null) {
                            throw th3;
                        }
                        try {
                            inputStream.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                if (outputStream == null) {
                    throw th7;
                }
                try {
                    outputStream.close();
                    throw th7;
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        } catch (ConnectException e) {
            e = e;
            xr0.U("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new jl(500, null, 0L);
        } catch (UnknownHostException e2) {
            e = e2;
            xr0.U("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new jl(500, null, 0L);
        } catch (IOException e3) {
            e = e3;
            xr0.U("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new jl(400, null, 0L);
        } catch (k31 e4) {
            e = e4;
            xr0.U("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new jl(400, null, 0L);
        }
    }

    public void g() {
        ne1 ne1Var = (ne1) this.d;
        synchronized (vk3.b) {
            List list = vk3.g;
            list.getClass();
            ArrayList arrayList = new ArrayList(le0.q0(list, 10));
            boolean z = false;
            for (Object obj : list) {
                boolean z2 = true;
                if (!z && kr1.n(obj, ne1Var)) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(obj);
                }
            }
            vk3.g = arrayList;
        }
    }

    @Override // androidx.compose.ui.platform.FocusFinderCompat.UserSpecifiedFocusComparator.NextFocusGetter
    public View get(View view, View view2) {
        return FocusFinderCompat.userSpecifiedFocusComparator$lambda$0((FocusFinderCompat) this.d, view, view2);
    }
}
