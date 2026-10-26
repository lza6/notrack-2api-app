package defpackage;

import app.template.extension.BuildConfig;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class tf0 implements xp0, Serializable {
    public final xp0 c;
    public final vp0 d;

    public tf0(vp0 vp0Var, xp0 xp0Var) {
        xp0Var.getClass();
        vp0Var.getClass();
        this.c = xp0Var;
        this.d = vp0Var;
    }

    public final boolean equals(Object obj) {
        boolean zN;
        if (this == obj) {
            return true;
        }
        if (obj instanceof tf0) {
            tf0 tf0Var = (tf0) obj;
            int i = 2;
            tf0 tf0Var2 = tf0Var;
            int i2 = 2;
            while (true) {
                xp0 xp0Var = tf0Var2.c;
                tf0Var2 = xp0Var instanceof tf0 ? (tf0) xp0Var : null;
                if (tf0Var2 == null) {
                    break;
                }
                i2++;
            }
            tf0 tf0Var3 = this;
            while (true) {
                xp0 xp0Var2 = tf0Var3.c;
                tf0Var3 = xp0Var2 instanceof tf0 ? (tf0) xp0Var2 : null;
                if (tf0Var3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    vp0 vp0Var = this.d;
                    if (!kr1.n(tf0Var.get(vp0Var.getKey()), vp0Var)) {
                        zN = false;
                        break;
                    }
                    xp0 xp0Var3 = this.c;
                    if (!(xp0Var3 instanceof tf0)) {
                        xp0Var3.getClass();
                        vp0 vp0Var2 = (vp0) xp0Var3;
                        zN = kr1.n(tf0Var.get(vp0Var2.getKey()), vp0Var2);
                        break;
                    }
                    this = (tf0) xp0Var3;
                }
                if (zN) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.xp0
    public final Object fold(Object obj, ne1 ne1Var) {
        return ne1Var.invoke(this.c.fold(obj, ne1Var), this.d);
    }

    @Override // defpackage.xp0
    public final vp0 get(wp0 wp0Var) {
        wp0Var.getClass();
        while (true) {
            vp0 vp0Var = this.d.get(wp0Var);
            if (vp0Var != null) {
                return vp0Var;
            }
            xp0 xp0Var = this.c;
            if (!(xp0Var instanceof tf0)) {
                return xp0Var.get(wp0Var);
            }
            this = (tf0) xp0Var;
        }
    }

    public final int hashCode() {
        return this.d.hashCode() + this.c.hashCode();
    }

    @Override // defpackage.xp0
    public final xp0 minusKey(wp0 wp0Var) {
        wp0Var.getClass();
        vp0 vp0Var = this.d;
        vp0 vp0Var2 = vp0Var.get(wp0Var);
        xp0 xp0Var = this.c;
        if (vp0Var2 != null) {
            return xp0Var;
        }
        xp0 xp0VarMinusKey = xp0Var.minusKey(wp0Var);
        if (xp0VarMinusKey == xp0Var) {
            return this;
        }
        return xp0VarMinusKey == x21.c ? vp0Var : new tf0(vp0Var, xp0VarMinusKey);
    }

    @Override // defpackage.xp0
    public final xp0 plus(xp0 xp0Var) {
        xp0Var.getClass();
        return xp0Var == x21.c ? this : (xp0) xp0Var.fold(this, new oj0(4));
    }

    public final String toString() {
        return ud2.r(new StringBuilder("["), (String) fold(BuildConfig.VERSION_NAME, new ip(7)), ']');
    }
}
