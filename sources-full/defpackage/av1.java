package defpackage;

import ai.notrack.app.R;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import app.template.extension.BuildConfig;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;
import okio.Options$Companion;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes.dex */
public abstract class av1 {
    public static final d5 c;
    public static final d5 d;
    public static boolean f;
    public static Method g;
    public static boolean h;
    public static Field i;
    public static final Object a = new Object();
    public static final jn1 b = new jn1(false);
    public static final Object e = new Object();

    static {
        int i2 = 16;
        c = new d5("NULL", i2);
        d = new d5("UNINITIALIZED", i2);
    }

    public static final int A(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final boolean B(Object obj) {
        return obj == sf3.a;
    }

    public static final boolean C(db1 db1Var) {
        ux1 ux1Var;
        wl2 coordinator$ui_release;
        ux1 ux1Var2;
        wl2 coordinator$ui_release2 = db1Var.getCoordinator$ui_release();
        return (coordinator$ui_release2 == null || (ux1Var = coordinator$ui_release2.t) == null || !ux1Var.G() || (coordinator$ui_release = db1Var.getCoordinator$ui_release()) == null || (ux1Var2 = coordinator$ui_release.t) == null || !ux1Var2.F()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void F(Context context, String str) {
        synchronized (a) {
            if (str.equals(BuildConfig.VERSION_NAME)) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    try {
                        xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                        xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                        xmlSerializerNewSerializer.startTag(null, "locales");
                        xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                        xmlSerializerNewSerializer.endTag(null, "locales");
                        xmlSerializerNewSerializer.endDocument();
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Throwable th) {
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", e2);
                    if (fileOutputStreamOpenFileOutput != null) {
                        fileOutputStreamOpenFileOutput.close();
                    }
                }
            } catch (FileNotFoundException unused3) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0046 A[EXC_TOP_SPLITTER, PHI: r1
  0x0046: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:29:0x0053, B:23:0x0044] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static String G(Context context) {
        String attributeValue;
        synchronized (a) {
            attributeValue = BuildConfig.VERSION_NAME;
            try {
                try {
                    FileInputStream fileInputStreamOpenFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    try {
                        try {
                            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                            xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                            int depth = xmlPullParserNewPullParser.getDepth();
                            while (true) {
                                int next = xmlPullParserNewPullParser.next();
                                if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                                    if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                        attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (fileInputStreamOpenFileInput != null) {
                                try {
                                    fileInputStreamOpenFileInput.close();
                                } catch (IOException unused) {
                                }
                            }
                        } catch (Throwable th) {
                            if (fileInputStreamOpenFileInput != null) {
                                try {
                                    fileInputStreamOpenFileInput.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } catch (IOException | XmlPullParserException unused3) {
                        Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                    }
                    if (attributeValue.isEmpty()) {
                        context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (FileNotFoundException unused4) {
                return BuildConfig.VERSION_NAME;
            }
        }
        return attributeValue;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c3 A[PHI: r0
  0x00c3: PHI (r0v12 int) = (r0v6 int), (r0v7 int), (r0v8 int), (r0v9 int) binds: [B:54:0x00c1, B:57:0x00c6, B:60:0x00ca, B:63:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0190  */
    public static final Object H(db1 db1Var, int i2, le1 le1Var) {
        int i3;
        int i4;
        Object objInvoke;
        of2 of2VarE;
        g02 g02Var;
        int i5;
        yd ydVar;
        if (!db1Var.getNode().isAttached()) {
            po1.b("visitAncestors called on an unattached node");
        }
        of2 parent$ui_release = db1Var.getNode().getParent$ui_release();
        ux1 ux1VarM = y64.M(db1Var);
        loop0: while (true) {
            i3 = 0;
            i4 = 1;
            objInvoke = null;
            if (ux1VarM == null) {
                of2VarE = null;
                break;
            }
            if ((((of2) ux1VarM.N.f).getAggregateChildKindSet$ui_release() & 1024) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & 1024) != 0) {
                        of2VarE = parent$ui_release;
                        oi2 oi2Var = null;
                        while (of2VarE != null) {
                            if (of2VarE instanceof db1) {
                                break loop0;
                            }
                            if ((of2VarE.getKindSet$ui_release() & 1024) != 0 && (of2VarE instanceof ju0)) {
                                int i6 = 0;
                                for (of2 child$ui_release = ((ju0) of2VarE).d; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                                    if ((child$ui_release.getKindSet$ui_release() & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            of2VarE = child$ui_release;
                                        } else {
                                            if (oi2Var == null) {
                                                oi2Var = new oi2(0, new of2[16]);
                                            }
                                            if (of2VarE != null) {
                                                oi2Var.c(of2VarE);
                                                of2VarE = null;
                                            }
                                            oi2Var.c(child$ui_release);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            of2VarE = y64.e(oi2Var);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            ux1VarM = ux1VarM.t();
            parent$ui_release = (ux1VarM == null || (ydVar = ux1VarM.N) == null) ? null : (es3) ydVar.e;
        }
        db1 db1Var2 = (db1) of2VarE;
        if (db1Var2 != null) {
            p13 p13Var = pt.a;
            if (!kr1.n((g02) db1Var2.c(p13Var), (g02) db1Var.c(p13Var))) {
                g02Var = (g02) db1Var.c(pt.a);
                if (g02Var != null) {
                    i5 = 5;
                    if (i2 == 5) {
                        i4 = i5;
                    } else {
                        i5 = 6;
                        if (i2 == 6) {
                            i4 = i5;
                        } else {
                            i5 = 3;
                            if (i2 == 3) {
                                i4 = i5;
                            } else {
                                i5 = 4;
                                if (i2 == 4) {
                                    i4 = i5;
                                } else if (i2 == 1) {
                                    i4 = 2;
                                } else if (i2 != 2) {
                                    u41.r("Unsupported direction for beyond bounds layout");
                                }
                            }
                        }
                    }
                    if (g02Var.c.a() > 0 || !g02Var.c.c() || !g02Var.isAttached()) {
                        return le1Var.invoke(g02.m);
                    }
                    boolean zW0 = g02Var.w0(i4);
                    h02 h02Var = g02Var.c;
                    int iB = zW0 ? h02Var.b() : h02Var.e();
                    q43 q43Var = new q43();
                    jx jxVar = g02Var.d;
                    jxVar.getClass();
                    d02 d02Var = new d02(iB, iB);
                    jxVar.a.c(d02Var);
                    q43Var.c = d02Var;
                    int iD = g02Var.c.d() * 2;
                    int iA = g02Var.c.a();
                    if (iD > iA) {
                        iD = iA;
                    }
                    while (objInvoke == null && g02Var.v0((d02) q43Var.c, i4) && i3 < iD) {
                        d02 d02Var2 = (d02) q43Var.c;
                        int i7 = d02Var2.a;
                        int i8 = d02Var2.b;
                        if (g02Var.w0(i4)) {
                            i8++;
                        } else {
                            i7--;
                        }
                        jx jxVar2 = g02Var.d;
                        jxVar2.getClass();
                        d02 d02Var3 = new d02(i7, i8);
                        jxVar2.a.c(d02Var3);
                        g02Var.d.a.l((d02) q43Var.c);
                        q43Var.c = d02Var3;
                        i3++;
                        y64.M(g02Var).k();
                        objInvoke = le1Var.invoke(new f02(g02Var, q43Var, i4));
                    }
                    g02Var.d.a.l((d02) q43Var.c);
                    y64.M(g02Var).k();
                    return objInvoke;
                }
            }
        } else {
            g02Var = (g02) db1Var.c(pt.a);
            if (g02Var != null) {
                i5 = 5;
                if (i2 == 5) {
                    i4 = i5;
                } else {
                    i5 = 6;
                    if (i2 == 6) {
                        i4 = i5;
                    } else {
                        i5 = 3;
                        if (i2 == 3) {
                            i4 = i5;
                        } else {
                            i5 = 4;
                            if (i2 == 4) {
                                i4 = i5;
                            } else if (i2 == 1) {
                                i4 = 2;
                            } else if (i2 != 2) {
                                u41.r("Unsupported direction for beyond bounds layout");
                            }
                        }
                    }
                }
                if (g02Var.c.a() > 0) {
                }
                return le1Var.invoke(g02.m);
            }
        }
        return null;
    }

    public static boolean I(CharSequence charSequence, Object obj, int i2) {
        return (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(obj) == i2;
    }

    public static void J(Context context, int i2, String str, String str2, String str3, PendingIntent pendingIntent) {
        NotificationManager notificationManager;
        context.getClass();
        str2.getClass();
        str3.getClass();
        rm2 rm2Var = new rm2(context);
        if (rm2Var.b.areNotificationsEnabled()) {
            if (Build.VERSION.SDK_INT >= 26 && (notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class)) != null) {
                if (notificationManager.getNotificationChannel("updates") == null) {
                    ap.k();
                    NotificationChannel notificationChannelZ = ap.z(context.getString(R.string.notif_channel_updates));
                    notificationChannelZ.setDescription(context.getString(R.string.notif_channel_updates_desc));
                    notificationManager.createNotificationChannel(notificationChannelZ);
                }
                if (notificationManager.getNotificationChannel("offers") == null) {
                    ap.k();
                    NotificationChannel notificationChannelD = ap.D(context.getString(R.string.notif_channel_offers));
                    notificationChannelD.setDescription(context.getString(R.string.notif_channel_offers_desc));
                    notificationManager.createNotificationChannel(notificationChannelD);
                }
            }
            mm2 mm2Var = new mm2(context, str);
            Notification notification = mm2Var.p;
            notification.icon = R.drawable.ic_notification;
            mm2Var.e = mm2.b(str2);
            mm2Var.f = mm2.b(str3);
            bi4 bi4Var = new bi4();
            bi4Var.d = mm2.b(str3);
            mm2Var.c(bi4Var);
            mm2Var.m = -16411031;
            notification.flags |= 16;
            mm2Var.g = pendingIntent;
            mm2Var.h = 0;
            Notification notificationA = mm2Var.a();
            notificationA.getClass();
            try {
                rm2Var.a(i2, notificationA);
            } catch (SecurityException unused) {
            }
        }
    }

    public static final List K(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(ke0.y0(list));
        }
        return z21.c;
    }

    public static final Map L(Map map) {
        int size = map.size();
        if (size == 0) {
            return a31.c;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) ke0.x0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static int M(bw0 bw0Var, ma3 ma3Var) {
        if (bw0Var instanceof zv0) {
            return ((zv0) bw0Var).a;
        }
        int iOrdinal = ma3Var.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return IntCompanionObject.MAX_VALUE;
        }
        u41.e();
        return 0;
    }

    public static String N(int i2) {
        if (i2 == 1) {
            return "Clip";
        }
        if (i2 == 2) {
            return "Ellipsis";
        }
        if (i2 == 5) {
            return "MiddleEllipsis";
        }
        if (i2 == 3) {
            return "Visible";
        }
        return i2 == 4 ? "StartEllipsis" : "Invalid";
    }

    public static final void O(int i2, int i3) {
        if (!(i2 > 0 && i3 > 0)) {
            so1.a("both minLines " + i2 + " and maxLines " + i3 + " must be greater than zero");
        }
        if (i2 <= i3) {
            return;
        }
        so1.a("minLines " + i2 + " must be less than or equal to maxLines " + i3);
    }

    public static int P(Canvas canvas, CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            zy3[] zy3VarArr = (zy3[]) spanned.getSpans(0, spanned.length(), zy3.class);
            TextView textView = null;
            Layout layout = (zy3VarArr == null || zy3VarArr.length <= 0) ? null : (Layout) zy3VarArr[0].a.get();
            if (layout != null) {
                return layout.getWidth();
            }
            c04[] c04VarArr = (c04[]) spanned.getSpans(0, spanned.length(), c04.class);
            if (c04VarArr != null && c04VarArr.length > 0) {
                textView = (TextView) c04VarArr[0].a.get();
            }
            if (textView != null) {
                return (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight();
            }
        }
        return canvas.getWidth();
    }

    public static xf a(float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return new xf(mb4.a, Float.valueOf(f2), new yf(f3), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final long b(float f2, float f3) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
        int i2 = e54.c;
        return jFloatToRawIntBits;
    }

    public static final void c(ss3 ss3Var, dt3 dt3Var, String str) {
        et3 et3Var = et3.h;
        et3.i.fine(dt3Var.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + ss3Var.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0027  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int d(int r2, int r3, int r4, boolean r5) {
        /*
            r0 = 0
            if (r3 < r4) goto L8
            if (r5 == 0) goto L6
            return r0
        L6:
            int r4 = r4 - r3
            return r4
        L8:
            if (r5 != 0) goto Ld
            if (r3 > r2) goto L16
            goto L11
        Ld:
            int r1 = r4 - r3
            if (r1 <= r2) goto L16
        L11:
            if (r5 == 0) goto L14
            goto L21
        L14:
            int r2 = r2 - r3
            return r2
        L16:
            if (r5 == 0) goto L1b
            if (r3 > r2) goto L24
            goto L1f
        L1b:
            int r1 = r4 - r3
            if (r1 <= r2) goto L24
        L1f:
            if (r5 != 0) goto L22
        L21:
            return r2
        L22:
            int r2 = r2 - r3
            return r2
        L24:
            if (r5 != 0) goto L27
            return r0
        L27:
            int r4 = r4 - r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.av1.d(int, int, int, boolean):int");
    }

    public static final void e(wh4 wh4Var, String str) {
        aj4 aj4VarB;
        WorkDatabase workDatabase = wh4Var.c;
        workDatabase.getClass();
        ji4 ji4VarU = workDatabase.u();
        bv0 bv0VarF = workDatabase.f();
        ArrayList arrayListV = kr1.V(str);
        while (!arrayListV.isEmpty()) {
            String str2 = (String) pe0.t0(arrayListV);
            int iK = ji4VarU.k(str2);
            if (iK != 3 && iK != 4) {
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) ji4VarU.a;
                workDatabase_Impl.b();
                hr3 hr3Var = (hr3) ji4VarU.e;
                he1 he1VarA = hr3Var.a();
                he1VarA.i(1, str2);
                try {
                    workDatabase_Impl.c();
                    try {
                        he1VarA.a();
                        workDatabase_Impl.p();
                        workDatabase_Impl.k();
                        hr3Var.j(he1VarA);
                    } catch (Throwable th) {
                        workDatabase_Impl.k();
                        throw th;
                    }
                } catch (Throwable th2) {
                    hr3Var.j(he1VarA);
                    throw th2;
                }
            }
            arrayListV.addAll(bv0VarF.y(str2));
        }
        tz2 tz2Var = wh4Var.f;
        tz2Var.getClass();
        synchronized (tz2Var.k) {
            v72.f().c(tz2.l, "Processor cancelling " + str);
            tz2Var.i.add(str);
            aj4VarB = tz2Var.b(str);
        }
        tz2.d(str, aj4VarB, 1);
        Iterator it = wh4Var.e.iterator();
        while (it.hasNext()) {
            ((ua3) it.next()).a(str);
        }
    }

    public static final long f(int i2, int i3, ai3 ai3Var, ma3 ma3Var, ai3 ai3Var2) {
        int i4;
        int i5;
        if (!kr1.n(ai3Var, ai3.c)) {
            i2 = M(ai3Var.a, ma3Var);
            i3 = M(ai3Var.b, ma3Var);
        }
        bw0 bw0Var = ai3Var2.a;
        bw0 bw0Var2 = ai3Var2.b;
        if ((bw0Var instanceof zv0) && i2 != Integer.MIN_VALUE && i2 != Integer.MAX_VALUE && i2 > (i5 = ((zv0) bw0Var).a)) {
            i2 = i5;
        }
        if ((bw0Var2 instanceof zv0) && i3 != Integer.MIN_VALUE && i3 != Integer.MAX_VALUE && i3 > (i4 = ((zv0) bw0Var2).a)) {
            i3 = i4;
        }
        return (((long) i3) & 4294967295L) | (((long) i2) << 32);
    }

    public static final double g(int i2, int i3, int i4, int i5, ma3 ma3Var) {
        double d2 = ((double) i4) / ((double) i2);
        double d3 = ((double) i5) / ((double) i3);
        int iOrdinal = ma3Var.ordinal();
        if (iOrdinal == 0) {
            return Math.max(d2, d3);
        }
        if (iOrdinal == 1) {
            return Math.min(d2, d3);
        }
        u41.e();
        return 0.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (g(r0.getWidth(), r0.getHeight(), (int) (r4 >> 32), (int) (r4 & 4294967295L), r11) == 1.0d) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap j(android.graphics.drawable.Drawable r8, android.graphics.Bitmap.Config r9, defpackage.ai3 r10, defpackage.ma3 r11, boolean r12) {
        /*
            boolean r0 = r8 instanceof android.graphics.drawable.BitmapDrawable
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r3 = 32
            if (r0 == 0) goto L4e
            r0 = r8
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            android.graphics.Bitmap$Config r4 = r0.getConfig()
            if (r9 == 0) goto L21
            boolean r5 = defpackage.yh4.I(r9)
            if (r5 == 0) goto L1f
            goto L21
        L1f:
            r5 = r9
            goto L23
        L21:
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
        L23:
            if (r4 != r5) goto L4e
            if (r12 == 0) goto L28
            goto L4d
        L28:
            int r12 = r0.getWidth()
            int r4 = r0.getHeight()
            ai3 r5 = defpackage.ai3.c
            long r4 = f(r12, r4, r10, r11, r5)
            long r6 = r4 >> r3
            int r12 = (int) r6
            long r4 = r4 & r1
            int r4 = (int) r4
            int r5 = r0.getWidth()
            int r6 = r0.getHeight()
            double r4 = g(r5, r6, r12, r4, r11)
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 != 0) goto L4e
        L4d:
            return r0
        L4e:
            android.graphics.drawable.Drawable r8 = r8.mutate()
            int r12 = defpackage.ta4.b(r8)
            r0 = 512(0x200, float:7.175E-43)
            if (r12 <= 0) goto L5b
            goto L5c
        L5b:
            r12 = r0
        L5c:
            int r4 = defpackage.ta4.a(r8)
            if (r4 <= 0) goto L63
            r0 = r4
        L63:
            ai3 r4 = defpackage.ai3.c
            long r4 = f(r12, r0, r10, r11, r4)
            long r6 = r4 >> r3
            int r10 = (int) r6
            long r1 = r1 & r4
            int r1 = (int) r1
            double r10 = g(r12, r0, r10, r1, r11)
            double r1 = (double) r12
            double r1 = r1 * r10
            int r12 = defpackage.gb2.Q(r1)
            double r0 = (double) r0
            double r10 = r10 * r0
            int r10 = defpackage.gb2.Q(r10)
            if (r9 == 0) goto L86
            boolean r11 = defpackage.yh4.I(r9)
            if (r11 == 0) goto L88
        L86:
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
        L88:
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r12, r10, r9)
            android.graphics.Rect r11 = r8.getBounds()
            int r0 = r11.left
            int r1 = r11.top
            int r2 = r11.right
            int r11 = r11.bottom
            r3 = 0
            r8.setBounds(r3, r3, r12, r10)
            android.graphics.Canvas r10 = new android.graphics.Canvas
            r10.<init>(r9)
            r8.draw(r10)
            r8.setBounds(r0, r1, r2, r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.av1.j(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, ai3, ma3, boolean):android.graphics.Bitmap");
    }

    public static xf k(xf xfVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = ((Number) xfVar.d.getValue()).floatValue();
        }
        if ((i2 & 2) != 0) {
            f3 = ((yf) xfVar.h).a;
        }
        return new xf(xfVar.c, Float.valueOf(f2), new yf(f3), xfVar.l, xfVar.m, xfVar.n);
    }

    public static InputConnection l(InputConnection inputConnection, EditorInfo editorInfo, bp1 bp1Var) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25) {
            return new zo1(inputConnection, bp1Var);
        }
        String[] strArr = kr1.i;
        if (i2 >= 25) {
            String[] strArr2 = editorInfo.contentMimeTypes;
            if (strArr2 != null) {
                strArr = strArr2;
            }
        } else {
            Bundle bundle = editorInfo.extras;
            if (bundle != null) {
                String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                if (stringArray == null) {
                    stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                }
                if (stringArray != null) {
                    strArr = stringArray;
                }
            }
        }
        return strArr.length == 0 ? inputConnection : new ap1(inputConnection, bp1Var);
    }

    public static boolean n(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = zc4.a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = yc4.d;
            yc4 yc4Var = (yc4) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (yc4Var == null) {
                yc4Var = new yc4();
                yc4Var.a = null;
                yc4Var.b = null;
                yc4Var.c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, yc4Var);
            }
            WeakReference weakReference2 = yc4Var.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                yc4Var.c = new WeakReference(keyEvent);
                if (yc4Var.b == null) {
                    yc4Var.b = new SparseArray();
                }
                SparseArray sparseArray = yc4Var.b;
                if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
                    sparseArray.removeAt(iIndexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    m51.t();
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean o(zu1 zu1Var, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (zu1Var != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return zu1Var.c(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f) {
                            try {
                                g = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f = true;
                        }
                        Method method = g;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (zc4.b(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!h) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        i = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    h = true;
                }
                Field field = i;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (zc4.b(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && zc4.b(view, keyEvent)) || zu1Var.c(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static final db1 q(db1 db1Var) {
        db1 db1Var2 = ((va1) y64.N(db1Var).getFocusOwner()).l;
        if (db1Var2 == null || !db1Var2.isAttached()) {
            return null;
        }
        return db1Var2;
    }

    public static final qu1 r(rc3 rc3Var, nk0 nk0Var, String str) {
        qu1 qu1Var;
        rc3Var.getClass();
        vc0 vc0Var = rc3Var.a;
        qu1 qu1Var2 = (qu1) rc3Var.e.get(str);
        if (qu1Var2 != null) {
            qu1Var = qu1Var2;
        } else {
            nk0Var.r().getClass();
            y64.E(1, null);
            qu1Var = null;
        }
        if (qu1Var != null) {
            return qu1Var;
        }
        jr1.K(vc0Var, str);
        throw null;
    }

    public static final qu1 s(rc3 rc3Var, do3 do3Var, Object obj) {
        qu1 qu1Var;
        rc3Var.getClass();
        vc0 vc0Var = rc3Var.a;
        obj.getClass();
        qu1 qu1Var2 = (qu1) rc3Var.d.get(r43.a(obj.getClass()));
        if (qu1Var2 != null) {
            qu1Var = qu1Var2;
        } else {
            do3Var.e.getClass();
            if (vc0Var.b(obj)) {
                y64.E(1, null);
            }
            qu1Var = null;
        }
        if (qu1Var == null) {
            qu1Var = null;
        }
        if (qu1Var != null) {
            return qu1Var;
        }
        vc0 vc0VarA = r43.a(obj.getClass());
        String classSimpleName = Options$Companion.getClassSimpleName(vc0VarA.c);
        if (classSimpleName == null) {
            classSimpleName = String.valueOf(vc0VarA);
        }
        jr1.K(vc0Var, classSimpleName);
        throw null;
    }

    public static final h43 t(db1 db1Var) {
        wl2 coordinator$ui_release = db1Var.getCoordinator$ui_release();
        return coordinator$ui_release != null ? y64.u(coordinator$ui_release).G(coordinator$ui_release, false) : h43.e;
    }

    public static final String u(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static final db1 v(db1 db1Var) {
        int iOrdinal;
        if (db1Var.getNode().isAttached()) {
            if (!db1Var.getNode().isAttached()) {
                po1.b("visitChildren called on an unattached node");
            }
            oi2 oi2Var = new oi2(0, new of2[16]);
            of2 child$ui_release = db1Var.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                y64.d(oi2Var, db1Var.getNode());
            } else {
                oi2Var.c(child$ui_release);
            }
            while (true) {
                int i2 = oi2Var.h;
                if (i2 == 0) {
                    break;
                }
                of2 of2VarE = (of2) oi2Var.m(i2 - 1);
                if ((of2VarE.getAggregateChildKindSet$ui_release() & 1024) == 0) {
                    y64.d(oi2Var, of2VarE);
                } else {
                    while (of2VarE != null) {
                        if ((of2VarE.getKindSet$ui_release() & 1024) != 0) {
                            oi2 oi2Var2 = null;
                            while (of2VarE != null) {
                                if (of2VarE instanceof db1) {
                                    db1 db1Var2 = (db1) of2VarE;
                                    if (db1Var2.getNode().isAttached() && ((iOrdinal = db1Var2.x0().ordinal()) == 0 || iOrdinal == 1 || iOrdinal == 2)) {
                                        return db1Var2;
                                    }
                                } else if ((of2VarE.getKindSet$ui_release() & 1024) != 0 && (of2VarE instanceof ju0)) {
                                    int i3 = 0;
                                    for (of2 child$ui_release2 = ((ju0) of2VarE).d; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                                        if ((child$ui_release2.getKindSet$ui_release() & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                of2VarE = child$ui_release2;
                                            } else {
                                                if (oi2Var2 == null) {
                                                    oi2Var2 = new oi2(0, new of2[16]);
                                                }
                                                if (of2VarE != null) {
                                                    oi2Var2.c(of2VarE);
                                                    of2VarE = null;
                                                }
                                                oi2Var2.c(child$ui_release2);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                of2VarE = y64.e(oi2Var2);
                            }
                            break;
                        }
                        of2VarE = of2VarE.getChild$ui_release();
                    }
                }
            }
        }
        return null;
    }

    public static final Rect w(TextPaint textPaint, CharSequence charSequence, int i2, int i3) {
        int i4 = i2;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i4 - 1, i3, MetricAffectingSpan.class) != i3) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i4 < i3) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i4, i3, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i4, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i4, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i4, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i4 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i4, i3, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i4, i3, rect3);
        return rect3;
    }

    public static String x(Context context, int i2) {
        if (context == null) {
            return BuildConfig.VERSION_NAME;
        }
        if (i2 == 1) {
            return context.getString(R.string.fingerprint_error_hw_not_available);
        }
        if (i2 != 7) {
            switch (i2) {
                case 9:
                    break;
                case 10:
                    return context.getString(R.string.fingerprint_error_user_canceled);
                case 11:
                    return context.getString(R.string.fingerprint_error_no_fingerprints);
                case 12:
                    return context.getString(R.string.fingerprint_error_hw_not_present);
                default:
                    Log.e("BiometricUtils", "Unknown error code: " + i2);
                    return context.getString(R.string.default_error_msg);
            }
        }
        return context.getString(R.string.fingerprint_error_lockout);
    }

    public static final long y(KeyEvent keyEvent) {
        return g13.b(keyEvent.getKeyCode());
    }

    public static final vc3 z(Object obj) {
        if (obj != sf3.a) {
            return (vc3) obj;
        }
        u41.r("Does not contain segment");
        return null;
    }

    public boolean D(byte[] bArr, int i2, int i3) {
        return E(bArr, i2, i3) == 0;
    }

    public abstract int E(byte[] bArr, int i2, int i3);

    public abstract void Q(my myVar);

    public abstract long h();

    public abstract ac2 i();

    public abstract String m(byte[] bArr, int i2, int i3);

    public abstract int p(String str, byte[] bArr, int i2, int i3);
}
