package defpackage;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class tj4 extends a71 {
    public static final mt2 n;
    public final mt2 h;
    public final a71 l;
    public final LinkedHashMap m;

    static {
        String str = mt2.d;
        n = Path$Companion.get("/");
    }

    public tj4(mt2 mt2Var, a71 a71Var, LinkedHashMap linkedHashMap) {
        a71Var.getClass();
        this.h = mt2Var;
        this.l = a71Var;
        this.m = linkedHashMap;
    }

    @Override // defpackage.a71
    public final List A(mt2 mt2Var) throws IOException {
        mt2 mt2Var2 = n;
        mt2Var2.getClass();
        sj4 sj4Var = (sj4) this.m.get(c.b(mt2Var2, mt2Var, true));
        if (sj4Var != null) {
            return ke0.O0(sj4Var.q);
        }
        j93.f(mt2Var, "not a directory: ");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00cf  */
    @Override // defpackage.a71
    public final z61 L(mt2 mt2Var) throws Throwable {
        Long lValueOf;
        Long lValueOf2;
        Long l;
        Long lValueOf3;
        Throwable th;
        Throwable th2;
        mt2Var.getClass();
        mt2 mt2Var2 = n;
        mt2Var2.getClass();
        sj4 sj4VarF = (sj4) this.m.get(c.b(mt2Var2, mt2Var, true));
        if (sj4VarF == null) {
            return null;
        }
        long j = sj4VarF.h;
        if (j != -1) {
            au1 au1VarO = this.l.O(this.h);
            try {
                u23 u23Var = new u23(au1VarO.a(j));
                try {
                    sj4VarF = wj4.f(u23Var, sj4VarF);
                    sj4VarF.getClass();
                    try {
                        u23Var.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        u23Var.close();
                    } catch (Throwable th5) {
                        gb2.l(th4, th5);
                    }
                    th2 = th4;
                    sj4VarF = null;
                }
                if (th2 != null) {
                    throw th2;
                }
                try {
                    au1VarO.close();
                    th = null;
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                if (au1VarO != null) {
                    try {
                        au1VarO.close();
                    } catch (Throwable th8) {
                        gb2.l(th7, th8);
                    }
                }
                th = th7;
                sj4VarF = null;
            }
            if (th != null) {
                throw th;
            }
        }
        boolean z = sj4VarF.b;
        boolean z2 = !z;
        Long lValueOf4 = z ? null : Long.valueOf(sj4VarF.f);
        Long l2 = sj4VarF.m;
        if (l2 != null) {
            lValueOf = Long.valueOf((l2.longValue() / 10000) - 11644473600000L);
        } else {
            Integer num = sj4VarF.p;
            lValueOf = num != null ? Long.valueOf(((long) num.intValue()) * 1000) : null;
        }
        Long l3 = sj4VarF.k;
        if (l3 != null) {
            lValueOf2 = Long.valueOf((l3.longValue() / 10000) - 11644473600000L);
        } else {
            Integer num2 = sj4VarF.n;
            if (num2 != null) {
                lValueOf2 = Long.valueOf(((long) num2.intValue()) * 1000);
            } else {
                int i = sj4VarF.j;
                if (i != -1) {
                    int i2 = sj4VarF.i;
                    if (i == -1) {
                        lValueOf2 = null;
                    } else {
                        int i3 = (i >> 11) & 31;
                        int i4 = (i >> 5) & 63;
                        int i5 = (i & 31) << 1;
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        gregorianCalendar.set(14, 0);
                        gregorianCalendar.set(((i2 >> 9) & 127) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, i3, i4, i5);
                        lValueOf2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                    }
                } else {
                    lValueOf2 = null;
                }
            }
        }
        Long l4 = sj4VarF.l;
        if (l4 == null) {
            Integer num3 = sj4VarF.o;
            if (num3 != null) {
                lValueOf3 = Long.valueOf(((long) num3.intValue()) * 1000);
            } else {
                l = null;
            }
            return new z61(z2, z, null, lValueOf4, lValueOf, lValueOf2, l);
        }
        lValueOf3 = Long.valueOf((l4.longValue() / 10000) - 11644473600000L);
        l = lValueOf3;
        return new z61(z2, z, null, lValueOf4, lValueOf, lValueOf2, l);
    }

    @Override // defpackage.a71
    public final au1 O(mt2 mt2Var) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // defpackage.a71
    public final zh3 Q(mt2 mt2Var, boolean z) throws IOException {
        mt2Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.a71
    public final wl3 R(mt2 mt2Var) throws Throwable {
        Throwable th;
        u23 u23Var;
        mt2Var.getClass();
        mt2 mt2Var2 = n;
        mt2Var2.getClass();
        sj4 sj4Var = (sj4) this.m.get(c.b(mt2Var2, mt2Var, true));
        if (sj4Var == null) {
            m51.r(mt2Var, "no such file: ");
            return null;
        }
        long j = sj4Var.f;
        au1 au1VarO = this.l.O(this.h);
        try {
            u23Var = new u23(au1VarO.a(sj4Var.h));
            try {
                au1VarO.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (au1VarO != null) {
                try {
                    au1VarO.close();
                } catch (Throwable th4) {
                    gb2.l(th3, th4);
                }
            }
            th = th3;
            u23Var = null;
        }
        if (th != null) {
            throw th;
        }
        u23Var.getClass();
        wj4.f(u23Var, null);
        if (sj4Var.g == 0) {
            return new r71(u23Var, j, true);
        }
        return new r71(new jo1(new u23(new r71(u23Var, sj4Var.e, true)), new Inflater(true)), j, false);
    }

    @Override // defpackage.a71
    public final zh3 a(mt2 mt2Var) throws IOException {
        mt2Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.a71
    public final void c(mt2 mt2Var, mt2 mt2Var2) throws IOException {
        mt2Var.getClass();
        mt2Var2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.a71
    public final void h(mt2 mt2Var) throws IOException {
        mt2Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.a71
    public final void l(mt2 mt2Var) throws IOException {
        mt2Var.getClass();
        throw new IOException("zip file systems are read-only");
    }
}
