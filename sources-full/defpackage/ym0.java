package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ym0 implements gi3, jx1 {
    public long c;
    public ArrayList d;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.gi3
    public final Object b(so0 so0Var) throws Throwable {
        xm0 xm0Var;
        q43 q43Var;
        Throwable th;
        bw0 zv0Var;
        if (so0Var instanceof xm0) {
            xm0Var = (xm0) so0Var;
            int i = xm0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                xm0Var.l = i - Integer.MIN_VALUE;
            } else {
                xm0Var = new xm0(this, (uo0) so0Var);
            }
        } else {
            xm0Var = new xm0(this, (uo0) so0Var);
        }
        Object obj = xm0Var.d;
        int i2 = xm0Var.l;
        if (i2 == 0) {
            g13.O(obj);
            if (um0.k(this.c)) {
                q43 q43Var2 = new q43();
                try {
                    xm0Var.c = q43Var2;
                    xm0Var.l = 1;
                    t00 t00Var = new t00(1, gm4.G(xm0Var));
                    t00Var.u();
                    q43Var2.c = t00Var;
                    this.d.add(t00Var);
                    Object objS = t00Var.s();
                    hq0 hq0Var = hq0.c;
                    if (objS == hq0Var) {
                        return hq0Var;
                    }
                    q43Var = q43Var2;
                    ArrayList arrayList = this.d;
                    Object obj2 = q43Var.c;
                    y64.j(arrayList);
                    arrayList.remove(obj2);
                } catch (Throwable th2) {
                    q43Var = q43Var2;
                    th = th2;
                    ArrayList arrayList2 = this.d;
                    Object obj3 = q43Var.c;
                    y64.j(arrayList2);
                    arrayList2.remove(obj3);
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q43Var = xm0Var.c;
            try {
                g13.O(obj);
                ArrayList arrayList3 = this.d;
                Object obj4 = q43Var.c;
                y64.j(arrayList3);
                arrayList3.remove(obj4);
            } catch (Throwable th3) {
                th = th3;
                ArrayList arrayList4 = this.d;
                Object obj5 = q43Var.c;
                y64.j(arrayList4);
                arrayList4.remove(obj5);
                throw th;
            }
        }
        long j = this.c;
        int iH = um0.h(j);
        bw0 zv0Var2 = aw0.a;
        if (iH != Integer.MAX_VALUE) {
            yo4.b(iH);
            zv0Var = new zv0(iH);
        } else {
            zv0Var = zv0Var2;
        }
        int iG = um0.g(j);
        if (iG != Integer.MAX_VALUE) {
            yo4.b(iG);
            zv0Var2 = new zv0(iG);
        }
        return new ai3(zv0Var, zv0Var2);
    }

    public final void c(long j) {
        this.c = j;
        if (um0.k(j)) {
            return;
        }
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return;
        }
        this.d = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((so0) obj).resumeWith(w84.a);
        }
    }

    @Override // defpackage.jx1
    public final wb2 d(xb2 xb2Var, qb2 qb2Var, long j) {
        c(j);
        nv2 nv2VarC = qb2Var.c(j);
        return xb2Var.s(nv2VarC.c, nv2VarC.d, a31.c, new v(nv2VarC, 1));
    }
}
