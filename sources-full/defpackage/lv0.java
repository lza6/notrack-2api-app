package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class lv0 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public final Object f;
    public Object g;
    public Object h;

    public lv0(AssetManager assetManager, Executor executor, c03 c03Var, String str, File file) {
        byte[] bArr;
        this.a = false;
        this.b = executor;
        this.c = c03Var;
        this.g = str;
        this.f = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 24:
                case 25:
                    bArr = y64.g;
                    break;
                case 26:
                    bArr = y64.f;
                    break;
                case 27:
                    bArr = y64.e;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = y64.d;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = y64.c;
        }
        this.d = bArr;
    }

    public lv0(hg hgVar, uz3 uz3Var, boolean z, wu0 wu0Var, kb1 kb1Var, List list) {
        this.b = hgVar;
        this.c = uz3Var;
        this.a = z;
        this.d = wu0Var;
        this.e = kb1Var;
        this.f = list;
    }

    public lv0(oc3 oc3Var, jb jbVar, xg0 xg0Var, wu0 wu0Var) {
        this.b = oc3Var;
        this.c = jbVar;
        this.d = xg0Var;
        this.e = wu0Var;
        this.f = gm4.b(IntCompanionObject.MAX_VALUE, 6, null);
        this.h = new bv0(8);
    }

    public static final float a(lv0 lv0Var, mc3 mc3Var, float f) {
        oc3 oc3Var = (oc3) lv0Var.b;
        long jH = oc3Var.h(oc3Var.d(f));
        oc3 oc3Var2 = mc3Var.a;
        return oc3Var.g(oc3Var.e(oc3.a(oc3Var2, oc3Var2.j, jH, 1)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public static final Object b(lv0 lv0Var, oc3 oc3Var, dg2 dg2Var, float f, float f2, uo0 uo0Var) throws Throwable {
        eg2 eg2Var;
        n43 n43Var;
        lv0 lv0Var2;
        float f3;
        oc3 oc3Var2;
        lv0Var.getClass();
        if (uo0Var instanceof eg2) {
            eg2Var = (eg2) uo0Var;
            int i = eg2Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                eg2Var.o = i - Integer.MIN_VALUE;
            } else {
                eg2Var = new eg2(lv0Var, uo0Var);
            }
        } else {
            eg2Var = new eg2(lv0Var, uo0Var);
        }
        eg2 eg2Var2 = eg2Var;
        Object obj = eg2Var2.m;
        int i2 = eg2Var2.o;
        w84 w84Var = w84.a;
        hq0 hq0Var = hq0.c;
        if (i2 == 0) {
            g13.O(obj);
            q43 q43Var = new q43();
            q43Var.c = dg2Var;
            lv0Var.h(dg2Var);
            dg2 dg2VarG = g((jy) lv0Var.f);
            if (dg2VarG != null) {
                lv0Var.h(dg2VarG);
                q43Var.c = ((dg2) q43Var.c).a(dg2VarG);
            }
            n43 n43Var2 = new n43();
            float fG = oc3Var.g(oc3Var.e(((dg2) q43Var.c).a));
            n43Var2.c = fG;
            if (!py.k(fG)) {
                q43 q43Var2 = new q43();
                q43Var2.c = av1.a(0.0f, 0.0f, 30);
                fg2 fg2Var = new fg2(n43Var2, q43Var2, q43Var, f, lv0Var, f2, oc3Var, null);
                eg2Var2.c = lv0Var;
                eg2Var2.d = oc3Var;
                eg2Var2.h = n43Var2;
                eg2Var2.l = f2;
                eg2Var2.o = 1;
                if (lv0Var.i(oc3Var, fg2Var, eg2Var2) != hq0Var) {
                    n43Var = n43Var2;
                    lv0Var2 = lv0Var;
                    f3 = f2;
                    oc3Var2 = oc3Var;
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                g13.O(obj);
                return w84Var;
            }
            u41.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        f3 = eg2Var2.l;
        n43Var = eg2Var2.h;
        oc3Var2 = eg2Var2.d;
        lv0Var2 = eg2Var2.c;
        g13.O(obj);
        bv0 bv0Var = (bv0) lv0Var2.h;
        long jC = gm4.c(((fc4) bv0Var.d).b(Float.MAX_VALUE), ((fc4) bv0Var.h).b(Float.MAX_VALUE));
        if (jC == 0) {
            float fD = oc3Var2.d(Math.signum(n43Var.c)) * Math.min(Math.abs(n43Var.c) / 100.0f, f3) * 1000.0f;
            if (fD == 0.0f) {
                jC = 0;
            } else {
                jC = oc3Var2.d == nq2.d ? gm4.c(fD, 0.0f) : gm4.c(0.0f, fD);
            }
        }
        xg0 xg0Var = (xg0) lv0Var2.d;
        eg2Var2.c = null;
        eg2Var2.d = null;
        eg2Var2.h = null;
        eg2Var2.o = 2;
        fc3 fc3Var = (fc3) xg0Var.c;
        py.F(fc3Var.u.c(), null, null, new cc3(fc3Var, jC, null, 2), 3);
        return w84Var == hq0Var ? hq0Var : w84Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object c(lv0 lv0Var, q43 q43Var, n43 n43Var, oc3 oc3Var, q43 q43Var2, long j, uo0 uo0Var) throws Throwable {
        gg2 gg2Var;
        n43 n43Var2;
        oc3 oc3Var2;
        q43 q43Var3;
        boolean z;
        if (uo0Var instanceof gg2) {
            gg2Var = (gg2) uo0Var;
            int i = gg2Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                gg2Var.o = i - Integer.MIN_VALUE;
            } else {
                gg2Var = new gg2(uo0Var);
            }
        } else {
            gg2Var = new gg2(uo0Var);
        }
        Object objK0 = gg2Var.n;
        int i2 = gg2Var.o;
        so0 so0Var = null;
        if (i2 == 0) {
            g13.O(objK0);
            if (j < 0) {
                return Boolean.FALSE;
            }
            f60 f60Var = new f60(lv0Var, so0Var, 11);
            gg2Var.c = lv0Var;
            gg2Var.d = q43Var;
            gg2Var.h = n43Var;
            gg2Var.l = oc3Var;
            gg2Var.m = q43Var2;
            gg2Var.o = 1;
            objK0 = vl0.k0(j, f60Var, gg2Var);
            hq0 hq0Var = hq0.c;
            if (objK0 == hq0Var) {
                return hq0Var;
            }
            n43Var2 = n43Var;
            oc3Var2 = oc3Var;
            q43Var3 = q43Var2;
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q43 q43Var4 = gg2Var.m;
            oc3 oc3Var3 = gg2Var.l;
            n43Var2 = gg2Var.h;
            q43 q43Var5 = gg2Var.d;
            lv0 lv0Var2 = gg2Var.c;
            g13.O(objK0);
            q43Var3 = q43Var4;
            oc3Var2 = oc3Var3;
            q43Var = q43Var5;
            lv0Var = lv0Var2;
        }
        dg2 dg2Var = (dg2) objK0;
        if (dg2Var != null) {
            boolean z2 = ((dg2) q43Var.c).c;
            long j2 = dg2Var.a;
            q43Var.c = new dg2(j2, dg2Var.b, z2);
            n43Var2.c = oc3Var2.g(oc3Var2.e(j2));
            q43Var3.c = av1.a(0.0f, 0.0f, 30);
            lv0Var.h(dg2Var);
            z = !py.k(n43Var2.c);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static dg2 g(jy jyVar) {
        dg2 dg2Var = null;
        qf3 qf3VarM = sf3.M(new nc1(new j(23, jyVar), 0 == true ? 1 : 0, 2));
        while (qf3VarM.hasNext()) {
            dg2 dg2VarA = (dg2) qf3VarM.next();
            if (dg2Var != null) {
                dg2VarA = dg2Var.a(dg2VarA);
            }
            dg2Var = dg2VarA;
        }
        return dg2Var;
    }

    public void d(dx1 dx1Var) {
        vu vuVar = (vu) this.g;
        if (vuVar == null || dx1Var != ((dx1) this.h) || vuVar.b()) {
            this.h = dx1Var;
            vuVar = new vu((hg) this.b, yh4.Q((uz3) this.c, dx1Var), (List) this.f, (wu0) this.d, (kb1) this.e);
        }
        this.g = vuVar;
    }

    public FileInputStream e(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((c03) this.c).k();
            return null;
        }
    }

    public void f(int i, Serializable serializable) {
        ((Executor) this.b).execute(new iu(i, 3, this, serializable));
    }

    public void h(dg2 dg2Var) {
        bv0 bv0Var = (bv0) this.h;
        long j = dg2Var.b;
        long j2 = dg2Var.a;
        ((fc4) bv0Var.d).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
        ((fc4) bv0Var.h).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(oc3 oc3Var, fg2 fg2Var, uo0 uo0Var) throws Throwable {
        hg2 hg2Var;
        if (uo0Var instanceof hg2) {
            hg2Var = (hg2) uo0Var;
            int i = hg2Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                hg2Var.l = i - Integer.MIN_VALUE;
            } else {
                hg2Var = new hg2(this, uo0Var);
            }
        } else {
            hg2Var = new hg2(this, uo0Var);
        }
        Object obj = hg2Var.d;
        int i2 = hg2Var.l;
        so0 so0Var = null;
        if (i2 == 0) {
            g13.O(obj);
            this.a = true;
            k kVar = new k(oc3Var, fg2Var, so0Var, 21);
            hg2Var.c = this;
            hg2Var.l = 1;
            qp3 qp3Var = new qp3(hg2Var, hg2Var.getContext());
            Object objC0 = vl0.c0(qp3Var, true, qp3Var, kVar);
            hq0 hq0Var = hq0.c;
            if (objC0 == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = hg2Var.c;
            g13.O(obj);
        }
        this.a = false;
        return w84.a;
    }
}
