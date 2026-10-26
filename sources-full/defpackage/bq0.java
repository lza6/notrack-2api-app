package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes.dex */
public abstract class bq0 {
    public static final List a;

    static {
        try {
            Iterator it = Arrays.asList(new db()).iterator();
            it.getClass();
            a = rf3.b0(new em0(new qe0(1, it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
