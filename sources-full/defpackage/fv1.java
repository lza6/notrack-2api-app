package defpackage;

import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class fv1 {
    public static final Logger b = Logger.getLogger(fv1.class.getName());
    public final ConcurrentHashMap a;

    public fv1() {
        this.a = new ConcurrentHashMap();
    }

    public fv1(fv1 fv1Var) {
        this.a = new ConcurrentHashMap(fv1Var.a);
    }

    public final synchronized ev1 a(String str) {
        if (!this.a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (ev1) this.a.get(str);
    }

    public final synchronized void b(sv1 sv1Var) {
        int iE = sv1Var.e();
        if (!(iE != 1 ? ud2.b(iE) : ud2.a(iE))) {
            throw new GeneralSecurityException("failed to register key manager " + sv1Var.getClass() + " as it is not FIPS compatible.");
        }
        c(new ev1(sv1Var));
    }

    public final synchronized void c(ev1 ev1Var) {
        sv1 sv1Var = ev1Var.a;
        Class cls = (Class) sv1Var.b;
        if (!((Map) sv1Var.c).keySet().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException("Given internalKeyMananger " + sv1Var.toString() + " does not support primitive class " + cls.getName());
        }
        String strF = sv1Var.f();
        ev1 ev1Var2 = (ev1) this.a.get(strF);
        if (ev1Var2 != null && !ev1Var2.a.getClass().equals(ev1Var.a.getClass())) {
            b.warning("Attempted overwrite of a registered key manager for key type ".concat(strF));
            throw new GeneralSecurityException("typeUrl (" + strF + ") is already registered with " + ev1Var2.a.getClass().getName() + ", cannot be re-registered with " + ev1Var.a.getClass().getName());
        }
        this.a.putIfAbsent(strF, ev1Var);
    }
}
