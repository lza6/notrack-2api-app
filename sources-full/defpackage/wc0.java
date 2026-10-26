package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wc0 {
    public final String a;
    public List b = z21.c;
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public wc0(String str) {
        this.a = str;
    }

    public static void a(wc0 wc0Var, String str, tf3 tf3Var) {
        wc0Var.getClass();
        str.getClass();
        tf3Var.getClass();
        if (!wc0Var.d.add(str)) {
            StringBuilder sbS = fq2.s("Element with name '", str, "' is already registered in ");
            sbS.append(wc0Var.a);
            throw new IllegalArgumentException(sbS.toString().toString());
        }
        wc0Var.c.add(str);
        wc0Var.e.add(tf3Var);
        wc0Var.f.add(z21.c);
        wc0Var.g.add(false);
    }
}
