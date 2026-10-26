package defpackage;

import android.os.Build;
import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public final class ld extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ld(int i, Object obj, Object obj2, Object obj3, boolean z) {
        super(1);
        this.c = i;
        this.h = obj;
        this.d = z;
        this.l = obj2;
        this.m = obj3;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        String str;
        int i = this.c;
        w84 w84Var = w84.a;
        Object obj2 = this.m;
        Object obj3 = this.l;
        boolean z = this.d;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                wx1 wx1Var = (wx1) obj;
                wx1Var.a();
                a10 a10Var = wx1Var.c;
                if (((Boolean) ((je1) obj4).invoke()).booleanValue()) {
                    bm1 bm1Var = (bm1) obj3;
                    jv jvVar = (jv) obj2;
                    if (z) {
                        long jW = a10Var.W();
                        ci4 ci4Var = a10Var.d;
                        long jC = ci4Var.C();
                        ci4Var.y().l();
                        try {
                            ((jb) ci4Var.d).A(-1.0f, 1.0f, jW);
                            a10Var.d(bm1Var, jvVar);
                        } finally {
                            fq2.x(ci4Var, jC);
                        }
                    } else {
                        a10Var.d(bm1Var, jvVar);
                    }
                }
                return w84Var;
            default:
                Throwable th = (Throwable) obj;
                if (th instanceof ri4) {
                    ((s62) obj4).c.compareAndSet(-256, ((ri4) th).c);
                }
                if (z && (str = (String) obj3) != null) {
                    aj4 aj4Var = (aj4) obj2;
                    t73 t73Var = aj4Var.e.m;
                    int iHashCode = aj4Var.a.hashCode();
                    t73Var.getClass();
                    if (Build.VERSION.SDK_INT >= 29) {
                        y44.b(iHashCode, jr1.O(str));
                    } else {
                        String strO = jr1.O(str);
                        try {
                            if (jr1.i == null) {
                                jr1.i = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                            }
                            jr1.i.invoke(null, Long.valueOf(jr1.f), strO, Integer.valueOf(iHashCode));
                        } catch (Exception e) {
                            jr1.x("asyncTraceEnd", e);
                        }
                    }
                    break;
                }
                return w84Var;
        }
    }
}
