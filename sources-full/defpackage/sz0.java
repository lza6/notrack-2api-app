package defpackage;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Parcel;
import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.profileinstaller.ProfileInstallReceiver;
import app.template.extension.BuildConfig;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import okhttp3.Protocol$Companion;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class sz0 implements v44, c03 {
    public Object c;

    public sz0(int i) {
        switch (i) {
            case 12:
                this.c = new xf(mb4.a, Float.valueOf(0.0f), new yf(0.0f), Long.MIN_VALUE, Long.MIN_VALUE, false);
                break;
            case 21:
                int i2 = 22;
                this.c = Build.VERSION.SDK_INT >= 28 ? new qn0(i2) : new rn0(i2);
                break;
            case 23:
                this.c = new j82();
                break;
            case 28:
                this.c = new LinkedHashSet();
                break;
            default:
                this.c = null;
                break;
        }
    }

    public /* synthetic */ sz0(Object obj) {
        this.c = obj;
    }

    public /* synthetic */ sz0(Object obj, Object obj2) {
        this.c = obj;
    }

    public sz0(sv1 sv1Var, Class cls) {
        if (((Map) sv1Var.c).keySet().contains(cls) || Void.class.equals(cls)) {
            this.c = sv1Var;
            return;
        }
        throw new IllegalArgumentException("Given internalKeyMananger " + sv1Var.toString() + " does not support primitive class " + cls.getName());
    }

    @Override // defpackage.v44
    public wf a() {
        return null;
    }

    @Override // defpackage.v44
    public boolean b() {
        return true;
    }

    @Override // defpackage.v44
    public w44 c() {
        return (w44) this.c;
    }

    @Override // defpackage.v44
    public zr0 d() {
        return null;
    }

    public synchronized void e(ov1 ov1Var) {
        fw1 fw1VarF;
        synchronized (this) {
            fw1VarF = f(w43.e(ov1Var), ov1Var.A());
        }
        dw1 dw1Var = (dw1) this.c;
        dw1Var.e();
        gw1.x((gw1) dw1Var.d, fw1VarF);
    }

    public synchronized fw1 f(xu1 xu1Var, lr2 lr2Var) {
        int iA;
        synchronized (this) {
            iA = ja4.a();
            while (o(iA)) {
                iA = ja4.a();
            }
        }
        return (fw1) ew1VarF.b();
        if (lr2Var == lr2.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        ew1 ew1VarF = fw1.F();
        ew1VarF.e();
        fw1.w((fw1) ew1VarF.d, xu1Var);
        ew1VarF.e();
        fw1.z((fw1) ew1VarF.d, iA);
        ew1VarF.e();
        fw1.y((fw1) ew1VarF.d);
        ew1VarF.e();
        fw1.x((fw1) ew1VarF.d, lr2Var);
        return (fw1) ew1VarF.b();
    }

    public void g(byte b) {
        ((Parcel) this.c).writeByte(b);
    }

    public void h(float f) {
        ((Parcel) this.c).writeFloat(f);
    }

    public void i(long j) {
        long jB = yz3.b(j);
        byte b = 0;
        if (!zz3.a(jB, 0L)) {
            if (zz3.a(jB, 4294967296L)) {
                b = 1;
            } else if (zz3.a(jB, 8589934592L)) {
                b = 2;
            }
        }
        g(b);
        if (zz3.a(yz3.b(j), 0L)) {
            return;
        }
        h(yz3.c(j));
    }

    public dm3 j(Class cls) {
        return (dm3) ((Map) this.c).get(cls);
    }

    @Override // defpackage.c03
    public void k() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public dc2 l(pm1 pm1Var, cc2 cc2Var, ai3 ai3Var, ma3 ma3Var) {
        dc2 dc2Var;
        int iAbs;
        dc2 dc2Var2;
        tz tzVar = pm1Var.k;
        wx2 wx2Var = pm1Var.s;
        if (tzVar.c) {
            k33 k33VarC = ((g33) this.c).c();
            if (k33VarC != null) {
                synchronized (k33VarC.c) {
                    try {
                        o33 o33Var = (o33) ((LinkedHashMap) ((p33) k33VarC.a.c).h).get(cc2Var);
                        dc2Var = o33Var != null ? new dc2(o33Var.a, o33Var.b) : null;
                        if (dc2Var == null) {
                            kn4 kn4Var = k33VarC.b;
                            ArrayList arrayList = (ArrayList) ((LinkedHashMap) kn4Var.c).get(cc2Var);
                            if (arrayList == null) {
                                dc2Var = null;
                            } else {
                                int size = arrayList.size();
                                int i = 0;
                                while (true) {
                                    if (i >= size) {
                                        dc2Var2 = null;
                                        break;
                                    }
                                    s33 s33Var = (s33) arrayList.get(i);
                                    am1 am1Var = (am1) s33Var.a.get();
                                    dc2Var2 = am1Var != null ? new dc2(am1Var, s33Var.b) : null;
                                    if (dc2Var2 != null) {
                                        break;
                                    }
                                    i++;
                                }
                                kn4Var.d();
                                dc2Var = dc2Var2;
                            }
                        }
                        if (dc2Var != null && !dc2Var.a.a()) {
                            synchronized (k33VarC.c) {
                                p33 p33Var = (p33) k33VarC.a.c;
                                Object objRemove = ((LinkedHashMap) p33Var.h).remove(cc2Var);
                                if (objRemove != null) {
                                    p33Var.d = p33Var.f() - p33Var.j(cc2Var, objRemove);
                                    p33Var.c(cc2Var, objRemove, null);
                                }
                                if (objRemove != null) {
                                }
                                if (((LinkedHashMap) k33VarC.b.c).remove(cc2Var) != null) {
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                dc2Var = null;
            }
            if (dc2Var != null) {
                am1 am1Var2 = dc2Var.a;
                gv gvVar = am1Var2 instanceof gv ? (gv) am1Var2 : null;
                if (gvVar != null) {
                    Bitmap.Config config = gvVar.a.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    if (yh4.I(config) && !((Boolean) y64.z(pm1Var, sm1.f)).booleanValue()) {
                        return null;
                    }
                }
                String str = (String) cc2Var.b.get("coil#size");
                if (str == null) {
                    Object obj = dc2Var.b.get("coil#is_sampled");
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    if ((bool != null ? bool.booleanValue() : false) || (!kr1.n(ai3Var, ai3.c) && wx2Var != wx2.d)) {
                        int width = am1Var2.getWidth();
                        int height = am1Var2.getHeight();
                        ai3 ai3Var2 = am1Var2 instanceof gv ? (ai3) y64.z(pm1Var, rm1.b) : ai3.c;
                        bw0 bw0Var = ai3Var.a;
                        int i2 = bw0Var instanceof zv0 ? ((zv0) bw0Var).a : Integer.MAX_VALUE;
                        bw0 bw0Var2 = ai3Var2.a;
                        int iMin = Math.min(i2, bw0Var2 instanceof zv0 ? ((zv0) bw0Var2).a : Integer.MAX_VALUE);
                        bw0 bw0Var3 = ai3Var.b;
                        int i3 = bw0Var3 instanceof zv0 ? ((zv0) bw0Var3).a : Integer.MAX_VALUE;
                        bw0 bw0Var4 = ai3Var2.b;
                        int iMin2 = Math.min(i3, bw0Var4 instanceof zv0 ? ((zv0) bw0Var4).a : Integer.MAX_VALUE);
                        double d = ((double) iMin) / ((double) width);
                        double d2 = ((double) iMin2) / ((double) height);
                        int iOrdinal = ((iMin == Integer.MAX_VALUE || iMin2 == Integer.MAX_VALUE) ? ma3.d : ma3Var).ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 1) {
                                u41.e();
                                return null;
                            }
                            if (d < d2) {
                                iAbs = Math.abs(iMin - width);
                            } else {
                                iAbs = Math.abs(iMin2 - height);
                                d = d2;
                            }
                        } else if (d > d2) {
                            iAbs = Math.abs(iMin - width);
                        } else {
                            iAbs = Math.abs(iMin2 - height);
                            d = d2;
                        }
                        if (iAbs > 1) {
                            int iOrdinal2 = wx2Var.ordinal();
                            if (iOrdinal2 != 0) {
                                if (iOrdinal2 != 1) {
                                    u41.e();
                                    return null;
                                }
                                if (d <= 1.0d) {
                                }
                            } else if (d == 1.0d) {
                            }
                        }
                    }
                    return dc2Var;
                }
                if (str.equals(ai3Var.toString())) {
                    return dc2Var;
                }
            }
        }
        return null;
    }

    @Override // defpackage.c03
    public void m(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = BuildConfig.VERSION_NAME;
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.c).setResultCode(i);
    }

    public synchronized ci4 n() {
        return ci4.x((gw1) ((dw1) this.c).b());
    }

    public synchronized boolean o(int i) {
        Iterator it = Collections.unmodifiableList(((gw1) ((dw1) this.c).d).A()).iterator();
        while (it.hasNext()) {
            if (((fw1) it.next()).B() == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    public cc2 p(pm1 pm1Var, Object obj, jq2 jq2Var, bg1 bg1Var) {
        String string;
        String strS;
        tz tzVar = pm1Var.k;
        Map map = pm1Var.e;
        if (tzVar != tz.l) {
            String str = pm1Var.d;
            if (str != null) {
                return new cc2(str, map);
            }
            List list = ((g33) this.c).d.c;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    ps2 ps2Var = (ps2) list.get(i);
                    bd bdVar = (bd) ps2Var.c;
                    if (((vc0) ps2Var.d).b(obj)) {
                        bdVar.getClass();
                        switch (bdVar.a) {
                            case 0:
                                da4 da4Var = (da4) obj;
                                if (!kr1.n(da4Var.c, "android.resource")) {
                                    string = null;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(da4Var);
                                    sb.append(':');
                                    Configuration configuration = jq2Var.a.getResources().getConfiguration();
                                    Bitmap.Config[] configArr = ta4.a;
                                    sb.append(configuration.uiMode & 48);
                                    string = sb.toString();
                                }
                                break;
                            case 1:
                                da4 da4Var2 = (da4) obj;
                                String str2 = da4Var2.c;
                                if (!(str2 == null || str2.equals("file")) || da4Var2.e == null) {
                                    string = null;
                                } else {
                                    Bitmap.Config[] configArr2 = ta4.a;
                                    if ((kr1.n(da4Var2.c, "file") && kr1.n(ke0.z0(jr1.v(da4Var2)), "android_asset")) || !((Boolean) y64.A(jq2Var, rm1.c)).booleanValue() || (strS = jr1.s(da4Var2)) == null) {
                                        string = null;
                                    } else {
                                        a71 a71Var = jq2Var.f;
                                        String str3 = mt2.d;
                                        Long l = a71Var.K(Path$Companion.get(strS)).f;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(da4Var2);
                                        sb2.append('-');
                                        sb2.append(l);
                                        string = sb2.toString();
                                    }
                                }
                                break;
                            default:
                                string = ((da4) obj).a;
                                break;
                        }
                        if (string != null) {
                        }
                    }
                    i++;
                } else {
                    string = null;
                }
            }
            if (string != null) {
                if (((List) y64.z(pm1Var, rm1.a)).isEmpty()) {
                    return new cc2(string, map);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put("coil#size", jq2Var.b.toString());
                return new cc2(string, linkedHashMap);
            }
        }
        return null;
    }

    public xu1 q(mz mzVar) throws GeneralSecurityException {
        sv1 sv1Var = (sv1) this.c;
        try {
            qq4 qq4VarG = sv1Var.g();
            g0 g0VarC = qq4VarG.c(mzVar);
            qq4VarG.d(g0VarC);
            g0 g0VarA = qq4VarG.a(g0VarC);
            vu1 vu1VarD = xu1.D();
            String strF = sv1Var.f();
            vu1VarD.e();
            xu1.w((xu1) vu1VarD.d, strF);
            try {
                int iB = ((ef1) g0VarA).b(null);
                byte[] bArr = new byte[iB];
                de0 de0Var = new de0(iB, bArr);
                g0VarA.f(de0Var);
                if (de0Var.c - de0Var.d != 0) {
                    throw new IllegalStateException("Did not write as much data as expected.");
                }
                kz kzVar = new kz(bArr);
                vu1VarD.e();
                xu1.x((xu1) vu1VarD.d, kzVar);
                wu1 wu1VarH = sv1Var.h();
                vu1VarD.e();
                xu1.y((xu1) vu1VarD.d, wu1VarH);
                return (xu1) vu1VarD.b();
            } catch (IOException e) {
                throw new RuntimeException(g0VarA.c("ByteString"), e);
            }
        } catch (sr1 e2) {
            throw new GeneralSecurityException("Unexpected proto", e2);
        }
    }

    public void r() {
        ((zc1) this.c).x.R();
    }

    public void s(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            ((AutofillManager) this.c).notifyViewVisibilityChanged(view, i, z);
        }
    }

    public void t() {
        t00 t00Var = (t00) this.c;
        if (t00Var.t() instanceof hm2) {
            t00Var.resumeWith(Boolean.FALSE);
        }
    }

    public void u(fu fuVar) {
        fuVar.getClass();
        t00 t00Var = (t00) this.c;
        if (t00Var.t() instanceof hm2) {
            t00Var.resumeWith(Boolean.valueOf(fuVar.a == 0));
        }
    }

    public cr1 v(fp1 fp1Var, AndroidComposeView androidComposeView) {
        Object obj;
        long j;
        boolean z;
        long jMo29xf127194;
        j82 j82Var = (j82) this.c;
        List list = (List) fp1Var.c;
        j82 j82Var2 = new j82(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            fx2 fx2Var = (fx2) list.get(i);
            long j2 = fx2Var.a;
            int iH = gm4.h(j82Var.d, j82Var.l, j2);
            if (iH < 0 || (obj = j82Var.h[iH]) == xr0.c) {
                obj = null;
            }
            ex2 ex2Var = (ex2) obj;
            if (ex2Var == null) {
                j = fx2Var.b;
                jMo29xf127194 = fx2Var.d;
                z = false;
            } else {
                j = ex2Var.a;
                z = ex2Var.c;
                jMo29xf127194 = androidComposeView.mo29xf127194(ex2Var.b);
            }
            long j3 = fx2Var.a;
            int i2 = i;
            List list2 = list;
            int i3 = size;
            j82Var2.c(new dx2(j3, fx2Var.b, fx2Var.d, fx2Var.e, fx2Var.f, j, jMo29xf127194, z, fx2Var.g, fx2Var.i, fx2Var.j, fx2Var.k), j3);
            boolean z2 = fx2Var.e;
            if (z2) {
                j82Var.c(new ex2(fx2Var.b, fx2Var.c, z2), j2);
            } else {
                j82Var.d(j2);
            }
            i = i2 + 1;
            list = list2;
            size = i3;
        }
        return new cr1(j82Var2, fp1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void w(float f, wu0 wu0Var, gq0 gq0Var) {
        if (f <= wu0Var.w(1.0f)) {
            return;
        }
        pk3 currentThreadSnapshot = Protocol$Companion.getCurrentThreadSnapshot();
        so0 so0Var = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        le1 le1VarE = currentThreadSnapshot != null ? currentThreadSnapshot.e() : null;
        pk3 pk3VarMakeCurrentNonObservable = Protocol$Companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            float fFloatValue = ((Number) ((xf) this.c).d.getValue()).floatValue();
            xf xfVar = (xf) this.c;
            if (xfVar.n) {
                this.c = av1.k(xfVar, fFloatValue - f, 0.0f, 30);
                py.F(gq0Var, null, null, new d12(this, so0Var, 0), 3);
            } else {
                this.c = new xf(mb4.a, Float.valueOf(-f), objArr2 == true ? 1 : 0, 60);
                py.F(gq0Var, null, null, new d12(this, objArr == true ? 1 : 0, 1), 3);
            }
        } finally {
            Protocol$Companion.restoreNonObservable(currentThreadSnapshot, pk3VarMakeCurrentNonObservable, le1VarE);
        }
    }
}
