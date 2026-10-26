package defpackage;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fk1 extends ss3 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ ik1 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk1(String str, ik1 ik1Var, int i, List list) {
        super(str, true);
        this.f = ik1Var;
        this.g = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk1(String str, ik1 ik1Var, int i, List list, boolean z) {
        super(str, true);
        this.f = ik1Var;
        this.g = i;
    }

    @Override // defpackage.ss3
    public final long a() {
        switch (this.e) {
            case 0:
                this.f.s.getClass();
                try {
                    this.f.E.A(this.g, 9);
                    synchronized (this.f) {
                        this.f.G.remove(Integer.valueOf(this.g));
                    }
                } catch (IOException unused) {
                }
                return -1L;
            default:
                this.f.s.getClass();
                try {
                    this.f.E.A(this.g, 9);
                    synchronized (this.f) {
                        this.f.G.remove(Integer.valueOf(this.g));
                    }
                } catch (IOException unused2) {
                }
                return -1L;
        }
    }
}
