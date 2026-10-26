package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b74 {
    public static final gm4 a;
    public static final t82 b;

    static {
        Trace.beginSection(jr1.O("TypefaceCompat static init"));
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new g74();
        } else if (i >= 28) {
            a = new f74();
        } else if (i >= 26) {
            a = new e74();
        } else {
            Method method = d74.t;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                a = new d74();
            } else {
                a = new c74();
            }
        }
        b = new t82(16);
        Trace.endSection();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    public static Typeface a(Context context, zb1 zb1Var, Resources resources, int i, String str, int i2, int i3, bk bkVar, boolean z) {
        Typeface typefaceP;
        Typeface typefaceCreate;
        List listUnmodifiableList;
        int i4 = 11;
        if (zb1Var instanceof cc1) {
            cc1 cc1Var = (cc1) zb1Var;
            String str2 = cc1Var.e;
            Typeface typeface = null;
            int i5 = 0;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                    typefaceCreate = null;
                }
            }
            if (typefaceCreate != null) {
                if (bkVar != null) {
                    new Handler(Looper.getMainLooper()).post(new ba(bkVar, i4, typefaceCreate));
                }
                return typefaceCreate;
            }
            int i6 = 1;
            boolean z2 = !z ? bkVar != null : cc1Var.d != 0;
            int i7 = z ? cc1Var.c : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            sk3 sk3Var = new sk3(10);
            sk3Var.d = bkVar;
            sb1 sb1Var = cc1Var.b;
            sb1 sb1Var2 = cc1Var.a;
            if (sb1Var != null) {
                Object[] objArr = {sb1Var2, sb1Var};
                ArrayList arrayList = new ArrayList(2);
                for (int i8 = 0; i8 < 2; i8++) {
                    Object obj = objArr[i8];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList(1);
                Object obj2 = new Object[]{sb1Var2}[0];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
                listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            }
            ou ouVar = new ou(handler, 3);
            fy2 fy2Var = new fy2(sk3Var, ouVar);
            int i9 = 6;
            if (!z2) {
                String strA = yb1.a(i3, listUnmodifiableList);
                Typeface typeface2 = (Typeface) yb1.a.a(strA);
                if (typeface2 != null) {
                    ouVar.execute(new io4(sk3Var, i9, typeface2));
                    typeface = typeface2;
                } else {
                    wb1 wb1Var = new wb1(i5, fy2Var);
                    synchronized (yb1.c) {
                        try {
                            ph3 ph3Var = yb1.d;
                            ArrayList arrayList3 = (ArrayList) ph3Var.get(strA);
                            if (arrayList3 != null) {
                                arrayList3.add(wb1Var);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(wb1Var);
                                ph3Var.put(strA, arrayList4);
                                vb1 vb1Var = new vb1(strA, context, listUnmodifiableList, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = yb1.b;
                                wb1 wb1Var2 = new wb1(i6, strA);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                hm0 hm0Var = new hm0();
                                hm0Var.d = vb1Var;
                                hm0Var.h = wb1Var2;
                                hm0Var.l = handler2;
                                threadPoolExecutor.execute(hm0Var);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                if (listUnmodifiableList.size() > 1) {
                    u41.k("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                sb1 sb1Var3 = (sb1) listUnmodifiableList.get(0);
                t82 t82Var = yb1.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj3 = new Object[]{sb1Var3}[0];
                Objects.requireNonNull(obj3);
                arrayList5.add(obj3);
                String strA2 = yb1.a(i3, Collections.unmodifiableList(arrayList5));
                Typeface typeface3 = (Typeface) yb1.a.a(strA2);
                if (typeface3 != null) {
                    ouVar.execute(new io4(sk3Var, i9, typeface3));
                    typeface = typeface3;
                } else if (i7 == -1) {
                    Object[] objArr2 = {sb1Var3};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj4 = objArr2[0];
                    Objects.requireNonNull(obj4);
                    arrayList6.add(obj4);
                    xb1 xb1VarB = yb1.b(strA2, context, Collections.unmodifiableList(arrayList6), i3);
                    fy2Var.g(xb1VarB);
                    typeface = xb1VarB.a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    xb1 xb1Var = (xb1) yb1.b.submit(new vb1(strA2, context, sb1Var3, i3, 0)).get(i7, TimeUnit.MILLISECONDS);
                                    fy2Var.g(xb1Var);
                                    typeface = xb1Var.a;
                                } catch (TimeoutException unused) {
                                    throw new InterruptedException("timeout");
                                }
                            } catch (InterruptedException e) {
                                throw e;
                            }
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        }
                    } catch (InterruptedException unused2) {
                        ((ou) fy2Var.d).execute(new j00((sk3) fy2Var.c, -3));
                    }
                }
            }
            typefaceP = typeface;
        } else {
            typefaceP = a.p(context, (ac1) zb1Var, resources, i3);
            if (bkVar != null) {
                if (typefaceP != null) {
                    new Handler(Looper.getMainLooper()).post(new ba(bkVar, i4, typefaceP));
                } else {
                    bkVar.c(-3);
                }
            }
        }
        if (typefaceP != null) {
            b.b(b(resources, i, str, i2, i3), typefaceP);
        }
        return typefaceP;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
