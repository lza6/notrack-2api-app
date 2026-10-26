package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class wx implements xf2 {
    public final j c;
    public Throwable h;
    public final Object d = new Object();
    public ArrayList l = new ArrayList();
    public ArrayList m = new ArrayList();
    public final cn n = new cn(0);

    public wx(j jVar) {
        this.c = jVar;
    }

    public final void b(long j) {
        Object i63Var;
        synchronized (this.d) {
            try {
                ArrayList arrayList = this.l;
                this.l = this.m;
                this.m = arrayList;
                this.n.set(0);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    vx vxVar = (vx) arrayList.get(i);
                    t00 t00Var = vxVar.b;
                    try {
                        i63Var = vxVar.a.invoke(Long.valueOf(j));
                    } catch (Throwable th) {
                        i63Var = new i63(th);
                    }
                    t00Var.resumeWith(i63Var);
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.xp0
    public final Object fold(Object obj, ne1 ne1Var) {
        return ne1Var.invoke(obj, this);
    }

    @Override // defpackage.xp0
    public final vp0 get(wp0 wp0Var) {
        return y64.w(this, wp0Var);
    }

    @Override // defpackage.xp0
    public final xp0 minusKey(wp0 wp0Var) {
        return y64.H(this, wp0Var);
    }

    @Override // defpackage.xp0
    public final xp0 plus(xp0 xp0Var) {
        return y64.I(this, xp0Var);
    }

    @Override // defpackage.xf2
    public final Object withFrameNanos(le1 le1Var, so0 so0Var) {
        t00 t00Var = new t00(1, gm4.G(so0Var));
        t00Var.u();
        vx vxVar = new vx(le1Var, t00Var);
        synchronized (this.d) {
            Throwable th = this.h;
            if (th != null) {
                t00Var.resumeWith(new i63(th));
            } else {
                boolean zIsEmpty = this.l.isEmpty();
                this.l.add(vxVar);
                if (zIsEmpty) {
                    this.n.set(1);
                }
                t00Var.w(new rc(this, 10, vxVar));
                if (zIsEmpty) {
                    try {
                        this.c.invoke();
                    } catch (Throwable th2) {
                        synchronized (this.d) {
                            try {
                                if (this.h == null) {
                                    this.h = th2;
                                    ArrayList arrayList = this.l;
                                    int size = arrayList.size();
                                    for (int i = 0; i < size; i++) {
                                        ((vx) arrayList.get(i)).b.resumeWith(new i63(th2));
                                    }
                                    this.l.clear();
                                    this.n.set(0);
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
            }
        }
        return t00Var.s();
    }
}
