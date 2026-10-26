package defpackage;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class wf2 {
    public static final qn0 a = new qn0(18);

    public static void a(iy2 iy2Var) {
        d5 d5Var;
        ArrayList arrayList = new ArrayList();
        uf2 uf2Var = uf2.b;
        Iterator it = ((ConcurrentMap) iy2Var.d).values().iterator();
        while (it.hasNext()) {
            for (hz2 hz2Var : (List) it.next()) {
                int iOrdinal = hz2Var.d.ordinal();
                if (iOrdinal == 1) {
                    d5Var = d5.J;
                } else if (iOrdinal == 2) {
                    d5Var = d5.K;
                } else {
                    if (iOrdinal != 3) {
                        u41.r("Unknown key status");
                        return;
                    }
                    d5Var = d5.L;
                }
                int i = hz2Var.f;
                String strSubstring = hz2Var.g;
                if (strSubstring.startsWith("type.googleapis.com/google.crypto.")) {
                    strSubstring = strSubstring.substring(34);
                }
                arrayList.add(new vf2(d5Var, i, strSubstring, hz2Var.e.name()));
            }
        }
        hz2 hz2Var2 = (hz2) iy2Var.h;
        Integer numValueOf = hz2Var2 != null ? Integer.valueOf(hz2Var2.f) : null;
        if (numValueOf != null) {
            try {
                int iIntValue = numValueOf.intValue();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    if (((vf2) obj).b == iIntValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
        Collections.unmodifiableList(arrayList);
    }
}
