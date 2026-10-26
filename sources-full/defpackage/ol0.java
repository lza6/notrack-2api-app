package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ol0 {
    public boolean a = true;
    public boolean b;
    public Object c;
    public Serializable d;

    public pl0 a() {
        return new pl0(this.a, this.b, (String[]) this.c, (String[]) this.d);
    }

    public void b(sc0... sc0VarArr) {
        if (!this.a) {
            u41.k("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(sc0VarArr.length);
        for (sc0 sc0Var : sc0VarArr) {
            arrayList.add(sc0Var.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void c(String... strArr) {
        if (!this.a) {
            u41.k("no cipher suites for cleartext connections");
        } else if (strArr.length != 0) {
            this.c = (String[]) strArr.clone();
        } else {
            u41.k("At least one cipher suite is required");
        }
    }

    public void d(b14... b14VarArr) {
        if (!this.a) {
            u41.k("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(b14VarArr.length);
        for (b14 b14Var : b14VarArr) {
            arrayList.add(b14Var.c);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Serializable, java.lang.String[]] */
    public void e(String... strArr) {
        if (!this.a) {
            u41.k("no TLS versions for cleartext connections");
        } else if (strArr.length != 0) {
            this.d = (String[]) strArr.clone();
        } else {
            u41.k("At least one TLS version is required");
        }
    }
}
