package defpackage;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes.dex */
public final class gh1 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ je1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gh1(je1 je1Var, int i) {
        super(0);
        this.c = i;
        this.d = je1Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        je1 je1Var = this.d;
        switch (i) {
            case 0:
                try {
                    return (List) je1Var.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return z21.c;
                }
            case 1:
                je1Var.invoke();
                return w84.a;
            case 2:
                je1Var.invoke();
                return Boolean.TRUE;
            case 3:
                je1Var.invoke();
                return Boolean.TRUE;
            case 4:
                je1Var.invoke();
                return Boolean.TRUE;
            case 5:
                return Float.valueOf(py.w(((Number) je1Var.invoke()).floatValue(), 0.0f, 1.0f));
            default:
                return Float.valueOf(py.w(((Number) je1Var.invoke()).floatValue(), 0.0f, 1.0f));
        }
    }
}
