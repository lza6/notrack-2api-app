package androidx.compose.ui.platform;

import android.os.Looper;
import android.view.Choreographer;
import defpackage.dg0;
import defpackage.eh1;
import defpackage.i04;
import defpackage.i92;
import defpackage.je1;
import defpackage.jq0;
import defpackage.jt0;
import defpackage.ne1;
import defpackage.nn1;
import defpackage.py;
import defpackage.sw0;
import defpackage.t73;
import defpackage.tv;
import defpackage.v41;
import defpackage.ww1;
import defpackage.x21;
import defpackage.xp0;
import defpackage.xp1;
import defpackage.yh4;
import defpackage.zp0;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidUiDispatcher$Companion$Main$2 extends ww1 implements je1 {
    public static final AndroidUiDispatcher$Companion$Main$2 INSTANCE = new AndroidUiDispatcher$Companion$Main$2();

    public AndroidUiDispatcher$Companion$Main$2() {
        super(0);
    }

    @Override // defpackage.je1
    public final xp0 invoke() throws Throwable {
        v41 v41VarA;
        xp0 xp0VarA;
        long jT;
        Choreographer choreographer;
        if (AndroidUiDispatcher_androidKt.isMainThread()) {
            choreographer = Choreographer.getInstance();
        } else {
            jt0 jt0Var = sw0.a;
            eh1 eh1Var = i92.a;
            ne1 androidUiDispatcher$Companion$Main$2$dispatcher$1 = new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(null);
            Thread threadCurrentThread = Thread.currentThread();
            t73 t73Var = t73.m;
            zp0 zp0Var = (zp0) eh1Var.get(t73Var);
            x21 x21Var = x21.c;
            if (zp0Var == null) {
                v41VarA = i04.a();
                xp0VarA = yh4.A(x21Var, eh1Var.plus((xp0) v41VarA), true);
                jt0 jt0Var2 = sw0.a;
                if (xp0VarA != jt0Var2 && xp0VarA.get(t73Var) == null) {
                    xp0VarA = xp0VarA.plus(jt0Var2);
                }
            } else {
                v41VarA = (v41) i04.a.get();
                xp0VarA = yh4.A(x21Var, eh1Var, true);
                jt0 jt0Var3 = sw0.a;
                if (xp0VarA != jt0Var3 && xp0VarA.get(t73Var) == null) {
                    xp0VarA = xp0VarA.plus(jt0Var3);
                }
            }
            tv tvVar = new tv(xp0VarA, threadCurrentThread, v41VarA);
            tvVar.g0(jq0.c, tvVar, androidUiDispatcher$Companion$Main$2$dispatcher$1);
            v41 v41Var = tvVar.o;
            if (v41Var != null) {
                int i = v41.l;
                v41Var.S(false);
            }
            while (true) {
                if (v41Var != null) {
                    try {
                        jT = v41Var.T();
                    } catch (Throwable th) {
                        if (v41Var != null) {
                            int i2 = v41.l;
                            v41Var.Q(false);
                        }
                        throw th;
                    }
                } else {
                    jT = LongCompanionObject.MAX_VALUE;
                }
                if (!(tvVar.E() instanceof nn1)) {
                    break;
                }
                LockSupport.parkNanos(tvVar, jT);
                if (Thread.interrupted()) {
                    tvVar.o(new InterruptedException());
                }
            }
            if (v41Var != null) {
                int i3 = v41.l;
                v41Var.Q(false);
            }
            Object objW = py.W(tvVar.E());
            dg0 dg0Var = objW instanceof dg0 ? (dg0) objW : null;
            if (dg0Var != null) {
                throw dg0Var.a;
            }
            choreographer = (Choreographer) objW;
        }
        AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, xp1.j(Looper.getMainLooper()), null);
        return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
    }
}
