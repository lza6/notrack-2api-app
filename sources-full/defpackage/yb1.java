package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class yb1 {
    public static final t82 a = new t82(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final ph3 d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new q53());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new ph3(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((sb1) list.get(i2)).e);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static xb1 b(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceQ;
        t82 t82Var = a;
        Trace.beginSection(jr1.O("getFontSync"));
        try {
            Typeface typeface = (Typeface) t82Var.a(str);
            if (typeface != null) {
                xb1 xb1Var = new xb1(typeface);
                Trace.endSection();
                return xb1Var;
            }
            try {
                kc1 kc1VarA = rb1.a(context, list);
                List list2 = kc1VarA.b;
                int i3 = kc1VarA.a;
                if (i3 == 0) {
                    lc1[] lc1VarArr = (lc1[]) list2.get(0);
                    if (lc1VarArr == null || lc1VarArr.length == 0) {
                        i2 = 1;
                    } else {
                        int length = lc1VarArr.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                i2 = 0;
                                break;
                            }
                            int i5 = lc1VarArr[i4].e;
                            if (i5 != 0) {
                                if (i5 >= 0) {
                                    i2 = i5;
                                    break;
                                }
                                i2 = -3;
                                break;
                            }
                            i4++;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        i2 = -3;
                        break;
                    }
                    i2 = -2;
                }
                if (i2 != 0) {
                    xb1 xb1Var2 = new xb1(i2);
                    Trace.endSection();
                    return xb1Var2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    lc1[] lc1VarArr2 = (lc1[]) list2.get(0);
                    gm4 gm4Var = b74.a;
                    Trace.beginSection(jr1.O("TypefaceCompat.createFromFontInfo"));
                    try {
                        typefaceQ = b74.a.q(context, lc1VarArr2, i);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    gm4 gm4Var2 = b74.a;
                    Trace.beginSection(jr1.O("TypefaceCompat.createFromFontInfoWithFallback"));
                    try {
                        typefaceQ = b74.a.r(context, list2, i);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceQ == null) {
                    xb1 xb1Var3 = new xb1(-3);
                    Trace.endSection();
                    return xb1Var3;
                }
                t82Var.b(str, typefaceQ);
                xb1 xb1Var4 = new xb1(typefaceQ);
                Trace.endSection();
                return xb1Var4;
            } catch (PackageManager.NameNotFoundException unused) {
                xb1 xb1Var5 = new xb1(-1);
                Trace.endSection();
                return xb1Var5;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
