package defpackage;

import androidx.compose.foundation.gestures.b;

/* JADX INFO: loaded from: classes.dex */
public final class oc3 {
    public gc3 a;
    public pr2 b;
    public w71 c;
    public nq2 d;
    public boolean e;
    public fk2 f;
    public final i43 g;
    public boolean h;
    public int i = 1;
    public pb3 j = b.a;
    public final mc3 k = new mc3(this);
    public final pj2 l = new pj2(12, this);

    public oc3(gc3 gc3Var, pr2 pr2Var, w71 w71Var, nq2 nq2Var, boolean z, fk2 fk2Var, i43 i43Var) {
        this.a = gc3Var;
        this.b = pr2Var;
        this.c = w71Var;
        this.d = nq2Var;
        this.e = z;
        this.f = fk2Var;
        this.g = i43Var;
    }

    public static final long a(oc3 oc3Var, pb3 pb3Var, long j, int i) {
        ik2 ik2Var = oc3Var.f.a;
        ik2 ik2Var2 = null;
        ik2 ik2Var3 = (ik2Var == null || !ik2Var.isAttached()) ? null : (ik2) gb2.E(ik2Var);
        long jMo114x38849c55 = ik2Var3 != null ? ik2Var3.mo114x38849c55(j, i) : 0L;
        long jH = ln2.h(j, jMo114x38849c55);
        long jE = oc3Var.e(oc3Var.h(pb3Var.a(oc3Var.g(oc3Var.e(ln2.a(0.0f, oc3Var.d == nq2.d ? 1 : 2, jH))))));
        long jH2 = ln2.h(jH, jE);
        ik2 ik2Var4 = oc3Var.f.a;
        if (ik2Var4 != null && ik2Var4.isAttached()) {
            ik2Var2 = (ik2) gb2.E(ik2Var4);
        }
        ik2 ik2Var5 = ik2Var2;
        return ln2.i(ln2.i(jMo114x38849c55, jE), ik2Var5 != null ? ik2Var5.mo112x75b18a1d(jE, jH2, i) : 0L);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, uo0 uo0Var) throws Throwable {
        kc3 kc3Var;
        p43 p43Var;
        oc3 oc3Var;
        if (uo0Var instanceof kc3) {
            kc3Var = (kc3) uo0Var;
            int i = kc3Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                kc3Var.m = i - Integer.MIN_VALUE;
            } else {
                kc3Var = new kc3(this, uo0Var);
            }
        } else {
            kc3Var = new kc3(this, uo0Var);
        }
        Object obj = kc3Var.h;
        int i2 = kc3Var.m;
        if (i2 == 0) {
            g13.O(obj);
            p43Var = new p43();
            p43Var.c = j;
            this.h = true;
            lc3 lc3Var = new lc3(this, p43Var, j, null);
            kc3Var.c = this;
            kc3Var.d = p43Var;
            kc3Var.m = 1;
            Object objF = f(ri2.c, lc3Var, kc3Var);
            hq0 hq0Var = hq0.c;
            if (objF == hq0Var) {
                return hq0Var;
            }
            oc3Var = this;
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p43 p43Var2 = kc3Var.d;
            oc3 oc3Var2 = kc3Var.c;
            g13.O(obj);
            p43Var = p43Var2;
            oc3Var = oc3Var2;
        }
        oc3Var.h = false;
        return new dc4(p43Var.c);
    }

    public final Object c(long j, boolean z, mq3 mq3Var) {
        w84 w84Var = w84.a;
        if (z) {
            return w84Var;
        }
        long jA = dc4.a(0.0f, 0.0f, this.d == nq2.d ? 1 : 2, j);
        nc3 nc3Var = new nc3(this, null);
        pr2 pr2Var = this.b;
        hq0 hq0Var = hq0.c;
        if (pr2Var == null || !(this.a.c() || this.a.a())) {
            nc3 nc3Var2 = new nc3(nc3Var.l, mq3Var);
            nc3Var2.h = jA;
            Object objInvokeSuspend = nc3Var2.invokeSuspend(w84Var);
            if (objInvokeSuspend == hq0Var) {
                return objInvokeSuspend;
            }
        } else {
            Object objC = pr2Var.c(jA, nc3Var, mq3Var);
            if (objC == hq0Var) {
                return objC;
            }
        }
        return w84Var;
    }

    public final float d(float f) {
        return this.e ? f * (-1.0f) : f;
    }

    public final long e(long j) {
        return this.e ? ln2.j(-1.0f, j) : j;
    }

    public final Object f(ri2 ri2Var, ne1 ne1Var, uo0 uo0Var) {
        Object objD = this.a.d(ri2Var, new q8((Object) this, ne1Var, (so0) null, 27), uo0Var);
        return objD == hq0.c ? objD : w84.a;
    }

    public final float g(long j) {
        return Float.intBitsToFloat((int) (this.d == nq2.d ? j >> 32 : j & 4294967295L));
    }

    public final long h(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.d == nq2.d) {
            return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }
}
