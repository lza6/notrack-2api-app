package defpackage;

import androidx.compose.ui.platform.ViewConfiguration;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class pj3 extends h63 implements ne1 {
    public Object d;
    public dz0 h;
    public n43 l;
    public l43 m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ n23 p;
    public final /* synthetic */ iy2 q;
    public final /* synthetic */ gq0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj3(n23 n23Var, iy2 iy2Var, gq0 gq0Var, so0 so0Var) {
        super(2, so0Var);
        this.p = n23Var;
        this.q = iy2Var;
        this.r = gq0Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        pj3 pj3Var = new pj3(this.p, this.q, this.r, so0Var);
        pj3Var.o = obj;
        return pj3Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        return ((pj3) create((rq3) obj, (so0) obj2)).invokeSuspend(w84.a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:37:0x0101  */
    /* JADX WARN: Code duplicated, block: B:38:0x0109  */
    /* JADX WARN: Code duplicated, block: B:55:0x0169  */
    /* JADX WARN: Code duplicated, block: B:56:0x0170  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ab A[Catch: CancellationException -> 0x01b1, TryCatch #0 {CancellationException -> 0x01b1, blocks: (B:64:0x01a3, B:66:0x01ab, B:68:0x01b3), top: B:77:0x01a3 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01b3 A[Catch: CancellationException -> 0x01b1, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x01b1, blocks: (B:64:0x01a3, B:66:0x01ab, B:68:0x01b3), top: B:77:0x01a3 }] */
    /* JADX WARN: Type inference failed for: r16v0, types: [jq0, so0, xp0] */
    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        rq3 rq3Var;
        Object objB;
        dx2 dx2Var;
        dz0 dz0Var;
        n43 n43Var;
        l43 l43Var;
        int i;
        Object objD;
        ps2 ps2Var;
        boolean z;
        float f;
        Object obj2;
        dz0 dz0Var2;
        l43 l43Var2;
        Object objH;
        ViewConfiguration viewConfigurationI;
        int i2;
        float touchSlop;
        Object cz0Var;
        iy2 iy2Var = this.q;
        n23 n23Var = (n23) iy2Var.d;
        n23 n23Var2 = this.p;
        bt2 bt2Var = n23Var2.l;
        ft2 ft2Var = n23Var2.n;
        int i3 = this.n;
        gq0 gq0Var = this.r;
        hq0 hq0Var = hq0.c;
        if (i3 == 0) {
            g13.O(obj);
            rq3Var = (rq3) this.o;
            this.o = rq3Var;
            this.n = 1;
            objB = os3.b(rq3Var, (2 & 1) != 0, zw2.d, this);
            if (objB != hq0Var) {
            }
            return hq0Var;
        }
        if (i3 == 1) {
            rq3Var = (rq3) this.o;
            g13.O(obj);
            objB = obj;
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l43Var2 = (l43) this.d;
                dz0Var2 = (dz0) this.o;
                try {
                    g13.O(obj);
                    dz0Var = dz0Var2;
                    obj2 = null;
                    objH = obj;
                    try {
                        if (((Boolean) objH).booleanValue()) {
                            cz0Var = new ez0(dz0Var);
                        } else {
                            cz0Var = new cz0(dz0Var);
                        }
                    } catch (CancellationException unused) {
                        dz0Var2 = dz0Var;
                        cz0Var = new cz0(dz0Var2);
                    }
                } catch (CancellationException unused2) {
                    obj2 = null;
                    cz0Var = new cz0(dz0Var2);
                    n23Var2.o.invoke(Boolean.valueOf(l43Var2.c));
                    ?? r16 = obj2;
                    py.F(gq0Var, r16, r16, new q8(iy2Var, l43Var2, cz0Var, (so0) r16, 29), 3);
                    return w84.a;
                }
                n23Var2.o.invoke(Boolean.valueOf(l43Var2.c));
                ?? r17 = obj2;
                py.F(gq0Var, r17, r17, new q8(iy2Var, l43Var2, cz0Var, (so0) r17, 29), 3);
                return w84.a;
            }
            l43 l43Var3 = this.m;
            n43Var = this.l;
            dz0 dz0Var3 = this.h;
            dx2Var = (dx2) this.d;
            rq3Var = (rq3) this.o;
            g13.O(obj);
            l43Var = l43Var3;
            i = 2;
            dz0Var = dz0Var3;
            objD = obj;
            ps2Var = (ps2) objD;
            if (ps2Var != null) {
                viewConfigurationI = rq3Var.i();
                i2 = dx2Var.i;
                float f2 = hy0.a;
                if (i2 == i) {
                    touchSlop = viewConfigurationI.getTouchSlop() * hy0.a;
                } else {
                    touchSlop = viewConfigurationI.getTouchSlop();
                }
                if (Math.abs(n23Var2.m.f() - n43Var.c) < touchSlop && Math.abs(bt2Var.f() - n43Var.c) < touchSlop) {
                    float fFloatValue = ((Number) ps2Var.d).floatValue();
                    l43Var.c = ((Boolean) ft2Var.getValue()).booleanValue() ? fFloatValue < 0.0f : fFloatValue >= 0.0f;
                    n43Var.c = ln2.f(py.L((dx2) ps2Var.c, false)) + n43Var.c;
                }
            }
            z = l43Var.c;
            float f3 = n43Var.c;
            if (z) {
                f = n23Var.l.f();
            } else {
                f = n23Var.m.f();
            }
            n23Var.e(f3 - f, z);
            py.F(gq0Var, null, null, new fb0(iy2Var, z, dz0Var, (so0) null), 3);
            try {
                long j = dx2Var.a;
                sg2 sg2Var = new sg2(n23Var2, 11, l43Var);
                this.o = dz0Var;
                this.d = l43Var;
                obj2 = null;
                try {
                    this.h = null;
                    this.l = null;
                    this.m = null;
                    this.n = 3;
                    objH = uy0.h(rq3Var, j, sg2Var, this);
                    if (objH != hq0Var) {
                        l43Var2 = l43Var;
                        if (((Boolean) objH).booleanValue()) {
                            cz0Var = new ez0(dz0Var);
                        } else {
                            cz0Var = new cz0(dz0Var);
                        }
                        n23Var2.o.invoke(Boolean.valueOf(l43Var2.c));
                        ?? r18 = obj2;
                        py.F(gq0Var, r18, r18, new q8(iy2Var, l43Var2, cz0Var, (so0) r18, 29), 3);
                        return w84.a;
                    }
                    return hq0Var;
                } catch (CancellationException unused3) {
                    dz0Var2 = dz0Var;
                    l43Var2 = l43Var;
                    cz0Var = new cz0(dz0Var2);
                    n23Var2.o.invoke(Boolean.valueOf(l43Var2.c));
                    ?? r19 = obj2;
                    py.F(gq0Var, r19, r19, new q8(iy2Var, l43Var2, cz0Var, (so0) r19, 29), 3);
                    return w84.a;
                }
            } catch (CancellationException unused4) {
                obj2 = null;
            }
        }
        dx2Var = (dx2) objB;
        dz0Var = new dz0();
        n43Var = new n43();
        float f4 = ((Boolean) ft2Var.getValue()).booleanValue() ? n23Var2.k.f() - ln2.f(dx2Var.c) : ln2.f(dx2Var.c);
        n43Var.c = f4;
        int iCompare = Float.compare(Math.abs(n23Var.l.f() - f4), Math.abs(n23Var.m.f() - f4));
        l43Var = new l43();
        l43Var.c = iCompare == 0 ? bt2Var.f() > n43Var.c : iCompare < 0;
        long j2 = dx2Var.a;
        int i4 = dx2Var.i;
        this.o = rq3Var;
        this.d = dx2Var;
        this.h = dz0Var;
        this.l = n43Var;
        this.m = l43Var;
        i = 2;
        this.n = 2;
        objD = rj3.d(rq3Var, j2, i4, this);
        if (objD != hq0Var) {
            ps2Var = (ps2) objD;
            if (ps2Var != null) {
                viewConfigurationI = rq3Var.i();
                i2 = dx2Var.i;
                float f5 = hy0.a;
                if (i2 == i) {
                    touchSlop = viewConfigurationI.getTouchSlop() * hy0.a;
                } else {
                    touchSlop = viewConfigurationI.getTouchSlop();
                }
                if (Math.abs(n23Var2.m.f() - n43Var.c) < touchSlop) {
                    float fFloatValue2 = ((Number) ps2Var.d).floatValue();
                    l43Var.c = ((Boolean) ft2Var.getValue()).booleanValue() ? fFloatValue2 < 0.0f : fFloatValue2 >= 0.0f;
                    n43Var.c = ln2.f(py.L((dx2) ps2Var.c, false)) + n43Var.c;
                }
            }
            z = l43Var.c;
            float f6 = n43Var.c;
            if (z) {
                f = n23Var.l.f();
            } else {
                f = n23Var.m.f();
            }
            n23Var.e(f6 - f, z);
            py.F(gq0Var, null, null, new fb0(iy2Var, z, dz0Var, (so0) null), 3);
            long j3 = dx2Var.a;
            sg2 sg2Var2 = new sg2(n23Var2, 11, l43Var);
            this.o = dz0Var;
            this.d = l43Var;
            obj2 = null;
            this.h = null;
            this.l = null;
            this.m = null;
            this.n = 3;
            objH = uy0.h(rq3Var, j3, sg2Var2, this);
            if (objH != hq0Var) {
                l43Var2 = l43Var;
                if (((Boolean) objH).booleanValue()) {
                    cz0Var = new ez0(dz0Var);
                } else {
                    cz0Var = new cz0(dz0Var);
                }
                n23Var2.o.invoke(Boolean.valueOf(l43Var2.c));
                ?? r110 = obj2;
                py.F(gq0Var, r110, r110, new q8(iy2Var, l43Var2, cz0Var, (so0) r110, 29), 3);
                return w84.a;
            }
        }
        return hq0Var;
    }
}
