package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes.dex */
public final class gk1 extends ss3 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gk1(String str, Object obj, int i) {
        super(str, true);
        this.e = i;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk1(s11 s11Var, String str) {
        super(str, true);
        this.e = 1;
        this.f = s11Var;
    }

    @Override // defpackage.ss3
    public final long a() {
        int i = 0;
        switch (this.e) {
            case 0:
                ik1 ik1Var = (ik1) this.f;
                ik1Var.getClass();
                try {
                    ik1Var.E.x(2, 0, false);
                    break;
                } catch (IOException e) {
                    ik1Var.a(2, 2, e);
                }
                return -1L;
            case 1:
                s11 s11Var = (s11) this.f;
                long jNanoTime = System.nanoTime();
                long j = Long.MIN_VALUE;
                a33 a33Var = null;
                int i2 = 0;
                for (a33 a33Var2 : (ConcurrentLinkedQueue) s11Var.d) {
                    a33Var2.getClass();
                    synchronized (a33Var2) {
                        if (s11Var.b(a33Var2, jNanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j2 = jNanoTime - a33Var2.q;
                            if (j2 > j) {
                                a33Var = a33Var2;
                                j = j2;
                            }
                        }
                    }
                }
                long j3 = s11Var.a;
                if (j < j3 && i <= 5) {
                    if (i > 0) {
                        return j3 - j;
                    }
                    if (i2 > 0) {
                        return j3;
                    }
                    return -1L;
                }
                a33Var.getClass();
                synchronized (a33Var) {
                    if (!a33Var.p.isEmpty()) {
                        return 0L;
                    }
                    if (a33Var.q + j != jNanoTime) {
                        return 0L;
                    }
                    a33Var.j = true;
                    ((ConcurrentLinkedQueue) s11Var.d).remove(a33Var);
                    Socket socket = a33Var.d;
                    socket.getClass();
                    ka4.e(socket);
                    if (!((ConcurrentLinkedQueue) s11Var.d).isEmpty()) {
                        return 0L;
                    }
                    ((dt3) s11Var.b).a();
                    return 0L;
                }
            default:
                ((je1) this.f).invoke();
                return -1L;
        }
    }
}
