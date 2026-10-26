package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class tu2 implements wo0 {
    public static final List h = kr1.U("app_lock_enabled", "secure_mode", "theme_dark");
    public final yq3 c;
    public final SharedPreferences d;

    public tu2(Context context) {
        this.c = new yq3(new s2(context, 2));
        SharedPreferences sharedPreferences = context.getSharedPreferences("uid_mirror", 0);
        sharedPreferences.getClass();
        this.d = sharedPreferences;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("cookies", 0);
        String string = sharedPreferences2.getString("uid", null);
        if (string != null && b().getString("uid", null) == null) {
            b().edit().putString("uid", string).putString("uid_domain", sharedPreferences2.getString("uid_domain", "notrack.ai")).apply();
            sharedPreferences2.edit().clear().apply();
        }
        String string2 = b().getString("uid", null);
        String string3 = sharedPreferences.getString("uid", null);
        if (string2 != null && !string2.equals(string3)) {
            sharedPreferences.edit().putString("uid", string2).putString("uid_domain", b().getString("uid_domain", "notrack.ai")).apply();
        } else if (string2 == null && string3 != null) {
            b().edit().putString("uid", string3).putString("uid_domain", sharedPreferences.getString("uid_domain", "notrack.ai")).apply();
        }
        for (String str : h) {
            if (b().contains(str)) {
                sharedPreferences.edit().putBoolean(str, b().getBoolean(str, false)).apply();
            } else if (sharedPreferences.contains(str)) {
                b().edit().putBoolean(str, sharedPreferences.getBoolean(str, false)).apply();
            }
        }
    }

    public final boolean a(String str, boolean z) {
        return b().contains(str) ? b().getBoolean(str, z) : this.d.getBoolean(str, z);
    }

    public final SharedPreferences b() {
        return (SharedPreferences) this.c.getValue();
    }

    public final void c(String str, boolean z) {
        b().edit().putBoolean(str, z).apply();
        this.d.edit().putBoolean(str, z).apply();
    }

    @Override // defpackage.wo0
    public final synchronized List l(tk1 tk1Var) {
        tk1Var.getClass();
        String string = b().getString("uid", null);
        if (string == null) {
            string = this.d.getString("uid", null);
        }
        String str = string;
        if (str == null) {
            return z21.c;
        }
        String string2 = b().getString("uid_domain", null);
        if (string2 == null && (string2 = this.d.getString("uid_domain", null)) == null) {
            string2 = "notrack.ai";
        }
        if (!kr1.n(mo3.U0("uid").toString(), "uid")) {
            throw new IllegalArgumentException("name is not trimmed");
        }
        if (!kr1.n(mo3.U0(str).toString(), str)) {
            throw new IllegalArgumentException("value is not trimmed");
        }
        String strU = y64.U(string2);
        if (strU == null) {
            throw new IllegalArgumentException("unexpected domain: ".concat(string2));
        }
        if (to3.q0("/", "/", false)) {
            return kr1.T(new vo0("uid", str, 253402300799999L, strU, "/", false, false, false, false));
        }
        throw new IllegalArgumentException("path must start with '/'");
    }

    @Override // defpackage.wo0
    public final synchronized void o(tk1 tk1Var, List list) {
        Object objPrevious;
        try {
            tk1Var.getClass();
            ListIterator listIterator = list.listIterator(list.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((vo0) objPrevious).a.equals("uid"));
            vo0 vo0Var = (vo0) objPrevious;
            if (vo0Var == null) {
                return;
            }
            b().edit().putString("uid", vo0Var.b).putString("uid_domain", vo0Var.d).apply();
            this.d.edit().putString("uid", vo0Var.b).putString("uid_domain", vo0Var.d).commit();
        } catch (Throwable th) {
            throw th;
        }
    }
}
