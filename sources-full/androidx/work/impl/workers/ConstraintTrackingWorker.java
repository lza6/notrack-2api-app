package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.a54;
import defpackage.f60;
import defpackage.g13;
import defpackage.hi4;
import defpackage.hq0;
import defpackage.ji4;
import defpackage.km0;
import defpackage.lm0;
import defpackage.lq0;
import defpackage.mm0;
import defpackage.o62;
import defpackage.or0;
import defpackage.p62;
import defpackage.py;
import defpackage.qb;
import defpackage.r62;
import defpackage.rm0;
import defpackage.s62;
import defpackage.sh1;
import defpackage.so0;
import defpackage.t73;
import defpackage.u41;
import defpackage.uo0;
import defpackage.v72;
import defpackage.ve;
import defpackage.wh4;
import defpackage.y83;
import defpackage.yo4;
import defpackage.zp0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class ConstraintTrackingWorker extends CoroutineWorker {
    public final WorkerParameters g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.g = workerParameters;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(ConstraintTrackingWorker constraintTrackingWorker, s62 s62Var, sh1 sh1Var, hi4 hi4Var, uo0 uo0Var) {
        lm0 lm0Var;
        if (uo0Var instanceof lm0) {
            lm0Var = (lm0) uo0Var;
            int i = lm0Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                lm0Var.h = i - Integer.MIN_VALUE;
            } else {
                lm0Var = new lm0(constraintTrackingWorker, uo0Var);
            }
        } else {
            lm0Var = new lm0(constraintTrackingWorker, uo0Var);
        }
        Object objQ = lm0Var.c;
        int i2 = lm0Var.h;
        if (i2 == 0) {
            g13.O(objQ);
            ve veVar = new ve(s62Var, sh1Var, hi4Var, null);
            lm0Var.h = 1;
            objQ = yo4.q(veVar, lm0Var);
            hq0 hq0Var = hq0.c;
            if (objQ == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(objQ);
        }
        objQ.getClass();
        return objQ;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x010c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0110  */
    /* JADX WARN: Code duplicated, block: B:58:0x0116  */
    /* JADX WARN: Code duplicated, block: B:59:0x0119  */
    /* JADX WARN: Code duplicated, block: B:61:0x011f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0124  */
    /* JADX WARN: Code duplicated, block: B:64:0x0128  */
    /* JADX WARN: Code duplicated, block: B:66:0x0133  */
    /* JADX WARN: Code duplicated, block: B:70:0x013d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0143  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public static final Object e(ConstraintTrackingWorker constraintTrackingWorker, uo0 uo0Var) {
        mm0 mm0Var;
        s62 s62Var;
        AtomicInteger atomicInteger;
        AtomicInteger atomicInteger2;
        int i;
        ConstraintTrackingWorker constraintTrackingWorker2 = constraintTrackingWorker;
        WorkerParameters workerParameters = constraintTrackingWorker2.g;
        Context context = constraintTrackingWorker2.a;
        WorkerParameters workerParameters2 = constraintTrackingWorker2.b;
        if (uo0Var instanceof mm0) {
            mm0Var = (mm0) uo0Var;
            int i2 = mm0Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mm0Var.m = i2 - Integer.MIN_VALUE;
            } else {
                mm0Var = new mm0(constraintTrackingWorker2, uo0Var);
            }
        } else {
            mm0Var = new mm0(constraintTrackingWorker2, uo0Var);
        }
        mm0 mm0Var2 = mm0Var;
        Object objY = mm0Var2.h;
        int i3 = mm0Var2.m;
        if (i3 != 0) {
            if (i3 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            s62 s62Var2 = mm0Var2.d;
            ConstraintTrackingWorker constraintTrackingWorker3 = mm0Var2.c;
            try {
                g13.O(objY);
                s62Var = s62Var2;
                constraintTrackingWorker2 = constraintTrackingWorker3;
                return (r62) objY;
            } catch (CancellationException e) {
                e = e;
                s62Var = s62Var2;
                constraintTrackingWorker2 = constraintTrackingWorker3;
                atomicInteger = constraintTrackingWorker2.c;
                atomicInteger2 = constraintTrackingWorker2.c;
                if (atomicInteger.get() == -256) {
                    if (Build.VERSION.SDK_INT < 31) {
                        i = -512;
                    } else if (atomicInteger2.get() != -256) {
                        i = atomicInteger2.get();
                    } else {
                        if (!(e instanceof km0)) {
                            u41.r("Unreachable");
                            return null;
                        }
                        i = ((km0) e).c;
                    }
                    s62Var.c.compareAndSet(-256, i);
                } else {
                    if (Build.VERSION.SDK_INT < 31) {
                        i = -512;
                    } else if (atomicInteger2.get() != -256) {
                        i = atomicInteger2.get();
                    } else {
                        if (!(e instanceof km0)) {
                            u41.r("Unreachable");
                            return null;
                        }
                        i = ((km0) e).c;
                    }
                    s62Var.c.compareAndSet(-256, i);
                }
                if (e instanceof km0) {
                    return new p62();
                }
                throw e;
            }
        }
        g13.O(objY);
        or0 or0Var = workerParameters2.b;
        or0Var.getClass();
        Object obj = or0Var.a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null || str.length() == 0) {
            v72.f().d(rm0.a, "No worker to delegate to.");
            return new o62();
        }
        wh4 wh4VarA = wh4.a(context);
        ji4 ji4VarU = wh4VarA.c.u();
        String string = workerParameters2.a.toString();
        string.getClass();
        hi4 hi4VarL = ji4VarU.l(string);
        if (hi4VarL == null) {
            return new o62();
        }
        a54 a54Var = wh4VarA.j;
        a54Var.getClass();
        sh1 sh1Var = new sh1(a54Var);
        if (!sh1Var.b(hi4VarL)) {
            String str2 = rm0.a;
            v72.f().c(str2, "Constraints not met for delegate " + str + ". Requesting retry.");
            return new p62();
        }
        v72.f().c(rm0.a, "Constraints met for delegate ".concat(str));
        try {
            t73 t73Var = workerParameters2.f;
            context.getClass();
            s62 s62VarO = t73Var.o(context, str, workerParameters);
            y83 y83Var = workerParameters.e.d;
            y83Var.getClass();
            try {
                zp0 zp0VarB = g13.B(y83Var);
                s62Var = s62VarO;
                try {
                    qb qbVar = new qb(constraintTrackingWorker2, s62Var, sh1Var, hi4VarL, null, 11);
                    mm0Var2.c = constraintTrackingWorker2;
                    mm0Var2.d = s62Var;
                    mm0Var2.m = 1;
                    objY = py.Y(zp0VarB, qbVar, mm0Var2);
                    hq0 hq0Var = hq0.c;
                    if (objY == hq0Var) {
                        return hq0Var;
                    }
                    return (r62) objY;
                } catch (CancellationException e2) {
                    e = e2;
                    atomicInteger = constraintTrackingWorker2.c;
                    atomicInteger2 = constraintTrackingWorker2.c;
                    if (atomicInteger.get() == -256 || (e instanceof km0)) {
                        if (Build.VERSION.SDK_INT < 31) {
                            i = -512;
                        } else if (atomicInteger2.get() != -256) {
                            i = atomicInteger2.get();
                        } else {
                            if (!(e instanceof km0)) {
                                u41.r("Unreachable");
                                return null;
                            }
                            i = ((km0) e).c;
                        }
                        s62Var.c.compareAndSet(-256, i);
                    }
                    if (e instanceof km0) {
                        return new p62();
                    }
                    throw e;
                }
            } catch (CancellationException e3) {
                e = e3;
                s62Var = s62VarO;
                atomicInteger = constraintTrackingWorker2.c;
                atomicInteger2 = constraintTrackingWorker2.c;
                if (atomicInteger.get() == -256) {
                    if (Build.VERSION.SDK_INT < 31) {
                        i = -512;
                    } else if (atomicInteger2.get() != -256) {
                        i = atomicInteger2.get();
                    } else {
                        if (!(e instanceof km0)) {
                            u41.r("Unreachable");
                            return null;
                        }
                        i = ((km0) e).c;
                    }
                    s62Var.c.compareAndSet(-256, i);
                } else {
                    if (Build.VERSION.SDK_INT < 31) {
                        i = -512;
                    } else if (atomicInteger2.get() != -256) {
                        i = atomicInteger2.get();
                    } else {
                        if (!(e instanceof km0)) {
                            u41.r("Unreachable");
                            return null;
                        }
                        i = ((km0) e).c;
                    }
                    s62Var.c.compareAndSet(-256, i);
                }
                if (e instanceof km0) {
                    return new p62();
                }
                throw e;
            }
        } catch (Throwable unused) {
            v72.f().c(rm0.a, "No worker to delegate to.");
            wh4VarA.b.getClass();
            return new o62();
        }
    }

    @Override // androidx.work.CoroutineWorker
    public final Object c(lq0 lq0Var) {
        ExecutorService executorService = this.b.c;
        executorService.getClass();
        return py.Y(g13.B(executorService), new f60(this, (so0) null, 2), lq0Var);
    }
}
