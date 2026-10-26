package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public abstract class li {
    public static final wf3 c = new wf3(new ki());
    public static final int d = -100;
    public static i72 h = null;
    public static i72 l = null;
    public static Boolean m = null;
    public static boolean n = false;
    public static final ul o = new ul(0);
    public static final Object p = new Object();
    public static final Object q = new Object();

    public static void a() {
        i72 i72Var;
        ul ulVar = o;
        ulVar.getClass();
        ol olVar = new ol(ulVar);
        while (olVar.hasNext()) {
            li liVar = (li) ((WeakReference) olVar.next()).get();
            if (liVar != null) {
                zi ziVar = (zi) liVar;
                Context context = ziVar.s;
                int i = 1;
                if (f(context) && (i72Var = h) != null && !i72Var.equals(l)) {
                    c.execute(new hi(context, i));
                }
                ziVar.q(true, true);
            }
        }
    }

    public static i72 b() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objC = c();
            if (objC != null) {
                return new i72(new j72(ji.a(objC)));
            }
        } else {
            i72 i72Var = h;
            if (i72Var != null) {
                return i72Var;
            }
        }
        return i72.b;
    }

    public static Object c() {
        Context context;
        ul ulVar = o;
        ulVar.getClass();
        ol olVar = new ol(ulVar);
        while (olVar.hasNext()) {
            li liVar = (li) ((WeakReference) olVar.next()).get();
            if (liVar != null && (context = ((zi) liVar).s) != null) {
                return context.getSystemService("locale");
            }
        }
        return null;
    }

    public static boolean f(Context context) {
        if (m == null) {
            try {
                int i = uk.c;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) uk.class), tk.a() | Uuid.SIZE_BITS).metaData;
                if (bundle != null) {
                    m = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                m = Boolean.FALSE;
            }
        }
        return m.booleanValue();
    }

    public static void i(zi ziVar) {
        synchronized (p) {
            try {
                ul ulVar = o;
                ulVar.getClass();
                ol olVar = new ol(ulVar);
                while (olVar.hasNext()) {
                    li liVar = (li) ((WeakReference) olVar.next()).get();
                    if (liVar == ziVar || liVar == null) {
                        olVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void p(Context context) {
        if (f(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (n) {
                    return;
                }
                c.execute(new hi(context, 0));
                return;
            }
            synchronized (q) {
                try {
                    i72 i72Var = h;
                    if (i72Var == null) {
                        if (l == null) {
                            l = i72.a(av1.G(context));
                        }
                        if (l.a.a.isEmpty()) {
                        } else {
                            h = l;
                        }
                    } else if (!i72Var.equals(l)) {
                        i72 i72Var2 = h;
                        l = i72Var2;
                        av1.F(context, i72Var2.a.a.toLanguageTags());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public abstract void d();

    public abstract void g();

    public abstract void h();

    public abstract boolean j(int i);

    public abstract void k(int i);

    public abstract void m(View view);

    public abstract void n(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void o(CharSequence charSequence);
}
