package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ck1 extends ss3 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ck1(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.ss3
    public final long a() {
        int i;
        long jA;
        pk1[] pk1VarArr;
        switch (this.e) {
            case 0:
                ik1 ik1Var = (ik1) this.f;
                ik1Var.c.a(ik1Var, (mg3) ((q43) this.g).c);
                return -1L;
            case 1:
                try {
                    ((ik1) this.f).c.b((pk1) this.g);
                    break;
                } catch (IOException e) {
                    vv2 vv2Var = vv2.a;
                    vv2 vv2Var2 = vv2.a;
                    String str = "Http2Connection.Listener failure for " + ((ik1) this.f).h;
                    vv2Var2.getClass();
                    vv2.i(str, 4, e);
                    try {
                        ((pk1) this.g).c(2, e);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                h90 h90Var = (h90) this.f;
                mg3 mg3Var = (mg3) this.g;
                q43 q43Var = new q43();
                ik1 ik1Var2 = (ik1) h90Var.h;
                synchronized (ik1Var2.E) {
                    try {
                        synchronized (ik1Var2) {
                            try {
                                mg3 mg3Var2 = ik1Var2.y;
                                mg3 mg3Var3 = new mg3();
                                mg3Var2.getClass();
                                i = 0;
                                for (int i2 = 0; i2 < 10; i2++) {
                                    if (((1 << i2) & mg3Var2.a) != 0) {
                                        mg3Var3.b(i2, mg3Var2.b[i2]);
                                    }
                                }
                                for (int i3 = 0; i3 < 10; i3++) {
                                    if (((1 << i3) & mg3Var.a) != 0) {
                                        mg3Var3.b(i3, mg3Var.b[i3]);
                                    }
                                }
                                q43Var.c = mg3Var3;
                                jA = ((long) mg3Var3.a()) - ((long) mg3Var2.a());
                                pk1VarArr = (jA == 0 || ik1Var2.d.isEmpty()) ? null : (pk1[]) ik1Var2.d.values().toArray(new pk1[0]);
                                mg3 mg3Var4 = (mg3) q43Var.c;
                                mg3Var4.getClass();
                                ik1Var2.y = mg3Var4;
                                ik1Var2.r.c(new ck1(ik1Var2.h + " onSettings", ik1Var2, q43Var, i), 0L);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        try {
                            ik1Var2.E.a((mg3) q43Var.c);
                        } catch (IOException e2) {
                            ik1Var2.a(2, 2, e2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                if (pk1VarArr != null) {
                    int length = pk1VarArr.length;
                    while (i < length) {
                        pk1 pk1Var = pk1VarArr[i];
                        synchronized (pk1Var) {
                            pk1Var.f += jA;
                            if (jA > 0) {
                                pk1Var.notifyAll();
                            }
                            break;
                        }
                        i++;
                    }
                }
                return -1L;
        }
    }
}
