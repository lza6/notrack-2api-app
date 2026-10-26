package androidx.work.impl;

import defpackage.aq3;
import defpackage.av0;
import defpackage.bi4;
import defpackage.bv0;
import defpackage.ci4;
import defpackage.fe2;
import defpackage.fy2;
import defpackage.gj;
import defpackage.hr3;
import defpackage.ir3;
import defpackage.ji4;
import defpackage.mi4;
import defpackage.p23;
import defpackage.sk3;
import defpackage.sr0;
import defpackage.wr1;
import defpackage.yp3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    public volatile ji4 l;
    public volatile bv0 m;
    public volatile mi4 n;
    public volatile ir3 o;
    public volatile bi4 p;
    public volatile ci4 q;
    public volatile fy2 r;

    @Override // androidx.work.impl.WorkDatabase
    public final wr1 d() {
        return new wr1(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.work.impl.WorkDatabase
    public final aq3 e(sr0 sr0Var) {
        return sr0Var.c.a(new yp3(sr0Var.a, sr0Var.b, new gj(sr0Var, new sk3(17, this)), false, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final bv0 f() {
        bv0 bv0Var;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            try {
                if (this.m == null) {
                    this.m = new bv0(this);
                }
                bv0Var = this.m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bv0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final List g(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new fe2(13, 14, 10));
        arrayList.add(new fe2(11));
        int i = 17;
        arrayList.add(new fe2(16, i, 12));
        int i2 = 18;
        arrayList.add(new fe2(i, i2, 13));
        arrayList.add(new fe2(i2, 19, 14));
        arrayList.add(new fe2(15));
        arrayList.add(new fe2(20, 21, 16));
        arrayList.add(new fe2(22, 23, 17));
        return arrayList;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final Set i() {
        return new HashSet();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final Map j() {
        HashMap map = new HashMap();
        List list = Collections.EMPTY_LIST;
        map.put(ji4.class, list);
        map.put(bv0.class, list);
        map.put(mi4.class, list);
        map.put(ir3.class, list);
        map.put(bi4.class, list);
        map.put(ci4.class, list);
        map.put(fy2.class, list);
        map.put(p23.class, list);
        return map;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final fy2 l() {
        fy2 fy2Var;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            try {
                if (this.r == null) {
                    fy2 fy2Var2 = new fy2();
                    fy2Var2.c = this;
                    fy2Var2.d = new av0(this);
                    this.r = fy2Var2;
                }
                fy2Var = this.r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fy2Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final ir3 q() {
        ir3 ir3Var;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    ir3 ir3Var2 = new ir3();
                    ir3Var2.c = this;
                    ir3Var2.d = new av0(this, 2);
                    ir3Var2.h = new hr3(this, 0);
                    ir3Var2.l = new hr3(this, 1);
                    this.o = ir3Var2;
                }
                ir3Var = this.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ir3Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final bi4 s() {
        bi4 bi4Var;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            try {
                if (this.p == null) {
                    bi4 bi4Var2 = new bi4();
                    bi4Var2.c = this;
                    bi4Var2.d = new av0(this, 3);
                    this.p = bi4Var2;
                }
                bi4Var = this.p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bi4Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final ci4 t() {
        ci4 ci4Var;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            try {
                if (this.q == null) {
                    this.q = new ci4(this);
                }
                ci4Var = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ci4Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final ji4 u() {
        ji4 ji4Var;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            try {
                if (this.l == null) {
                    this.l = new ji4(this);
                }
                ji4Var = this.l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ji4Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final mi4 v() {
        mi4 mi4Var;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            try {
                if (this.n == null) {
                    this.n = new mi4(this);
                }
                mi4Var = this.n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mi4Var;
    }
}
