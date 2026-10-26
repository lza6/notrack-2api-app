package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class dk1 extends ss3 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ik1 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dk1(String str, ik1 ik1Var, int i, int i2, int i3) {
        super(str, true);
        this.e = i3;
        this.f = ik1Var;
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.ss3
    public final long a() {
        switch (this.e) {
            case 0:
                ik1 ik1Var = this.f;
                try {
                    ik1Var.E.x(this.g, this.h, true);
                    break;
                } catch (IOException e) {
                    ik1Var.a(2, 2, e);
                }
                return -1L;
            case 1:
                bg1 bg1Var = this.f.s;
                int i = this.h;
                bg1Var.getClass();
                if (i == 0) {
                    throw null;
                }
                synchronized (this.f) {
                    this.f.G.remove(Integer.valueOf(this.g));
                }
                return -1L;
            default:
                ik1 ik1Var2 = this.f;
                try {
                    int i2 = this.g;
                    int i3 = this.h;
                    if (i3 == 0) {
                        throw null;
                    }
                    ik1Var2.E.A(i2, i3);
                    return -1L;
                } catch (IOException e2) {
                    ik1Var2.a(2, 2, e2);
                }
                break;
        }
    }
}
