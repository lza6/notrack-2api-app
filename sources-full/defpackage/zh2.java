package defpackage;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class zh2 {
    public static final zh2 b = new zh2();
    public final AtomicReference a = new AtomicReference(new fz2(new fy2(9)));

    public final synchronized void a(az2 az2Var) {
        fy2 fy2Var = new fy2((fz2) this.a.get());
        HashMap map = (HashMap) fy2Var.c;
        ez2 ez2Var = new ez2(az2Var.a, qc0.class);
        if (map.containsKey(ez2Var)) {
            az2 az2Var2 = (az2) map.get(ez2Var);
            if (!az2Var2.equals(az2Var) || az2Var != az2Var2) {
                m51.w(ez2Var, "Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ");
            }
        } else {
            map.put(ez2Var, az2Var);
        }
        this.a.set(new fz2(fy2Var));
    }
}
