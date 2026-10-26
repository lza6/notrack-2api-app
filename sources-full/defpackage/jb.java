package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.view.ContentInfo;
import android.view.MenuItem;
import androidx.appcompat.widget.ActionMenuView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import app.template.extension.BuildConfig;
import com.google.android.gms.common.internal.a;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public class jb implements md2, fc2, hk, xr, lc2, c00, kn0, mn0, i61, yk, in2 {
    public static final Object h = new Object();
    public static final bf1 l = new bf1(1);
    public final /* synthetic */ int c;
    public Object d;

    public jb(int i) {
        rd2 rd2Var;
        this.c = i;
        switch (i) {
            case 19:
                TimeUnit.MINUTES.getClass();
                this.d = new s11(et3.h);
                break;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
            case 21:
            case 22:
            case 23:
            default:
                try {
                    rd2Var = (rd2) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    rd2Var = l;
                }
                rd2[] rd2VarArr = {bf1.b, rd2Var};
                k92 k92Var = new k92();
                k92Var.a = rd2VarArr;
                Charset charset = zq1.a;
                this.d = k92Var;
                break;
            case 24:
                break;
            case 25:
                this.d = xp1.j(Looper.getMainLooper());
                break;
            case 26:
                this.d = new k64(xr0.b);
                break;
            case 27:
                this.d = new ConcurrentHashMap(16);
                break;
        }
    }

    public /* synthetic */ jb(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    public jb(ClipData clipData, int i) {
        this.c = 20;
        this.d = s9.d(clipData, i);
    }

    public jb(Context context) {
        this.c = 13;
        this.d = context.getSharedPreferences("bonus", 0);
    }

    public jb(ContentInfo contentInfo) {
        this.c = 21;
        contentInfo.getClass();
        this.d = s9.f(contentInfo);
    }

    public jb(a aVar) {
        this.c = 11;
        Objects.requireNonNull(aVar);
        this.d = aVar;
    }

    public jb(de0 de0Var) {
        this.c = 18;
        zq1.a(de0Var, "output");
        this.d = de0Var;
        de0Var.a = this;
    }

    public jb(s44 s44Var) {
        this.c = 0;
        Context context = (Context) s44Var.c;
        String str = (String) s44Var.d;
        String str2 = (String) s44Var.h;
        if (str == null) {
            u41.k("keysetName cannot be null");
            throw null;
        }
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            applicationContext.getSharedPreferences(str2, 0).edit();
        }
        this.d = (sz0) s44Var.o;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a A[PHI: r10
  0x002a: PHI (r10v1 int) = (r10v0 int), (r10v3 int), (r10v4 int) binds: [B:5:0x001a, B:10:0x0023, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    public jb(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        this.c = 9;
        int i2 = 1;
        int length = fArr.length - 1;
        zk[][] zkVarArr = new zk[length][];
        int i3 = 1;
        int i4 = 1;
        int i5 = 0;
        while (i5 < length) {
            int i6 = iArr[i5];
            int i7 = 3;
            if (i6 == 0) {
                i = i7;
            } else if (i6 == i2) {
                i3 = i2;
                i = i3;
            } else {
                if (i6 != 2) {
                    if (i6 != 3) {
                        i7 = 4;
                        if (i6 != 4) {
                            i7 = 5;
                            if (i6 != 5) {
                                i = i4;
                            } else {
                                i = i7;
                            }
                        } else {
                            i = i7;
                        }
                    } else {
                        if (i3 != i2) {
                            i3 = i2;
                        }
                        i = i3;
                    }
                }
                i3 = 2;
                i = i3;
            }
            float[] fArr3 = fArr2[i5];
            int i8 = i5 + 1;
            float[] fArr4 = fArr2[i8];
            float f = fArr[i5];
            float f2 = fArr[i8];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            zk[] zkVarArr2 = new zk[length2];
            int i9 = 0;
            while (i9 < length2) {
                int i10 = i9 * 2;
                int i11 = i9;
                int i12 = i10 + 1;
                zkVarArr2[i11] = new zk(i, f, f2, fArr3[i10], fArr3[i12], fArr4[i10], fArr4[i12]);
                i9 = i11 + 1;
            }
            zkVarArr[i5] = zkVarArr2;
            i5 = i8;
            i4 = i;
            i2 = 1;
        }
        this.d = zkVarArr;
    }

    public void A(float f, float f2, long j) {
        y00 y00VarY = ((ci4) this.d).y();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        y00VarY.g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        y00VarY.d(f, f2);
        y00VarY.g(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void B(float f, float f2) {
        ((ci4) this.d).y().g(f, f2);
    }

    public void C(int i, mz mzVar) {
        de0 de0Var = (de0) this.d;
        de0Var.r(i, 2);
        de0Var.s(mzVar.size());
        kz kzVar = (kz) mzVar;
        de0Var.l(kzVar.l, kzVar.l(), kzVar.size());
    }

    public void D(int i, Object obj, za3 za3Var) {
        de0 de0Var = (de0) this.d;
        de0Var.r(i, 3);
        za3Var.a((g0) obj, de0Var.a);
        de0Var.r(i, 4);
    }

    public void E(int i, Object obj, za3 za3Var) {
        de0 de0Var = (de0) this.d;
        g0 g0Var = (g0) obj;
        de0Var.r(i, 2);
        de0Var.s(g0Var.b(za3Var));
        za3Var.a(g0Var, de0Var.a);
    }

    @Override // defpackage.c00
    public void a(y23 y23Var, f63 f63Var) {
        ny nyVarD;
        String strV;
        v10 v10VarM1786parse;
        Object i63Var;
        Object objL;
        v10 u10Var;
        wz2 wz2Var = (wz2) this.d;
        m33 m33Var = f63Var.o;
        if (f63Var.c()) {
            if (m33Var == null || (nyVarD = m33Var.D()) == null) {
                wz2Var.h0(null);
                return;
            }
            while (!nyVarD.r() && (strV = nyVarD.v()) != null) {
                try {
                    try {
                        if (to3.q0(strV, "data: ", false) && (v10VarM1786parse = Options$Companion.m1786parse(mo3.U0(mo3.J0(strV, "data: ")).toString())) != null) {
                            wz2Var.n.i(v10VarM1786parse);
                        }
                    } catch (Exception unused) {
                        wz2Var.i(new u10("offline"));
                        f63Var.close();
                        wz2Var.h0(null);
                        return;
                    }
                } catch (Throwable th) {
                    f63Var.close();
                    wz2Var.h0(null);
                    throw th;
                }
            }
            f63Var.close();
            wz2Var.h0(null);
            return;
        }
        Object obj = BuildConfig.VERSION_NAME;
        if (m33Var != null) {
            try {
                objL = m33Var.l();
            } catch (Throwable th2) {
                i63Var = new i63(th2);
            }
        } else {
            objL = null;
        }
        i63Var = objL == null ? BuildConfig.VERSION_NAME : objL;
        if (!(i63Var instanceof i63)) {
            obj = i63Var;
        }
        i42 i42Var = new i42((String) obj);
        do {
            if (!i42Var.hasNext()) {
                u10Var = null;
                break;
            }
            String str = (String) i42Var.next();
            str.getClass();
            String string = mo3.U0(mo3.J0(str, "data: ")).toString();
            if (!to3.q0(string, "{", false)) {
                string = null;
            }
            u10Var = string != null ? Options$Companion.m1786parse(string) : null;
        } while (u10Var == null);
        if (u10Var == null) {
            u10Var = new u10(f63Var.l == 404 ? "off" : "failed");
        }
        wz2Var.i(u10Var);
        f63Var.close();
        wz2Var.h0(null);
    }

    @Override // defpackage.md2
    public void b(hc2 hc2Var, boolean z) {
        if (hc2Var instanceof ep3) {
            ((ep3) hc2Var).z.k().c(false);
        }
        md2 md2Var = ((g3) this.d).m;
        if (md2Var != null) {
            md2Var.b(hc2Var, z);
        }
    }

    @Override // defpackage.kn0
    public nn0 build() {
        return new nn0(new jb(((ContentInfo.Builder) this.d).build()));
    }

    @Override // defpackage.yk
    public Object c(pb3 pb3Var, Float f, Float f2, le1 le1Var, gk3 gk3Var) {
        Object objA = lk3.a(pb3Var, f.floatValue(), av1.a(0.0f, f2.floatValue(), 28), (zr0) this.d, le1Var, gk3Var);
        return objA == hq0.c ? objA : (tf) objA;
    }

    public void d(int i) {
    }

    @Override // defpackage.fc2
    public boolean e(hc2 hc2Var, MenuItem menuItem) {
        j3 j3Var = ((ActionMenuView) this.d).H;
        if (j3Var == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((g44) j3Var).c.O.h).iterator();
        while (it.hasNext()) {
            if (((gd1) it.next()).a.p()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.lc2
    public void f(hc2 hc2Var, MenuItem menuItem) {
        ((h20) this.d).n.removeCallbacksAndMessages(hc2Var);
    }

    @Override // defpackage.xr
    public void g(ml0 ml0Var) {
        boolean z = ml0Var.d == 0;
        a aVar = (a) this.d;
        if (z) {
            aVar.l(null, aVar.w);
            return;
        }
        sk3 sk3Var = aVar.o;
        if (sk3Var != null) {
            ((yf1) sk3Var.d).c(ml0Var);
        }
    }

    @Override // defpackage.t13
    public Object get() {
        return new ci4((Context) ((f61) this.d).c, new sb3(11), new zf3(9), 16);
    }

    @Override // defpackage.mn0
    public ClipData getClip() {
        return ((ContentInfo) this.d).getClip();
    }

    @Override // defpackage.lc2
    public void h(hc2 hc2Var, mc2 mc2Var) {
        h20 h20Var = (h20) this.d;
        Handler handler = h20Var.n;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = h20Var.p;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (hc2Var == ((g20) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new f20(this, i2 < arrayList.size() ? (g20) arrayList.get(i2) : null, mc2Var, hc2Var), hc2Var, SystemClock.uptimeMillis() + 200);
    }

    @Override // defpackage.mn0
    public int i() {
        return ((ContentInfo) this.d).getFlags();
    }

    @Override // defpackage.mn0
    public ContentInfo j() {
        return (ContentInfo) this.d;
    }

    @Override // defpackage.c00
    public void k(y23 y23Var, IOException iOException) {
        wz2 wz2Var = (wz2) this.d;
        wz2Var.i(new u10("offline"));
        wz2Var.h0(null);
    }

    @Override // defpackage.fc2
    public void l(hc2 hc2Var) {
        g44 g44Var = ((ActionMenuView) this.d).C;
        if (g44Var != null) {
            g44Var.l(hc2Var);
        }
    }

    public void m(int i) {
    }

    @Override // defpackage.kn0
    public void n(Uri uri) {
        ((ContentInfo.Builder) this.d).setLinkUri(uri);
    }

    @Override // defpackage.mn0
    public int o() {
        return ((ContentInfo) this.d).getSource();
    }

    @Override // defpackage.hk
    public void p(int i, float f) {
    }

    @Override // defpackage.md2
    public boolean q(hc2 hc2Var) {
        g3 g3Var = (g3) this.d;
        if (hc2Var == g3Var.h) {
            return false;
        }
        ((ep3) hc2Var).A.getClass();
        md2 md2Var = g3Var.m;
        if (md2Var != null) {
            return md2Var.q(hc2Var);
        }
        return false;
    }

    @Override // defpackage.in2
    public void r(Object obj) {
        n32 n32Var = (n32) obj;
        sv0 sv0Var = (sv0) this.d;
        if (n32Var == null || !sv0Var.j0) {
            return;
        }
        throw new IllegalStateException("Fragment " + sv0Var + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    @Override // defpackage.kn0
    public void s(int i) {
        ((ContentInfo.Builder) this.d).setFlags(i);
    }

    @Override // defpackage.kn0
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.d).setExtras(bundle);
    }

    public void t(ux1 ux1Var) {
        if (!ux1Var.F()) {
            po1.b("DepthSortedSet.add called on an unattached node");
        }
        ((k64) this.d).add(ux1Var);
    }

    public String toString() {
        switch (this.c) {
            case 21:
                return "ContentInfoCompat{" + ((ContentInfo) this.d) + "}";
            case 26:
                return ((k64) this.d).toString();
            default:
                return super.toString();
        }
    }

    public void u(float f, float f2, float f3, float f4, int i) {
        ((ci4) this.d).y().f(f, f2, f3, f4, i);
    }

    public gn3 v() {
        y11 y11VarA = y11.a();
        if (y11VarA.c() == 1) {
            return new jn1(true);
        }
        ft2 ft2VarD = cl3.d(Boolean.FALSE);
        y11VarA.h(new ys0(ft2VarD, this));
        return ft2VarD;
    }

    public StringBuilder w() {
        i iVar = (i) this.d;
        if (!(iVar instanceof ws2)) {
            return null;
        }
        StringBuilder sb = ((ws2) iVar).b.b;
        if (sb.length() == 0) {
            return null;
        }
        return sb;
    }

    public void x(float f, float f2, float f3, float f4) {
        ci4 ci4Var = (ci4) this.d;
        y00 y00VarY = ci4Var.y();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (ci4Var.C() >> 32)) - (f3 + f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (ci4Var.C() & 4294967295L)) - (f4 + f2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            oo1.a("Width and height must be greater than or equal to zero");
        }
        ci4Var.N(jFloatToRawIntBits);
        y00VarY.g(f, f2);
    }

    public boolean y(ux1 ux1Var) {
        if (!ux1Var.F()) {
            po1.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((k64) this.d).remove(ux1Var);
    }

    public void z(float f) {
        y00 y00VarY = ((ci4) this.d).y();
        y00VarY.g(Float.intBitsToFloat(0), Float.intBitsToFloat(0));
        y00VarY.e(f);
        y00VarY.g(-Float.intBitsToFloat(0), -Float.intBitsToFloat(0));
    }
}
