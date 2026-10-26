package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class q31 {
    public final /* synthetic */ int a;
    public final a41 b;

    public /* synthetic */ q31(a41 a41Var, int i) {
        this.a = i;
        this.b = a41Var;
    }

    public final Object a(String str) throws GeneralSecurityException {
        int i = this.a;
        int i2 = 0;
        a41 a41Var = this.b;
        Exception exc = null;
        switch (i) {
            case 0:
                String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < 2; i3++) {
                    Provider provider = Security.getProvider(strArr[i3]);
                    if (provider != null) {
                        arrayList.add(provider);
                    }
                }
                int size = arrayList.size();
                Exception exc2 = null;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    try {
                        return a41Var.c(str, (Provider) obj);
                    } catch (Exception e) {
                        if (exc2 == null) {
                            exc2 = e;
                        }
                    }
                }
                return a41Var.c(str, null);
            case 1:
                return a41Var.c(str, null);
            default:
                String[] strArr2 = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
                ArrayList arrayList2 = new ArrayList();
                for (int i4 = 0; i4 < 3; i4++) {
                    Provider provider2 = Security.getProvider(strArr2[i4]);
                    if (provider2 != null) {
                        arrayList2.add(provider2);
                    }
                }
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    try {
                        return a41Var.c(str, (Provider) obj2);
                    } catch (Exception e2) {
                        if (exc == null) {
                            exc = e2;
                        }
                    }
                }
                throw new GeneralSecurityException("No good Provider found.", exc);
        }
    }
}
