package defpackage;

import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.UriHandler;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import app.template.extension.BuildConfig;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;
import notrack.ai.MainActivity;
import notrack.ai.ui.components.HtmlPreviewActivity;
import okio.Path$Companion;
import okio.internal.a;
import okio.internal.b;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wl implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wl(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    public /* synthetic */ wl(UriHandler uriHandler, hb0 hb0Var) {
        this.c = 6;
        this.d = uriHandler;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:379:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00de  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.je1
    public final Object invoke() throws Exception {
        Window window;
        bh4 yg4Var;
        l51 l51Var;
        Bitmap bitmapCreateBitmap;
        int i;
        int iMin;
        double dMax;
        int iE;
        int iE2;
        int i2;
        int largeMemoryClass;
        int iF0;
        ps2 ps2Var;
        ps2 ps2Var2;
        WorkDatabase workDatabase;
        jl0 jl0Var;
        boolean zA;
        int i3 = this.c;
        w84 w84Var = w84.a;
        int i4 = 1;
        char c = 1;
        int i5 = 0;
        Object obj = this.d;
        switch (i3) {
            case 0:
                Object[] objArr = (Object[]) obj;
                objArr.getClass();
                return new a0(objArr);
            case 1:
                iv2 iv2Var = new iv2();
                iv2Var.a = w3.a;
                ((j92) obj).a(iv2Var, null);
                return w84Var;
            case 2:
                ViewParent parent = ((View) obj).getParent();
                vv0 vv0Var = parent instanceof vv0 ? (vv0) parent : null;
                if (vv0Var != null && (window = vv0Var.getWindow()) != null) {
                    int i6 = Build.VERSION.SDK_INT;
                    if (i6 >= 35) {
                        yg4Var = new ah4(window);
                    } else if (i6 >= 30) {
                        yg4Var = new zg4(window);
                    } else {
                        yg4Var = i6 >= 26 ? new yg4(window) : new xg4(window);
                    }
                    yg4Var.b(false);
                    yg4Var.a(false);
                }
                return w84Var;
            case 3:
                ev evVar = (ev) obj;
                BitmapFactory.Options options = new BitmapFactory.Options();
                jq2 jq2Var = evVar.b;
                bv bvVar = new bv(((wm1) evVar.d).D());
                u23 u23Var = new u23(bvVar);
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(new cy(u23Var.peek(), i4), null, options);
                Exception exc = bvVar.d;
                if (exc != null) {
                    throw exc;
                }
                options.inJustDecodeBounds = false;
                Paint paint = w51.a;
                String str = options.outMimeType;
                ((v51) evVar.e).getClass();
                if ((str != null && (str.equals("image/jpeg") || str.equals("image/webp") || str.equals("image/heic") || str.equals("image/heif"))) == true) {
                    t51 t51Var = new t51(new u51(new cy(u23Var.peek(), i4)));
                    p51 p51VarC = t51Var.c("Orientation");
                    if (p51VarC == null) {
                        iE = 1;
                    } else {
                        try {
                            iE = p51VarC.e(t51Var.e);
                        } catch (NumberFormatException unused) {
                            iE = 1;
                        }
                    }
                    boolean z = iE == 2 || iE == 7 || iE == 4 || iE == 5;
                    p51 p51VarC2 = t51Var.c("Orientation");
                    if (p51VarC2 == null) {
                        iE2 = 1;
                    } else {
                        try {
                            iE2 = p51VarC2.e(t51Var.e);
                        } catch (NumberFormatException unused2) {
                            iE2 = 1;
                        }
                    }
                    switch (iE2) {
                        case 3:
                        case 4:
                            i2 = 180;
                            break;
                        case 5:
                        case 8:
                            i2 = 270;
                            break;
                        case 6:
                        case 7:
                            i2 = 90;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                    l51Var = new l51(i2, z);
                } else {
                    l51Var = l51.c;
                }
                int i7 = l51Var.b;
                boolean z2 = l51Var.a;
                Exception exc2 = bvVar.d;
                if (exc2 != null) {
                    throw exc2;
                }
                options.inMutable = false;
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= 26 && sm1.b(jq2Var) != null) {
                    options.inPreferredColorSpace = ap.f(y64.A(jq2Var, sm1.c));
                }
                boolean zBooleanValue = ((Boolean) y64.A(jq2Var, sm1.d)).booleanValue();
                Context context = jq2Var.a;
                options.inPremultiplied = zBooleanValue;
                Bitmap.Config config = (Bitmap.Config) y64.A(jq2Var, sm1.b);
                if ((z2 || i7 > 0) && (config == null || yh4.I(config))) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (((Boolean) y64.A(jq2Var, sm1.g)).booleanValue() && config == Bitmap.Config.ARGB_8888 && kr1.n(options.outMimeType, "image/jpeg")) {
                    config = Bitmap.Config.RGB_565;
                }
                if (i8 >= 26 && options.outConfig == Bitmap.Config.RGBA_F16 && config != Bitmap.Config.HARDWARE) {
                    config = Bitmap.Config.RGBA_F16;
                }
                options.inPreferredConfig = config;
                int i9 = options.outWidth;
                try {
                    if (i9 <= 0 || (i = options.outHeight) <= 0) {
                        options.inSampleSize = 1;
                        options.inScaled = false;
                    } else {
                        int i10 = (i7 == 90 || i7 == 270) ? i : i9;
                        if (i7 != 90 && i7 != 270) {
                            i9 = i;
                        }
                        ai3 ai3Var = jq2Var.b;
                        ma3 ma3Var = jq2Var.c;
                        long jF = av1.f(i10, i9, ai3Var, ma3Var, (ai3) y64.A(jq2Var, rm1.b));
                        int i11 = (int) (jF >> 32);
                        int i12 = (int) (jF & 4294967295L);
                        int iHighestOneBit = Integer.highestOneBit(i10 / i11);
                        int iHighestOneBit2 = Integer.highestOneBit(i9 / i12);
                        int iOrdinal = ma3Var.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                iMin = Math.max(iHighestOneBit, iHighestOneBit2);
                            } else {
                                u41.e();
                            }
                            return null;
                        }
                        iMin = Math.min(iHighestOneBit, iHighestOneBit2);
                        if (iMin < 1) {
                            iMin = 1;
                        }
                        options.inSampleSize = iMin;
                        double d = iMin;
                        double d2 = i11;
                        double d3 = i12;
                        double d4 = d2 / (((double) i10) / d);
                        double d5 = d3 / (((double) i9) / d);
                        int iOrdinal2 = ma3Var.ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 == 1) {
                                dMax = Math.min(d4, d5);
                            } else {
                                u41.e();
                            }
                            return null;
                        }
                        dMax = Math.max(d4, d5);
                        if (jq2Var.d == wx2.d && dMax > r3) {
                            dMax = 1.0d;
                        }
                        boolean z3 = dMax == r3;
                        options.inScaled = !z3;
                        if (!z3) {
                            if (dMax > r3) {
                                options.inDensity = gb2.Q(2.147483647E9d / dMax);
                                options.inTargetDensity = IntCompanionObject.MAX_VALUE;
                            } else {
                                options.inDensity = IntCompanionObject.MAX_VALUE;
                                options.inTargetDensity = gb2.Q(2.147483647E9d * dMax);
                            }
                        }
                        i4 = 1;
                    }
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new cy(u23Var, i4), null, options);
                    u23Var.close();
                    Exception exc3 = bvVar.d;
                    if (exc3 != null) {
                        throw exc3;
                    }
                    if (bitmapDecodeStream == null) {
                        u41.r("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                        return null;
                    }
                    bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                    if (z2 != 0 || i7 > 0) {
                        Matrix matrix = new Matrix();
                        float width = bitmapDecodeStream.getWidth() / 2.0f;
                        float height = bitmapDecodeStream.getHeight() / 2.0f;
                        if (z2) {
                            matrix.postScale(-1.0f, 1.0f, width, height);
                        }
                        if (i7 > 0) {
                            matrix.postRotate(i7, width, height);
                        }
                        RectF rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                        matrix.mapRect(rectF);
                        float f = rectF.left;
                        if (f != 0.0f || rectF.top != 0.0f) {
                            matrix.postTranslate(-f, -rectF.top);
                        }
                        if (i7 == 90 || i7 == 270) {
                            int height2 = bitmapDecodeStream.getHeight();
                            int width2 = bitmapDecodeStream.getWidth();
                            Bitmap.Config config2 = bitmapDecodeStream.getConfig();
                            if (config2 == null) {
                                config2 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(height2, width2, config2);
                        } else {
                            int width3 = bitmapDecodeStream.getWidth();
                            int height3 = bitmapDecodeStream.getHeight();
                            Bitmap.Config config3 = bitmapDecodeStream.getConfig();
                            if (config3 == null) {
                                config3 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(width3, height3, config3);
                        }
                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, w51.a);
                        bitmapDecodeStream.recycle();
                        bitmapDecodeStream = bitmapCreateBitmap;
                    }
                    am1 am1VarU = vl0.u(new BitmapDrawable(context.getResources(), bitmapDecodeStream));
                    boolean z4 = true;
                    if (options.inSampleSize <= 1 && !options.inScaled) {
                        z4 = false;
                    }
                    return new bs0(am1VarU, z4);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        jr1.i(u23Var, th);
                        throw th2;
                    }
                }
                break;
            case 4:
                ((d01) obj).b.invoke();
                return w84Var;
            case 5:
                String str2 = (String) obj;
                int length = str2.length();
                return cl3.d(new ey3(str2, p23.d(length, length), 4));
            case 6:
                ((UriHandler) obj).openUri("https://notrack.ai/api/oauth.php?do=start&return=app&ch=play&pkg=ai.notrack.app");
                return w84Var;
            case 7:
                return Boolean.valueOf(((Number) ((gn3) obj).getValue()).intValue() < 220);
            case 8:
                return ((List) obj).iterator();
            case 9:
                return kr1.T((ps2) obj);
            case 10:
                return new yz0(i5, (zz0) obj);
            case 11:
                kf1 kf1Var = (kf1) obj;
                wm1 wm1Var = kf1Var.a;
                jq2 jq2Var2 = kf1Var.b;
                wm1 wm1VarN = sf3.N(wm1Var, true);
                try {
                    Movie movieDecodeStream = Movie.decodeStream(wm1VarN.D().P());
                    xp1.g(wm1VarN, null);
                    if (movieDecodeStream == null || movieDecodeStream.width() <= 0 || movieDecodeStream.height() <= 0) {
                        u41.r("Failed to decode GIF.");
                        return null;
                    }
                    kg2 kg2Var = new kg2(movieDecodeStream, (movieDecodeStream.isOpaque() && ((Boolean) y64.A(jq2Var2, sm1.g)).booleanValue()) ? Bitmap.Config.RGB_565 : yh4.I(sm1.a(jq2Var2)) ? Bitmap.Config.ARGB_8888 : (Bitmap.Config) y64.A(jq2Var2, sm1.b), jq2Var2.c);
                    int iIntValue = ((Number) y64.A(jq2Var2, yo4.i)).intValue();
                    if (iIntValue < -1) {
                        u41.h(ud2.m(iIntValue, "Invalid repeatCount: "));
                        return null;
                    }
                    kg2Var.y = iIntValue;
                    je1 je1Var = (je1) y64.A(jq2Var2, yo4.k);
                    je1 je1Var2 = (je1) y64.A(jq2Var2, yo4.l);
                    if (je1Var != null || je1Var2 != null) {
                        kg2Var.m.add(new oa4(je1Var, je1Var2));
                    }
                    if (y64.A(jq2Var2, yo4.j) != null) {
                        m51.t();
                        return null;
                    }
                    kg2Var.z = null;
                    kg2Var.A = lv2.c;
                    kg2Var.B = false;
                    kg2Var.invalidateSelf();
                    return new bs0(vl0.u(kg2Var), false);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        xp1.g(wm1VarN, th3);
                        throw th4;
                    }
                }
            case 12:
                String str3 = HtmlPreviewActivity.D;
                ((HtmlPreviewActivity) obj).finish();
                return w84Var;
            case 13:
                Context context2 = (Context) ((ir3) obj).c;
                double d6 = 0.2d;
                try {
                    Object systemService = context2.getSystemService((Class<Object>) ActivityManager.class);
                    systemService.getClass();
                    if (((ActivityManager) systemService).isLowRamDevice()) {
                        d6 = 0.15d;
                    }
                } catch (Exception unused3) {
                }
                if (0.0d > d6 || d6 > 1.0d) {
                    u41.k("percent must be in the range [0.0, 1.0].");
                    return null;
                }
                kn4 kn4Var = new kn4(8);
                try {
                    Object systemService2 = context2.getSystemService((Class<Object>) ActivityManager.class);
                    systemService2.getClass();
                    ActivityManager activityManager = (ActivityManager) systemService2;
                    largeMemoryClass = (context2.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                    break;
                } catch (Exception unused4) {
                    largeMemoryClass = FontInfo.NUMBER_OF_CHAR_CODES;
                }
                return new k33(new q33((long) (d6 * ((long) largeMemoryClass) * 1048576), kn4Var), kn4Var);
            case 14:
                int i13 = MainActivity.L;
                return new g92((MainActivity) obj);
            case 15:
                return (c33) ((g33) obj).a.e.getValue();
            case 16:
                b bVar = (b) obj;
                ClassLoader classLoader = bVar.h;
                a71 a71Var = bVar.l;
                Enumeration<URL> resources = classLoader.getResources(BuildConfig.VERSION_NAME);
                resources.getClass();
                ArrayList list = Collections.list(resources);
                list.getClass();
                ArrayList arrayList = new ArrayList();
                int size = list.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj2 = list.get(i14);
                    i14++;
                    URL url = (URL) obj2;
                    url.getClass();
                    if (kr1.n(url.getProtocol(), "file")) {
                        String str4 = mt2.d;
                        String string = new File(url.toURI()).toString();
                        string.getClass();
                        ps2Var2 = new ps2(a71Var, Path$Companion.get(string));
                    } else {
                        ps2Var2 = null;
                    }
                    if (ps2Var2 != null) {
                        arrayList.add(ps2Var2);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                resources2.getClass();
                ArrayList list2 = Collections.list(resources2);
                list2.getClass();
                ArrayList arrayList2 = new ArrayList();
                int size2 = list2.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj3 = list2.get(i15);
                    i15++;
                    URL url2 = (URL) obj3;
                    url2.getClass();
                    String string2 = url2.toString();
                    string2.getClass();
                    if (to3.q0(string2, "jar:file:", false) && (iF0 = mo3.F0(string2, "!", 6)) != -1) {
                        String str5 = mt2.d;
                        String string3 = new File(URI.create(string2.substring(4, iF0))).toString();
                        string3.getClass();
                        ps2Var = new ps2(wj4.c(Path$Companion.get(string3), a71Var, new a()), b.n);
                    } else {
                        ps2Var = null;
                    }
                    if (ps2Var != null) {
                        arrayList2.add(ps2Var);
                    }
                }
                return ke0.H0(arrayList, arrayList2);
            case 17:
                return gm4.i("notrack.ai.data.api.ChatEvent", nx2.n, new tf3[0], new qc3((rc3) obj, i5));
            case 18:
                return obj;
            case 19:
                vf3 vf3Var = (vf3) obj;
                return Integer.valueOf(yo4.C(vf3Var, vf3Var.k));
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                File file = new File(((ef4) obj).a.getCacheDir(), "voice");
                file.mkdirs();
                return file;
            case 21:
                qh4 qh4Var = (qh4) obj;
                String str6 = b41.a;
                wh4 wh4Var = qh4Var.a;
                HashSet hashSet = new HashSet();
                hashSet.addAll(qh4Var.e);
                HashSet hashSetB = qh4.b(qh4Var);
                Iterator it = hashSet.iterator();
                do {
                    if (!it.hasNext()) {
                        hashSet.removeAll(qh4Var.e);
                        c = 0;
                    }
                    if (c == 0) {
                        m51.j(qh4Var, ")", "WorkContinuation has cycles (");
                        return null;
                    }
                    workDatabase = wh4Var.c;
                    jl0Var = wh4Var.b;
                    workDatabase.c();
                    try {
                        jr1.g(workDatabase, jl0Var, qh4Var);
                        zA = b41.a(qh4Var);
                        workDatabase.p();
                        workDatabase.k();
                        if (zA) {
                            return w84Var;
                        }
                        ya3.b(jl0Var, wh4Var.c, wh4Var.e);
                        return w84Var;
                    } catch (Throwable th5) {
                        workDatabase.k();
                        throw th5;
                    }
                } while (!hashSetB.contains((String) it.next()));
                if (c == 0) {
                    m51.j(qh4Var, ")", "WorkContinuation has cycles (");
                    return null;
                }
                workDatabase = wh4Var.c;
                jl0Var = wh4Var.b;
                workDatabase.c();
                jr1.g(workDatabase, jl0Var, qh4Var);
                zA = b41.a(qh4Var);
                workDatabase.p();
                workDatabase.k();
                if (zA) {
                    return w84Var;
                }
                ya3.b(jl0Var, wh4Var.c, wh4Var.e);
                return w84Var;
            default:
                wh4 wh4Var2 = (wh4) obj;
                WorkDatabase workDatabase2 = wh4Var2.c;
                Context context3 = wh4Var2.a;
                String str7 = kr3.n;
                if (Build.VERSION.SDK_INT >= 34) {
                    ks1.a(context3).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context3.getSystemService("jobscheduler");
                ArrayList arrayListD = kr3.d(context3, jobScheduler);
                if (arrayListD != null && !arrayListD.isEmpty()) {
                    int size3 = arrayListD.size();
                    while (i5 < size3) {
                        Object obj4 = arrayListD.get(i5);
                        i5++;
                        kr3.b(jobScheduler, ((JobInfo) obj4).getId());
                    }
                }
                ji4 ji4VarU = workDatabase2.u();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) ji4VarU.a;
                workDatabase_Impl.b();
                hr3 hr3Var = (hr3) ji4VarU.m;
                he1 he1VarA = hr3Var.a();
                try {
                    workDatabase_Impl.c();
                    try {
                        he1VarA.a();
                        workDatabase_Impl.p();
                        workDatabase_Impl.k();
                        hr3Var.j(he1VarA);
                        ya3.b(wh4Var2.b, workDatabase2, wh4Var2.e);
                        return w84Var;
                    } catch (Throwable th6) {
                        workDatabase_Impl.k();
                        throw th6;
                    }
                } catch (Throwable th7) {
                    hr3Var.j(he1VarA);
                    throw th7;
                }
        }
    }
}
