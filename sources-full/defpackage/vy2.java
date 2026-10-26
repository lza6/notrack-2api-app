package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class vy2 extends ThreadLocal {
    public final /* synthetic */ bc a;

    public vy2(bc bcVar) {
        this.a = bcVar;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        bc bcVar = this.a;
        try {
            r31 r31Var = r31.c;
            Mac mac = (Mac) r31Var.a.a((String) bcVar.h);
            mac.init((SecretKeySpec) bcVar.l);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
