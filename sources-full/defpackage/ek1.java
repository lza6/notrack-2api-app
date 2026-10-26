package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ek1 extends ss3 {
    public final /* synthetic */ ik1 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ dy g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek1(String str, ik1 ik1Var, int i, dy dyVar, int i2, boolean z) {
        super(str, true);
        this.e = ik1Var;
        this.f = i;
        this.g = dyVar;
        this.h = i2;
    }

    @Override // defpackage.ss3
    public final long a() {
        try {
            bg1 bg1Var = this.e.s;
            dy dyVar = this.g;
            int i = this.h;
            bg1Var.getClass();
            dyVar.skip(i);
            this.e.E.A(this.f, 9);
            synchronized (this.e) {
                this.e.G.remove(Integer.valueOf(this.f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
