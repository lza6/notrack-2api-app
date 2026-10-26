package defpackage;

import ai.notrack.app.R;
import android.app.Notification;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PersistableBundle;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.material3.a;
import androidx.core.graphics.drawable.IconCompat;
import androidx.work.impl.WorkDatabase_Impl;
import app.template.extension.BuildConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.Adler32;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.uuid.Uuid;
import okio.Options$Companion;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class ci4 implements kw, ps3, dp1 {
    public static volatile ci4 m;
    public static final Object n = new Object();
    public final /* synthetic */ int c;
    public Object d;
    public Object h;
    public Object l;

    public ci4(int i) {
        this.c = i;
        switch (i) {
            case 8:
                lw3 lw3Var = new lw3();
                lw3Var.a = Float.NaN;
                this.d = lw3Var;
                this.h = new ur0();
                break;
            case 27:
                String string = UUID.randomUUID().toString();
                string.getClass();
                lz lzVar = lz.l;
                this.d = Path$Companion.encodeUtf8(string);
                this.h = yg2.n;
                this.l = new ArrayList();
                break;
            default:
                this.l = new sb3(4);
                break;
        }
    }

    public /* synthetic */ ci4(int i, boolean z) {
        this.c = i;
    }

    public ci4(a10 a10Var) {
        this.c = 12;
        this.l = a10Var;
        this.d = new jb(14, this);
    }

    public ci4(Context context, int i) {
        this.c = i;
        switch (i) {
            case 14:
                Context applicationContext = context.getApplicationContext();
                this.d = applicationContext;
                this.h = applicationContext.getSharedPreferences("chat_bg", 0);
                this.l = new File(applicationContext.getFilesDir(), "chatbg");
                break;
            default:
                this.l = context.getApplicationContext();
                this.h = new HashSet();
                this.d = new HashMap();
                break;
        }
    }

    public ci4(View view) {
        this.c = 23;
        this.d = view;
        this.h = yo4.H(q22.d, new j(18, this));
        this.l = new sk3(view);
    }

    public ci4(a aVar, wf wfVar, zr0 zr0Var, je1 je1Var) {
        this.c = 18;
        this.d = aVar;
        this.h = wfVar;
        this.l = zr0Var;
    }

    public ci4(WorkDatabase_Impl workDatabase_Impl) {
        this.c = 0;
        this.d = workDatabase_Impl;
        new av0(workDatabase_Impl, 4);
        this.h = new hr3(workDatabase_Impl, 2);
        this.l = new hr3(workDatabase_Impl, 3);
    }

    public ci4(gw1 gw1Var, List list) {
        this.c = 25;
        this.d = gw1Var;
        this.h = list;
        this.l = uf2.b;
    }

    public ci4(ir3 ir3Var, qn0 qn0Var, xs0 xs0Var, Set set) {
        this.c = 17;
        this.d = qn0Var;
        this.h = ir3Var;
        this.l = xs0Var;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            F(str, 0, str.length(), 1, true, new d5(str, 10));
        }
    }

    public /* synthetic */ ci4(Object obj, Object obj2, Object obj3, int i) {
        this.c = i;
        this.d = obj;
        this.h = obj2;
        this.l = obj3;
    }

    public ci4(Runnable runnable) {
        this.c = 26;
        this.h = new CopyOnWriteArrayList();
        this.l = new HashMap();
        this.d = runnable;
    }

    public ci4(Signature signature) {
        this.c = 19;
        this.d = signature;
        this.h = null;
        this.l = null;
    }

    public ci4(Cipher cipher) {
        this.c = 19;
        this.h = cipher;
        this.d = null;
        this.l = null;
    }

    public ci4(Mac mac) {
        this.c = 19;
        this.l = mac;
        this.h = null;
        this.d = null;
    }

    public ci4(lx2 lx2Var) {
        this.c = 29;
        this.l = lx2Var;
        this.h = jx2.c;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:82:0x027a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0283  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v2, types: [android.graphics.Bitmap, java.lang.Throwable] */
    public ci4(mm2 mm2Var) {
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        char c;
        Icon iconCreateWithBitmap;
        String strH;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        int i2;
        this.c = 28;
        new ArrayList();
        this.l = new Bundle();
        this.h = mm2Var;
        Context context = mm2Var.a;
        ArrayList arrayList3 = mm2Var.q;
        ArrayList arrayList4 = mm2Var.c;
        ArrayList arrayList5 = mm2Var.d;
        int i3 = 26;
        if (Build.VERSION.SDK_INT >= 26) {
            this.d = df0.b(context, mm2Var.n);
        } else {
            this.d = new Notification.Builder(context);
        }
        Notification notification = mm2Var.p;
        Object obj = null;
        int i4 = 0;
        ((Notification.Builder) this.d).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(mm2Var.e).setContentText(mm2Var.f).setContentInfo(null).setContentIntent(mm2Var.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & Uuid.SIZE_BITS) != 0).setNumber(0).setProgress(0, 0, false);
        ((Notification.Builder) this.d).setLargeIcon((Icon) null);
        ((Notification.Builder) this.d).setSubText(null).setUsesChronometer(false).setPriority(mm2Var.h);
        ArrayList arrayList6 = mm2Var.b;
        int size = arrayList6.size();
        int i5 = 0;
        while (i5 < size) {
            int i6 = i5 + 1;
            lm2 lm2Var = (lm2) arrayList6.get(i5);
            if (lm2Var.b == null && (i2 = lm2Var.e) != 0) {
                lm2Var.b = IconCompat.a(i2);
            }
            int i7 = i4;
            IconCompat iconCompat = lm2Var.b;
            boolean z = lm2Var.c;
            Bundle bundle = lm2Var.a;
            if (iconCompat != null) {
                ?? r18 = obj;
                int i8 = iconCompat.a;
                switch (i8) {
                    case -1:
                        arrayList3 = arrayList3;
                        arrayList4 = arrayList4;
                        arrayList5 = arrayList5;
                        arrayList6 = arrayList6;
                        size = size;
                        c = 2;
                        iconCreateWithBitmap = (Icon) iconCompat.b;
                        break;
                    case 0:
                    default:
                        u41.k("Unknown type");
                        throw r18;
                    case 1:
                        arrayList3 = arrayList3;
                        arrayList4 = arrayList4;
                        arrayList5 = arrayList5;
                        arrayList6 = arrayList6;
                        size = size;
                        c = 2;
                        iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.b);
                        colorStateList = iconCompat.g;
                        if (colorStateList != null) {
                            iconCreateWithBitmap.setTintList(colorStateList);
                        }
                        mode = iconCompat.h;
                        if (mode != IconCompat.k) {
                            iconCreateWithBitmap.setTintMode(mode);
                        }
                        break;
                    case 2:
                        arrayList3 = arrayList3;
                        arrayList4 = arrayList4;
                        arrayList5 = arrayList5;
                        arrayList6 = arrayList6;
                        size = size;
                        if (i8 == -1) {
                            Object obj2 = iconCompat.b;
                            if (Build.VERSION.SDK_INT >= 28) {
                                strH = og.h(obj2);
                            } else {
                                try {
                                    strH = (String) obj2.getClass().getMethod("getResPackage", null).invoke(obj2, null);
                                } catch (IllegalAccessException e) {
                                    Log.e("IconCompat", "Unable to get icon package", e);
                                    strH = null;
                                } catch (NoSuchMethodException e2) {
                                    Log.e("IconCompat", "Unable to get icon package", e2);
                                    strH = null;
                                } catch (InvocationTargetException e3) {
                                    Log.e("IconCompat", "Unable to get icon package", e3);
                                    strH = null;
                                }
                            }
                            c = 2;
                        } else {
                            c = 2;
                            if (i8 != 2) {
                                m51.A(iconCompat, "called getResPackage() on ");
                                throw null;
                            }
                            String str = iconCompat.j;
                            strH = (str == null || TextUtils.isEmpty(str)) ? ((String) iconCompat.b).split(":", -1)[i7] : iconCompat.j;
                        }
                        iconCreateWithBitmap = Icon.createWithResource(strH, iconCompat.e);
                        colorStateList = iconCompat.g;
                        if (colorStateList != null) {
                            iconCreateWithBitmap.setTintList(colorStateList);
                        }
                        mode = iconCompat.h;
                        if (mode != IconCompat.k) {
                            iconCreateWithBitmap.setTintMode(mode);
                        }
                        break;
                    case 3:
                        iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.b, iconCompat.e, iconCompat.f);
                        c = 2;
                        colorStateList = iconCompat.g;
                        if (colorStateList != null) {
                            iconCreateWithBitmap.setTintList(colorStateList);
                        }
                        mode = iconCompat.h;
                        if (mode != IconCompat.k) {
                            iconCreateWithBitmap.setTintMode(mode);
                        }
                        break;
                    case 4:
                        iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.b);
                        c = 2;
                        colorStateList = iconCompat.g;
                        if (colorStateList != null) {
                            iconCreateWithBitmap.setTintList(colorStateList);
                        }
                        mode = iconCompat.h;
                        if (mode != IconCompat.k) {
                            iconCreateWithBitmap.setTintMode(mode);
                        }
                        break;
                    case 5:
                        int i9 = Build.VERSION.SDK_INT;
                        Object obj3 = iconCompat.b;
                        if (i9 >= i3) {
                            iconCreateWithBitmap = df0.c((Bitmap) obj3);
                        } else {
                            Bitmap bitmap = (Bitmap) obj3;
                            int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(bitmapCreateBitmap);
                            Paint paint = new Paint(3);
                            float f = iMin * 0.5f;
                            paint.setColor(-16777216);
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                            Matrix matrix = new Matrix();
                            matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
                            bitmapShader.setLocalMatrix(matrix);
                            paint.setShader(bitmapShader);
                            canvas.drawCircle(f, f, f * 0.9166667f, paint);
                            canvas.setBitmap(r18);
                            iconCreateWithBitmap = Icon.createWithBitmap(bitmapCreateBitmap);
                        }
                        c = 2;
                        colorStateList = iconCompat.g;
                        if (colorStateList != null) {
                            iconCreateWithBitmap.setTintList(colorStateList);
                        }
                        mode = iconCompat.h;
                        if (mode != IconCompat.k) {
                            iconCreateWithBitmap.setTintMode(mode);
                        }
                        break;
                    case 6:
                        if (Build.VERSION.SDK_INT < 30) {
                            u41.j(iconCompat.c(), "Context is required to resolve the file uri of the icon: ");
                            throw r18;
                        }
                        iconCreateWithBitmap = k1.a(iconCompat.c());
                        c = 2;
                        colorStateList = iconCompat.g;
                        if (colorStateList != null) {
                            iconCreateWithBitmap.setTintList(colorStateList);
                        }
                        mode = iconCompat.h;
                        if (mode != IconCompat.k) {
                            iconCreateWithBitmap.setTintMode(mode);
                        }
                        break;
                        break;
                }
            } else {
                arrayList3 = arrayList3;
                arrayList4 = arrayList4;
                arrayList5 = arrayList5;
                arrayList6 = arrayList6;
                size = size;
                c = 2;
                iconCreateWithBitmap = null;
            }
            Notification.Action.Builder builder = new Notification.Action.Builder(iconCreateWithBitmap, lm2Var.f, lm2Var.g);
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putBoolean("android.support.allowGeneratedReplies", z);
            builder.setAllowGeneratedReplies(z);
            bundle2.putInt("android.support.action.semanticAction", i7);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                og.r(builder);
            }
            if (i10 >= 29) {
                vk.f(builder);
            }
            if (i10 >= 31) {
                pg.e(builder);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", lm2Var.d);
            builder.addExtras(bundle2);
            ((Notification.Builder) this.d).addAction(builder.build());
            i5 = i6;
            arrayList4 = arrayList4;
            arrayList6 = arrayList6;
            size = size;
            arrayList5 = arrayList5;
            arrayList3 = arrayList3;
            i3 = 26;
            obj = null;
            i4 = 0;
        }
        ArrayList arrayList7 = arrayList3;
        ArrayList arrayList8 = arrayList4;
        ArrayList arrayList9 = arrayList5;
        Bundle bundle3 = mm2Var.l;
        if (bundle3 != null) {
            ((Bundle) this.l).putAll(bundle3);
        }
        ((Notification.Builder) this.d).setShowWhen(mm2Var.i);
        ((Notification.Builder) this.d).setLocalOnly(mm2Var.k);
        ((Notification.Builder) this.d).setGroup(null);
        ((Notification.Builder) this.d).setSortKey(null);
        ((Notification.Builder) this.d).setGroupSummary(false);
        ((Notification.Builder) this.d).setCategory(null);
        ((Notification.Builder) this.d).setColor(mm2Var.m);
        ((Notification.Builder) this.d).setVisibility(0);
        ((Notification.Builder) this.d).setPublicVersion(null);
        ((Notification.Builder) this.d).setSound(notification.sound, notification.audioAttributes);
        if (Build.VERSION.SDK_INT >= 28) {
            arrayList = arrayList7;
        } else {
            if (arrayList8 == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList(arrayList8.size());
                Iterator it = arrayList8.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    m51.t();
                    throw null;
                }
            }
            if (arrayList2 == null) {
                arrayList = arrayList7;
            } else if (arrayList7 == null) {
                arrayList = arrayList2;
            } else {
                ul ulVar = new ul(arrayList7.size() + arrayList2.size());
                ulVar.addAll(arrayList2);
                ulVar.addAll(arrayList7);
                arrayList = new ArrayList(ulVar);
            }
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj4 = arrayList.get(i11);
                i11++;
                ((Notification.Builder) this.d).addPerson((String) obj4);
            }
        }
        if (arrayList9.size() > 0) {
            if (mm2Var.l == null) {
                mm2Var.l = new Bundle();
            }
            Bundle bundle4 = mm2Var.l.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            int i12 = 0;
            while (i12 < arrayList9.size()) {
                String string = Integer.toString(i12);
                ArrayList arrayList10 = arrayList9;
                lm2 lm2Var2 = (lm2) arrayList10.get(i12);
                Bundle bundle7 = new Bundle();
                if (lm2Var2.b == null && (i = lm2Var2.e) != 0) {
                    lm2Var2.b = IconCompat.a(i);
                }
                IconCompat iconCompat2 = lm2Var2.b;
                Bundle bundle8 = lm2Var2.a;
                bundle7.putInt("icon", iconCompat2 != null ? iconCompat2.b() : 0);
                bundle7.putCharSequence("title", lm2Var2.f);
                bundle7.putParcelable("actionIntent", lm2Var2.g);
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean("android.support.allowGeneratedReplies", lm2Var2.c);
                bundle7.putBundle("extras", bundle9);
                bundle7.putParcelableArray("remoteInputs", null);
                bundle7.putBoolean("showsUserInterface", lm2Var2.d);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(string, bundle7);
                i12++;
                arrayList9 = arrayList10;
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (mm2Var.l == null) {
                mm2Var.l = new Bundle();
            }
            mm2Var.l.putBundle("android.car.EXTENSIONS", bundle4);
            ((Bundle) this.l).putBundle("android.car.EXTENSIONS", bundle5);
        }
        ((Notification.Builder) this.d).setExtras(mm2Var.l);
        ((Notification.Builder) this.d).setRemoteInputHistory(null);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26) {
            df0.k((Notification.Builder) this.d);
            df0.q((Notification.Builder) this.d);
            df0.r((Notification.Builder) this.d);
            df0.s((Notification.Builder) this.d);
            df0.m((Notification.Builder) this.d);
            if (!TextUtils.isEmpty(mm2Var.n)) {
                ((Notification.Builder) this.d).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i13 >= 28) {
            Iterator it2 = arrayList8.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                m51.t();
                throw null;
            }
        }
        if (i13 >= 29) {
            vk.d((Notification.Builder) this.d, mm2Var.o);
            vk.e((Notification.Builder) this.d);
        }
    }

    public ci4(yu yuVar) {
        this.c = 9;
        this.l = yuVar;
    }

    public static ci4 A(Context context) {
        if (m == null) {
            synchronized (n) {
                try {
                    if (m == null) {
                        m = new ci4(context, 1);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    public static final ci4 G(jb jbVar, e6 e6Var) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) jbVar.d;
        try {
            n31 n31VarA = n31.A(byteArrayInputStream, b61.a());
            byteArrayInputStream.close();
            if (n31VarA.y().size() == 0) {
                m51.v("empty keyset");
                return null;
            }
            try {
                gw1 gw1VarE = gw1.E(e6Var.b(n31VarA.y().k(), bArr), b61.a());
                if (gw1VarE.z() > 0) {
                    return x(gw1VarE);
                }
                throw new GeneralSecurityException("empty keyset");
            } catch (sr1 unused) {
                m51.v("invalid keyset, corrupted key material");
                return null;
            }
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public static boolean r(Editable editable, KeyEvent keyEvent, boolean z) {
        i74[] i74VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (i74VarArr = (i74[]) editable.getSpans(selectionStart, selectionEnd, i74.class)) != null && i74VarArr.length > 0) {
                for (i74 i74Var : i74VarArr) {
                    int spanStart = editable.getSpanStart(i74Var);
                    int spanEnd = editable.getSpanEnd(i74Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final ci4 x(gw1 gw1Var) throws GeneralSecurityException {
        if (gw1Var.z() <= 0) {
            m51.v("empty keyset");
            return null;
        }
        ArrayList arrayList = new ArrayList(gw1Var.z());
        for (fw1 fw1Var : gw1Var.A()) {
            fw1Var.getClass();
            try {
                try {
                    kr1 kr1VarA = hi2.b.a(f13.d(fw1Var.A().B(), fw1Var.A().C(), fw1Var.A().A(), fw1Var.C(), fw1Var.C() == lr2.RAW ? null : Integer.valueOf(fw1Var.B())));
                    int iOrdinal = fw1Var.D().ordinal();
                    if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    arrayList.add(new hw1(kr1VarA));
                } catch (GeneralSecurityException unused) {
                    arrayList.add(null);
                }
            } catch (GeneralSecurityException e) {
                throw new eg0("Creating a protokey serialization failed", e);
            }
        }
        return new ci4(gw1Var, Collections.unmodifiableList(arrayList));
    }

    public Object B(Class cls) throws GeneralSecurityException {
        Class clsA;
        Object objC;
        Object objB;
        AtomicReference atomicReference = w43.a;
        try {
            HashMap map = ((fz2) zh2.b.a.get()).b;
            if (map.containsKey(cls)) {
                clsA = ((jz2) map.get(cls)).a();
            } else {
                m51.q(cls, " available", "No input primitive class for ");
                clsA = null;
            }
        } catch (GeneralSecurityException unused) {
        }
        if (clsA == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        List list = (List) this.h;
        gw1 gw1Var = (gw1) this.d;
        int i = la4.a;
        int iB = gw1Var.B();
        Iterator it = gw1Var.A().iterator();
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        while (true) {
            boolean zHasNext = it.hasNext();
            mv1 mv1Var = mv1.ENABLED;
            if (!zHasNext) {
                if (i2 == 0) {
                    m51.v("keyset must contain at least one ENABLED key");
                    return null;
                }
                if (!z && !z2) {
                    m51.v("keyset doesn't contain a valid primary key");
                    return null;
                }
                ir3 ir3Var = new ir3();
                ir3Var.d = new ConcurrentHashMap();
                ir3Var.c = clsA;
                ir3Var.l = uf2.b;
                uf2 uf2Var = (uf2) this.l;
                if (((ConcurrentHashMap) ir3Var.d) == null) {
                    u41.r("setAnnotations cannot be called after build");
                    return null;
                }
                ir3Var.l = uf2Var;
                for (int i3 = 0; i3 < gw1Var.z(); i3++) {
                    fw1 fw1VarY = gw1Var.y(i3);
                    if (fw1VarY.D().equals(mv1Var)) {
                        try {
                            xu1 xu1VarA = fw1VarY.A();
                            AtomicReference atomicReference2 = w43.a;
                            objC = w43.c(xu1VarA.B(), xu1VarA.C(), clsA);
                        } catch (GeneralSecurityException e) {
                            if (!e.getMessage().contains("No key manager found for key type ") && !e.getMessage().contains(" not supported by key manager of type ")) {
                                throw e;
                            }
                            objC = null;
                        }
                        if (list.get(i3) != null) {
                            try {
                                objB = w43.b(((hw1) list.get(i3)).a, clsA);
                            } catch (GeneralSecurityException unused2) {
                                objB = null;
                            }
                        } else {
                            objB = null;
                        }
                        if (fw1VarY.B() == gw1Var.B()) {
                            ir3Var.F(objB, objC, fw1VarY, true);
                        } else {
                            ir3Var.F(objB, objC, fw1VarY, false);
                        }
                    }
                }
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ir3Var.d;
                if (concurrentHashMap == null) {
                    u41.r("build cannot be called twice");
                    return null;
                }
                hz2 hz2Var = (hz2) ir3Var.h;
                uf2 uf2Var2 = (uf2) ir3Var.l;
                Class cls2 = (Class) ir3Var.c;
                iy2 iy2Var = new iy2(concurrentHashMap, hz2Var, uf2Var2, cls2);
                ir3Var.d = null;
                AtomicReference atomicReference3 = w43.a;
                HashMap map2 = ((fz2) zh2.b.a.get()).b;
                if (!map2.containsKey(cls)) {
                    m51.w(cls, "No wrapper found for ");
                    return null;
                }
                jz2 jz2Var = (jz2) map2.get(cls);
                if (cls2.equals(jz2Var.a()) && jz2Var.a().equals(cls2)) {
                    return jz2Var.b(iy2Var);
                }
                m51.v("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
                return null;
            }
            fw1 fw1Var = (fw1) it.next();
            if (fw1Var.D() == mv1Var) {
                if (!fw1Var.E()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(fw1Var.B())));
                }
                if (fw1Var.C() == lr2.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(fw1Var.B())));
                }
                if (fw1Var.D() == mv1.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(fw1Var.B())));
                }
                if (fw1Var.B() == iB) {
                    if (z) {
                        m51.v("keyset contains multiple primary keys");
                        return null;
                    }
                    z = true;
                }
                if (fw1Var.A().A() != wu1.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i2++;
            }
        }
    }

    public long C() {
        return ((a10) this.l).c.d;
    }

    public boolean D(CharSequence charSequence, int i, int i2, h74 h74Var) {
        if ((h74Var.c & 3) == 0) {
            xs0 xs0Var = (xs0) this.l;
            ae2 ae2VarB = h74Var.b();
            int iA = ae2VarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) ae2VarB.l).getShort(iA + ae2VarB.c);
            }
            xs0Var.getClass();
            ThreadLocal threadLocal = xs0.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = xs0Var.a;
            String string = sb.toString();
            int i3 = ls2.a;
            boolean zHasGlyph = textPaint.hasGlyph(string);
            int i4 = h74Var.c & 4;
            h74Var.c = zHasGlyph ? i4 | 2 : i4 | 1;
        }
        return (h74Var.c & 3) == 2;
    }

    public File E(String str) {
        return new File((File) this.l, str.equals("fx") ? "fx.png" : str.concat(".webp"));
    }

    public Object F(CharSequence charSequence, int i, int i2, int i3, boolean z, i21 i21Var) {
        int i4;
        char c;
        k21 k21Var = new k21((ce2) ((ir3) this.h).h);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zB = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (true) {
                if (iCharCount < i2 && i5 < i3 && zB) {
                    SparseArray sparseArray = k21Var.c.a;
                    ce2 ce2Var = sparseArray == null ? null : (ce2) sparseArray.get(iCodePointAt);
                    if (k21Var.a == 2) {
                        if (ce2Var != null) {
                            k21Var.c = ce2Var;
                            k21Var.f++;
                        } else {
                            if (iCodePointAt == 65038) {
                                k21Var.a();
                            } else if (iCodePointAt != 65039) {
                                ce2 ce2Var2 = k21Var.c;
                                if (ce2Var2.b != null) {
                                    if (k21Var.f != 1) {
                                        k21Var.d = ce2Var2;
                                        k21Var.a();
                                    } else if (k21Var.b()) {
                                        k21Var.d = k21Var.c;
                                        k21Var.a();
                                    } else {
                                        k21Var.a();
                                    }
                                    c = 3;
                                } else {
                                    k21Var.a();
                                }
                            }
                            c = 1;
                        }
                        c = 2;
                    } else if (ce2Var == null) {
                        k21Var.a();
                        c = 1;
                    } else {
                        k21Var.a = 2;
                        k21Var.c = ce2Var;
                        k21Var.f = 1;
                        c = 2;
                    }
                    k21Var.e = iCodePointAt;
                    if (c == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                        if (iCharCount >= i2) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c == 3) {
                        if (!z && D(charSequence, i4, iCharCount, k21Var.d.b)) {
                            break;
                        }
                        zB = i21Var.b(charSequence, i4, iCharCount, k21Var.d.b);
                        i5++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (k21Var.a == 2 && k21Var.c.b != null && ((k21Var.f > 1 || k21Var.b()) && i5 < i3 && zB && (z || !D(charSequence, i4, iCharCount, k21Var.c.b)))) {
            i21Var.b(charSequence, i4, iCharCount, k21Var.c.b);
        }
        return i21Var.a();
    }

    public void H(vo voVar, int i, boolean z) {
        to toVar = (to) this.l;
        Context context = (Context) this.d;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = voVar.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        lz2 lz2Var = voVar.c;
        adler32.update(byteBufferAllocate.putInt(mz2.a(lz2Var)).array());
        byte[] bArr = voVar.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i2 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i2 < i) {
                        break;
                    }
                    xr0.S("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", voVar);
                    return;
                }
            }
        }
        Cursor cursorRawQuery = ((o83) this.h).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(mz2.a(lz2Var))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(toVar.a(lz2Var, jLongValue, i));
            Set set = ((uo) toVar.b.get(lz2Var)).c;
            if (set.contains(va3.c)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(va3.h)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(va3.d)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", mz2.a(lz2Var));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {voVar, Integer.valueOf(value), Long.valueOf(toVar.a(lz2Var, jLongValue, i)), lValueOf, Integer.valueOf(i)};
            String strD0 = xr0.d0("JobInfoScheduler");
            if (Log.isLoggable(strD0, 3)) {
                Log.d(strD0, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    public void I(String str) {
        if (str != null) {
            this.d = str;
        } else {
            m51.x("Null backendName");
        }
    }

    public void J(y00 y00Var) {
        ((a10) this.l).c.c = y00Var;
    }

    public void K(wu0 wu0Var) {
        ((a10) this.l).c.a = wu0Var;
    }

    public void L(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.d = Integer.valueOf(i);
    }

    public void M(dx1 dx1Var) {
        ((a10) this.l).c.b = dx1Var;
    }

    public void N(long j) {
        ((a10) this.l).c.d = j;
    }

    @Override // defpackage.dp1
    public ClipDescription a() {
        return (ClipDescription) this.h;
    }

    @Override // defpackage.dp1
    public Object b() {
        return null;
    }

    @Override // defpackage.dp1
    public Uri c() {
        return (Uri) this.d;
    }

    @Override // defpackage.ps3
    public void d(am1 am1Var) {
        em emVar = (em) this.d;
        if (am1Var == null || emVar.getCallback() == null) {
            return;
        }
        Drawable drawableT = vl0.t(am1Var, (Resources) this.l);
        if (drawableT.getBounds().isEmpty()) {
            drawableT.setBounds(new Rect(0, 0, drawableT.getIntrinsicWidth(), drawableT.getIntrinsicHeight()));
        }
        emVar.d(drawableT);
    }

    @Override // defpackage.dp1
    public void e() {
    }

    @Override // defpackage.dp1
    public Uri f() {
        return (Uri) this.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ps3
    public void g(am1 am1Var) {
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.h;
        am1Var.getClass();
        Drawable drawableT = vl0.t(am1Var, (Resources) this.l);
        HashMap map = dn1.b;
        em emVar = (em) this.d;
        if (map.remove(emVar) == null && atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        if (emVar.getCallback() != null) {
            if (drawableT.getBounds().isEmpty()) {
                drawableT.setBounds(new Rect(0, 0, drawableT.getIntrinsicWidth(), drawableT.getIntrinsicHeight()));
            }
            emVar.d(drawableT);
            if (drawableT instanceof Animatable) {
                ((Animatable) drawableT).start();
            }
        }
    }

    @Override // defpackage.ps3
    public void h(am1 am1Var) {
        HashMap map = dn1.b;
        em emVar = (em) this.d;
        if (map.remove(emVar) == null || am1Var == null || emVar.getCallback() == null) {
            return;
        }
        Drawable drawableT = vl0.t(am1Var, (Resources) this.l);
        if (drawableT.getBounds().isEmpty()) {
            drawableT.setBounds(new Rect(0, 0, drawableT.getIntrinsicWidth(), drawableT.getIntrinsicHeight()));
        }
        emVar.d(drawableT);
    }

    public void i(String str, String str2) {
        str2.getClass();
        ((ArrayList) this.l).add(Options$Companion.createFormData(str, null, Options$Companion.create(str2, null)));
    }

    public x4 j() throws GeneralSecurityException {
        sz0 sz0Var;
        nz nzVarA;
        e5 e5Var = (e5) this.d;
        if (e5Var == null || (sz0Var = (sz0) this.h) == null) {
            m51.v("Cannot build without parameters and/or key material");
            return null;
        }
        if (e5Var.h != ((nz) sz0Var.c).a.length) {
            m51.v("Key size mismatch");
            return null;
        }
        d5 d5Var = e5Var.j;
        d5 d5Var2 = d5.n;
        if (d5Var != d5Var2 && ((Integer) this.l) == null) {
            m51.v("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (d5Var == d5Var2 && ((Integer) this.l) != null) {
            m51.v("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (d5Var == d5Var2) {
            nzVarA = nz.a(new byte[0]);
        } else if (d5Var == d5.m || d5Var == d5.l) {
            nzVarA = nz.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.l).intValue()).array());
        } else {
            if (d5Var != d5.h) {
                m51.B(((e5) this.d).j, "Unknown AesCmacParametersParameters.Variant: ");
                return null;
            }
            nzVarA = nz.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.l).intValue()).array());
        }
        return new x4((e5) this.d, nzVarA);
    }

    public e5 k() {
        Integer num = (Integer) this.d;
        if (num == null) {
            m51.v("key size not set");
            return null;
        }
        if (((Integer) this.h) == null) {
            m51.v("tag size not set");
            return null;
        }
        if (((d5) this.l) != null) {
            return new e5(num.intValue(), ((Integer) this.h).intValue(), (d5) this.l);
        }
        m51.v("variant not set");
        return null;
    }

    public x5 l() throws GeneralSecurityException {
        sz0 sz0Var;
        a6 a6Var = (a6) this.d;
        if (a6Var == null || (sz0Var = (sz0) this.h) == null) {
            m51.v("Cannot build without parameters and/or key material");
            return null;
        }
        if (a6Var.h != ((nz) sz0Var.c).a.length) {
            m51.v("Key size mismatch");
            return null;
        }
        d5 d5Var = a6Var.k;
        d5 d5Var2 = d5.q;
        if (d5Var != d5Var2 && ((Integer) this.l) == null) {
            m51.v("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (d5Var == d5Var2 && ((Integer) this.l) != null) {
            m51.v("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (d5Var == d5Var2) {
            nz.a(new byte[0]);
        } else if (d5Var == d5.p) {
            nz.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.l).intValue()).array());
        } else {
            if (d5Var != d5.o) {
                m51.B(((a6) this.d).k, "Unknown AesEaxParameters.Variant: ");
                return null;
            }
            nz.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.l).intValue()).array());
        }
        return new x5();
    }

    public h6 m() throws GeneralSecurityException {
        sz0 sz0Var;
        k6 k6Var = (k6) this.d;
        if (k6Var == null || (sz0Var = (sz0) this.h) == null) {
            m51.v("Cannot build without parameters and/or key material");
            return null;
        }
        if (k6Var.h != ((nz) sz0Var.c).a.length) {
            m51.v("Key size mismatch");
            return null;
        }
        d5 d5Var = k6Var.k;
        d5 d5Var2 = d5.t;
        if (d5Var != d5Var2 && ((Integer) this.l) == null) {
            m51.v("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (d5Var == d5Var2 && ((Integer) this.l) != null) {
            m51.v("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (d5Var == d5Var2) {
            nz.a(new byte[0]);
        } else if (d5Var == d5.s) {
            nz.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.l).intValue()).array());
        } else {
            if (d5Var != d5.r) {
                m51.B(((k6) this.d).k, "Unknown AesGcmParameters.Variant: ");
                return null;
            }
            nz.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.l).intValue()).array());
        }
        return new h6();
    }

    public p6 n() throws GeneralSecurityException {
        sz0 sz0Var;
        s6 s6Var = (s6) this.d;
        if (s6Var == null || (sz0Var = (sz0) this.h) == null) {
            m51.v("Cannot build without parameters and/or key material");
            return null;
        }
        if (s6Var.h != ((nz) sz0Var.c).a.length) {
            m51.v("Key size mismatch");
            return null;
        }
        d5 d5Var = s6Var.i;
        d5 d5Var2 = d5.w;
        if (d5Var != d5Var2 && ((Integer) this.l) == null) {
            m51.v("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (d5Var == d5Var2 && ((Integer) this.l) != null) {
            m51.v("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (d5Var == d5Var2) {
            nz.a(new byte[0]);
        } else if (d5Var == d5.v) {
            nz.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.l).intValue()).array());
        } else {
            if (d5Var != d5.u) {
                m51.B(((s6) this.d).i, "Unknown AesGcmSivParameters.Variant: ");
                return null;
            }
            nz.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.l).intValue()).array());
        }
        return new p6();
    }

    public vo o() {
        String strConcat = ((String) this.d) == null ? " backendName" : BuildConfig.VERSION_NAME;
        if (((lz2) this.l) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new vo((String) this.d, (byte[]) this.h, (lz2) this.l);
        }
        u41.r("Missing required properties:".concat(strConcat));
        return null;
    }

    public li1 p() throws GeneralSecurityException {
        sz0 sz0Var;
        nz nzVarA;
        oi1 oi1Var = (oi1) this.d;
        if (oi1Var == null || (sz0Var = (sz0) this.h) == null) {
            m51.v("Cannot build without parameters and/or key material");
            return null;
        }
        if (oi1Var.h != ((nz) sz0Var.c).a.length) {
            m51.v("Key size mismatch");
            return null;
        }
        d5 d5Var = oi1Var.j;
        d5 d5Var2 = d5.I;
        if (d5Var != d5Var2 && ((Integer) this.l) == null) {
            m51.v("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (d5Var == d5Var2 && ((Integer) this.l) != null) {
            m51.v("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (d5Var == d5Var2) {
            nzVarA = nz.a(new byte[0]);
        } else if (d5Var == d5.H || d5Var == d5.G) {
            nzVarA = nz.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.l).intValue()).array());
        } else {
            if (d5Var != d5.F) {
                m51.B(((oi1) this.d).j, "Unknown HmacParameters.Variant: ");
                return null;
            }
            nzVarA = nz.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.l).intValue()).array());
        }
        return new li1((oi1) this.d, nzVarA);
    }

    public void q(String str) {
        File fileV = v(str);
        if (fileV.isFile()) {
            E(str).delete();
            fileV.renameTo(E(str));
        }
    }

    public void s(Bundle bundle) {
        HashSet hashSet = (HashSet) this.h;
        String string = ((Context) this.l).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (ko1.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    u((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new eg0(e);
            }
        }
    }

    public void t(yw2 yw2Var) {
        lx2 lx2Var = (lx2) this.l;
        List list = yw2Var.a;
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            jx2 jx2Var = jx2.d;
            if (i2 >= size) {
                wl2 wl2Var = (wl2) this.d;
                if (wl2Var == null) {
                    u41.r("layoutCoordinates not set");
                    return;
                }
                xp1.H(yw2Var, wl2Var.L(0L), new sg2(this, 2, lx2Var), false);
                if (((jx2) this.h) == jx2Var) {
                    int size2 = list.size();
                    while (i < size2) {
                        ((dx2) list.get(i)).a();
                        i++;
                    }
                    cr1 cr1Var = yw2Var.b;
                    if (cr1Var == null) {
                        return;
                    }
                    cr1Var.a = !lx2Var.h;
                    return;
                }
                return;
            }
            if (((dx2) list.get(i2)).b()) {
                if (((jx2) this.h) == jx2Var) {
                    wl2 wl2Var2 = (wl2) this.d;
                    if (wl2Var2 == null) {
                        u41.r("layoutCoordinates not set");
                        return;
                    }
                    xp1.H(yw2Var, wl2Var2.L(0L), new kx2(lx2Var, i), true);
                }
                this.h = jx2.h;
                return;
            }
            i2++;
        }
    }

    public String toString() {
        switch (this.c) {
            case 25:
                return la4.a((gw1) this.d).toString();
            default:
                return super.toString();
        }
    }

    public Object u(Class cls, HashSet hashSet) {
        Object objB;
        HashMap map = (HashMap) this.d;
        if (jr1.B()) {
            try {
                Trace.beginSection(jr1.O(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                ko1 ko1Var = (ko1) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = ko1Var.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            u(cls2, hashSet);
                        }
                    }
                }
                objB = ko1Var.b((Context) this.l);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new eg0(th2);
            }
        }
        Trace.endSection();
        return objB;
    }

    public File v(String str) {
        return new File((File) this.l, str.equals("fx") ? "fx-draft.png" : str.concat("-draft.webp"));
    }

    public void w() {
        v("bg").delete();
        v("pt").delete();
        v("fx").delete();
    }

    public y00 y() {
        return ((a10) this.l).c.c;
    }

    public g72 z() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((sb3) this.l)) {
            try {
                g72 g72Var = (g72) this.h;
                if (g72Var != null && localeList == ((LocaleList) this.d)) {
                    return g72Var;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new f72(localeList.get(i)));
                }
                g72 g72Var2 = new g72(arrayList);
                this.d = localeList;
                this.h = g72Var2;
                return g72Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
