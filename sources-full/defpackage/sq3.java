package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sq3 extends of2 implements ix2, wu0, hx2 {
    public Object c;
    public Object d;
    public Object[] h;
    public PointerInputEventHandler l;
    public ym3 m;
    public yw2 n = oq3.a;
    public final oi2 o;
    public final oi2 p;
    public final oi2 q;
    public yw2 r;
    public long s;

    public sq3(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.c = obj;
        this.d = obj2;
        this.h = objArr;
        this.l = pointerInputEventHandler;
        oi2 oi2Var = new oi2(0, new rq3[16]);
        this.o = oi2Var;
        this.p = oi2Var;
        this.q = new oi2(0, new rq3[16]);
        this.s = 0L;
    }

    @Override // defpackage.hx2
    public final void D(yw2 yw2Var, zw2 zw2Var, long j) {
        this.s = j;
        if (zw2Var == zw2.c) {
            this.n = yw2Var;
        }
        so0 so0Var = null;
        if (this.m == null) {
            this.m = py.F(getCoroutineScope(), null, jq0.l, new f60(this, so0Var, 13), 1);
        }
        w0(yw2Var, zw2Var);
        List list = yw2Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!py.u((dx2) list.get(i))) {
                this.r = yw2Var;
            }
        }
        yw2Var = null;
        this.r = yw2Var;
    }

    @Override // defpackage.hx2
    public final void e0() {
        x0();
    }

    @Override // defpackage.wu0
    public final float getDensity() {
        return y64.M(this).G.getDensity();
    }

    @Override // defpackage.hx2
    public final void h0() {
        yw2 yw2Var = this.r;
        if (yw2Var == null) {
            return;
        }
        List list = yw2Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((dx2) list.get(i)).d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    dx2 dx2Var = (dx2) list.get(i2);
                    long j = dx2Var.a;
                    long j2 = dx2Var.c;
                    long j3 = dx2Var.b;
                    float f = dx2Var.e;
                    boolean z = dx2Var.d;
                    arrayList.add(new dx2(j, j3, j2, false, f, j3, j2, z, z, dx2Var.i, 0L));
                }
                yw2 yw2Var2 = new yw2(arrayList, null);
                this.n = yw2Var2;
                w0(yw2Var2, zw2.c);
                w0(yw2Var2, zw2.d);
                w0(yw2Var2, zw2.h);
                this.r = null;
                return;
            }
        }
    }

    @Override // defpackage.wu0
    public final float l() {
        return y64.M(this).G.l();
    }

    @Override // defpackage.iu0
    public final void onDensityChange() {
        x0();
    }

    @Override // defpackage.of2
    public final void onDetach() {
        x0();
        super.onDetach();
    }

    public final Object v0(ne1 ne1Var, so0 so0Var) {
        t00 t00Var = new t00(1, gm4.G(so0Var));
        t00Var.u();
        rq3 rq3Var = new rq3(this, t00Var);
        synchronized (this.p) {
            this.o.c(rq3Var);
            new s83(gm4.G(gm4.o(rq3Var, rq3Var, ne1Var))).resumeWith(w84.a);
        }
        t00Var.w(new pj2(20, rq3Var));
        return t00Var.s();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003d A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:6:0x000d, B:13:0x001b, B:16:0x0027, B:18:0x002f, B:20:0x0033, B:21:0x0038, B:24:0x003d, B:26:0x0046, B:28:0x004e, B:30:0x0052), top: B:41:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0046 A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:6:0x000d, B:13:0x001b, B:16:0x0027, B:18:0x002f, B:20:0x0033, B:21:0x0038, B:24:0x003d, B:26:0x0046, B:28:0x004e, B:30:0x0052), top: B:41:0x000d }] */
    public final void w0(yw2 yw2Var, zw2 zw2Var) {
        Object[] objArr;
        int i;
        int i2;
        rq3 rq3Var;
        t00 t00Var;
        t00 t00Var2;
        synchronized (this.p) {
            oi2 oi2Var = this.q;
            oi2Var.d(oi2Var.h, this.o);
        }
        try {
            int iOrdinal = zw2Var.ordinal();
            if (iOrdinal == 0) {
                oi2 oi2Var2 = this.q;
                objArr = oi2Var2.c;
                i = oi2Var2.h;
                for (i2 = 0; i2 < i; i2++) {
                    rq3Var = (rq3) objArr[i2];
                    if (zw2Var != rq3Var.l && (t00Var = rq3Var.h) != null) {
                        rq3Var.h = null;
                        t00Var.resumeWith(yw2Var);
                    }
                }
            } else if (iOrdinal == 1) {
                oi2 oi2Var3 = this.q;
                int i3 = oi2Var3.h - 1;
                Object[] objArr2 = oi2Var3.c;
                if (i3 < objArr2.length) {
                    while (i3 >= 0) {
                        rq3 rq3Var2 = (rq3) objArr2[i3];
                        if (zw2Var == rq3Var2.l && (t00Var2 = rq3Var2.h) != null) {
                            rq3Var2.h = null;
                            t00Var2.resumeWith(yw2Var);
                        }
                        i3--;
                    }
                }
            } else if (iOrdinal == 2) {
                oi2 oi2Var4 = this.q;
                objArr = oi2Var4.c;
                i = oi2Var4.h;
                while (i2 < i) {
                    rq3Var = (rq3) objArr[i2];
                    if (zw2Var != rq3Var.l) {
                    }
                }
            }
            this.q.i();
        } catch (Throwable th) {
            this.q.i();
            throw th;
        }
    }

    public final void x0() {
        ym3 ym3Var = this.m;
        if (ym3Var != null) {
            ym3Var.q(new a81("Pointer input was reset", 4));
            this.m = null;
        }
    }
}
