package defpackage;

import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class at1 implements i31 {
    public static final ys1 n;
    public static final ys1 o;
    public final HashMap c;
    public final HashMap d;
    public final xs1 h;
    public boolean l;
    public static final xs1 m = new xs1(0);
    public static final zs1 p = new zs1();

    /* JADX WARN: Type inference failed for: r0v1, types: [ys1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ys1] */
    static {
        final int i = 0;
        n = new za4() { // from class: ys1
            @Override // defpackage.h31
            public final void a(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((ab4) obj2).b((String) obj);
                        break;
                    default:
                        ((ab4) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        o = new za4() { // from class: ys1
            @Override // defpackage.h31
            public final void a(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((ab4) obj2).b((String) obj);
                        break;
                    default:
                        ((ab4) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public at1() {
        HashMap map = new HashMap();
        this.c = map;
        HashMap map2 = new HashMap();
        this.d = map2;
        this.h = m;
        this.l = false;
        map2.put(String.class, n);
        map.remove(String.class);
        map2.put(Boolean.class, o);
        map.remove(Boolean.class);
        map2.put(Date.class, p);
        map.remove(Date.class);
    }

    public final i31 a(Class cls, an2 an2Var) {
        this.c.put(cls, an2Var);
        this.d.remove(cls);
        return this;
    }
}
