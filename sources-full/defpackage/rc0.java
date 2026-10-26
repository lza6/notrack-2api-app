package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public final class rc0 implements jz2 {
    public static final rc0 a = new rc0();

    @Override // defpackage.jz2
    public final Class a() {
        return qc0.class;
    }

    @Override // defpackage.jz2
    public final Object b(iy2 iy2Var) throws GeneralSecurityException {
        if (((hz2) iy2Var.h) == null) {
            m51.v("no primary in primitive set");
            return null;
        }
        Iterator it = ((ConcurrentMap) iy2Var.d).values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new qc0();
    }

    @Override // defpackage.jz2
    public final Class c() {
        return qc0.class;
    }
}
