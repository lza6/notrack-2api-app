package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class t73 implements wp0, rg3, bl3, sw, fe0, x93, md2, bu0, el, gl, sf2, jz {
    public static t73 d;
    public static volatile t73 l;
    public final /* synthetic */ int c;
    public static final Object h = new Object();
    public static final /* synthetic */ t73 m = new t73(2);
    public static final t73 n = new t73(3);
    public static final t73 o = new t73(4);
    public static final t73 p = new t73(5);
    public static final t73 q = new t73(6);
    public static final t73 r = new t73(7);
    public static final /* synthetic */ t73 s = new t73(8);
    public static final t73 t = new t73(9);
    public static final t73 u = new t73(10);
    public static final yp2 v = new yp2(1);
    public static final yp2 w = new yp2(0);
    public static final t73 x = new t73(12);
    public static final t73 y = new t73(13);
    public static final t73 z = new t73(14);
    public static final t73 A = new t73(15);
    public static final t73 B = new t73(16);
    public static final t73 C = new t73(17);
    public static final t73 D = new t73(18);

    public t73() {
        this.c = 1;
        new ConcurrentHashMap();
    }

    public /* synthetic */ t73(int i) {
        this.c = i;
    }

    @Override // defpackage.el, defpackage.gl
    public float a() {
        return 0.0f;
    }

    @Override // defpackage.md2
    public void b(hc2 hc2Var, boolean z2) {
    }

    @Override // defpackage.sf2
    public Object c(p13 p13Var) {
        return p13Var.a.invoke();
    }

    @Override // defpackage.bu0
    public boolean d(SSLSocket sSLSocket) {
        return to3.q0(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // defpackage.bl3
    public boolean e(Object obj, Object obj2) {
        switch (this.c) {
            case 9:
                return false;
            case 12:
                return obj == obj2;
            default:
                return kr1.n(obj, obj2);
        }
    }

    @Override // defpackage.jz
    public byte[] f(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // defpackage.bu0
    public pl3 g(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new pd(superclass);
    }

    @Override // defpackage.el
    public void h(wu0 wu0Var, int i, int[] iArr, dx1 dx1Var, int[] iArr2) {
        if (dx1Var == dx1.c) {
            hl.b(i, iArr, iArr2, false);
        } else {
            hl.b(i, iArr, iArr2, true);
        }
    }

    @Override // defpackage.x93
    public Object j(Object obj) {
        List list = (List) obj;
        Object obj2 = list.get(0);
        Object obj3 = list.get(1);
        Object obj4 = list.get(2);
        Object obj5 = list.get(3);
        obj2.getClass();
        String str = (String) obj2;
        obj3.getClass();
        int iIntValue = ((Integer) obj3).intValue();
        obj4.getClass();
        long jD = p23.d(iIntValue, ((Integer) obj4).intValue());
        obj5.getClass();
        List list2 = (List) obj5;
        Object obj6 = list2.get(0);
        Object obj7 = list2.get(1);
        xz3 xz3Var = obj6 != null ? (xz3) xz3.i.j(obj6) : null;
        obj7.getClass();
        return new ay3(str, jD, new fp1(xz3Var, (p84) wz3.c.j(obj7)));
    }

    @Override // defpackage.gl
    public void k(wu0 wu0Var, int i, int[] iArr, int[] iArr2) {
        hl.b(i, iArr, iArr2, false);
    }

    @Override // defpackage.rg3
    public rq2 l(long j, dx1 dx1Var, wu0 wu0Var) {
        float fO = wu0Var.O(30.0f);
        return new pq2(new h43(0.0f, -fO, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fO));
    }

    @Override // defpackage.sw
    public long m(bd3 bd3Var, int i) {
        String str = bd3Var.f.a.a.d;
        return p23.d(yh4.z(i, str), yh4.y(i, str));
    }

    @Override // defpackage.x93
    public Object n(a93 a93Var, Object obj) {
        List listU;
        ay3 ay3Var = (ay3) obj;
        String string = ay3Var.b().d.toString();
        long j = ay3Var.b().h;
        int i = jz3.c;
        Integer numValueOf = Integer.valueOf((int) (j >> 32));
        Integer numValueOf2 = Integer.valueOf((int) (ay3Var.b().h & 4294967295L));
        fp1 fp1Var = ay3Var.a;
        xz3 xz3Var = (xz3) ((ft2) fp1Var.d).getValue();
        if (xz3Var != null) {
            Integer numValueOf3 = Integer.valueOf(xz3Var.a);
            String str = xz3Var.b;
            String str2 = xz3Var.c;
            long j2 = xz3Var.d;
            int i2 = jz3.c;
            Integer numValueOf4 = Integer.valueOf((int) (j2 >> 32));
            Integer numValueOf5 = Integer.valueOf((int) (j2 & 4294967295L));
            long j3 = xz3Var.e;
            listU = kr1.U(numValueOf3, str, str2, numValueOf4, numValueOf5, Integer.valueOf((int) (j3 >> 32)), Integer.valueOf((int) (j3 & 4294967295L)), Long.valueOf(xz3Var.f));
        } else {
            listU = null;
        }
        return kr1.U(string, numValueOf, numValueOf2, kr1.U(listU, wz3.c.n(a93Var, (p84) fp1Var.c)));
    }

    public s62 o(Context context, String str, WorkerParameters workerParameters) {
        context.getClass();
        str.getClass();
        workerParameters.getClass();
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str).asSubclass(s62.class);
            clsAsSubclass.getClass();
            try {
                Object objNewInstance = clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                objNewInstance.getClass();
                s62 s62Var = (s62) objNewInstance;
                if (!s62Var.d) {
                    return s62Var;
                }
                throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
            } catch (Throwable th) {
                v72.f().e(qi4.a, "Could not instantiate ".concat(str), th);
                throw th;
            }
        } catch (Throwable th2) {
            v72.f().e(qi4.a, "Invalid class: ".concat(str), th2);
            throw th2;
        }
    }

    public void p(Context context, is4 is4Var) {
        try {
            context.unbindService(is4Var);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    @Override // defpackage.md2
    public boolean q(hc2 hc2Var) {
        return false;
    }

    public boolean r(Context context, String str, Intent intent, is4 is4Var, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((ej4.a(context).a.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (executor == null) {
            executor = null;
        }
        return (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, is4Var, 4225) : context.bindService(intent, 4225, executor, is4Var);
    }

    public String toString() {
        switch (this.c) {
            case 9:
                return "NeverEqualPolicy";
            case 12:
                return "ReferentialEqualityPolicy";
            case 14:
                return "SingleLineCodepointTransformation";
            case 15:
                return "StructuralEqualityPolicy";
            case 22:
                return "Arrangement#SpaceBetween";
            case 27:
                return "Empty";
            default:
                return super.toString();
        }
    }
}
