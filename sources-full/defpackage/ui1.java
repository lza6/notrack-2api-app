package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ui1 {
    public int a;
    public float b;
    public final Object c;

    public ui1(int i, yj0 yj0Var) {
        this.a = i;
        this.c = yj0Var;
    }

    public ui1(vy3 vy3Var) {
        this.c = vy3Var;
        this.a = -1;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public float a(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        vy3 vy3Var = (vy3) this.c;
        int i2 = 1;
        if (z) {
            int iA = p23.A(vy3Var.f, i, z);
            int lineStart = vy3Var.f.getLineStart(iA);
            int iF = vy3Var.f(iA);
            if (i == lineStart || i == iF) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        int i3 = i * 4;
        if (!z3) {
            i2 = z4 ? 2 : 3;
        } else if (z4) {
            i2 = 0;
        }
        int i4 = i3 + i2;
        if (this.a == i4) {
            return this.b;
        }
        float fH = z3 ? vy3Var.h(i, z) : vy3Var.i(i, z);
        if (z2) {
            this.a = i4;
            this.b = fH;
        }
        return fH;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(float f, uo0 uo0Var) throws Throwable {
        y43 y43Var;
        if (uo0Var instanceof y43) {
            y43Var = (y43) uo0Var;
            int i = y43Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                y43Var.l = i - Integer.MIN_VALUE;
            } else {
                y43Var = new y43(this, uo0Var);
            }
        } else {
            y43Var = new y43(this, uo0Var);
        }
        Object objInvoke = y43Var.d;
        int i2 = y43Var.l;
        if (i2 == 0) {
            g13.O(objInvoke);
            yj0 yj0Var = (yj0) this.c;
            Float f2 = new Float(f);
            y43Var.c = this;
            y43Var.l = 1;
            objInvoke = yj0Var.invoke(f2, y43Var);
            hq0 hq0Var = hq0.c;
            if (objInvoke == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = y43Var.c;
            g13.O(objInvoke);
        }
        this.b += ((Number) objInvoke).floatValue();
        return w84.a;
    }
}
