package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class h90 implements je1 {
    public final /* synthetic */ int c;
    public final Object d;
    public final /* synthetic */ Object h;

    public h90(ik1 ik1Var, lk1 lk1Var) {
        this.c = 2;
        this.h = ik1Var;
        this.d = lk1Var;
    }

    public /* synthetic */ h90(Object obj, int i, Object obj2) {
        this.c = i;
        this.d = obj;
        this.h = obj2;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        w84 w84Var = w84.a;
        Object obj = this.d;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                ((le1) obj).invoke((hn) obj2);
                return w84Var;
            case 1:
                ((hb0) obj).W(((w10) obj2).b);
                return w84Var;
            default:
                ik1 ik1Var = (ik1) obj2;
                lk1 lk1Var = (lk1) obj;
                try {
                    if (!lk1Var.a(true, this)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                    while (lk1Var.a(false, this)) {
                    }
                    ik1Var.a(1, 9, null);
                    ka4.d(lk1Var);
                    return w84Var;
                } catch (IOException e) {
                    ik1Var.a(2, 2, e);
                } catch (Throwable th) {
                    ik1Var.a(3, 3, null);
                    ka4.d(lk1Var);
                    throw th;
                }
                break;
        }
    }
}
