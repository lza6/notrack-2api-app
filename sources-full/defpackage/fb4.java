package defpackage;

import android.graphics.Bitmap;
import app.template.extension.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class fb4 extends wa4 {
    public final ug1 b;
    public String c;
    public boolean d;
    public final pz0 e;
    public je1 f;
    public final ft2 g;
    public jv h;
    public final ft2 i;
    public long j;
    public float k;
    public float l;
    public final eb4 m;

    public fb4(ug1 ug1Var) {
        this.b = ug1Var;
        ug1Var.i = new eb4(this, 0);
        this.c = BuildConfig.VERSION_NAME;
        this.d = true;
        this.e = new pz0();
        this.f = bb2.H;
        this.g = cl3.d(null);
        this.i = cl3.d(new bi3(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new eb4(this, 1);
    }

    @Override // defpackage.wa4
    public final void a(tz0 tz0Var) {
        e(tz0Var, 1.0f, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ff  */
    public final void e(tz0 tz0Var, float f, te0 te0Var) {
        int i;
        jv jvVar;
        ib ibVarB;
        char c;
        long j;
        te0 te0Var2;
        int i2;
        int i3;
        ug1 ug1Var = this.b;
        boolean z = ug1Var.d;
        ft2 ft2Var = this.g;
        if (!z || ug1Var.e == 16) {
            i = 0;
        } else {
            te0 te0Var3 = (te0) ft2Var.getValue();
            int i4 = pb4.a;
            if (!(te0Var3 instanceof jv) ? te0Var3 == null : (i3 = ((jv) te0Var3).c) == 5 || i3 == 3) {
                i = 0;
            } else if (!(te0Var instanceof jv) ? te0Var == null : (i2 = ((jv) te0Var).c) == 5 || i2 == 3) {
                i = 0;
            } else {
                i = 1;
            }
        }
        boolean z2 = this.d;
        pz0 pz0Var = this.e;
        if (z2 || !bi3.a(this.j, tz0Var.b())) {
            if (i == 1) {
                jvVar = new jv(ug1Var.e, 5);
            } else {
                jvVar = null;
            }
            this.h = jvVar;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (tz0Var.b() >> 32));
            ft2 ft2Var2 = this.i;
            this.k = fIntBitsToFloat / Float.intBitsToFloat((int) (((bi3) ft2Var2.getValue()).a >> 32));
            this.l = Float.intBitsToFloat((int) (tz0Var.b() & 4294967295L)) / Float.intBitsToFloat((int) (((bi3) ft2Var2.getValue()).a & 4294967295L));
            long jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (tz0Var.b() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (tz0Var.b() & 4294967295L))))) & 4294967295L);
            dx1 layoutDirection = tz0Var.getLayoutDirection();
            ibVarB = pz0Var.a;
            o9 o9VarA = pz0Var.b;
            if (ibVarB != null || o9VarA == null) {
                c = ' ';
                j = 4294967295L;
            } else {
                int i5 = (int) (jCeil >> 32);
                Bitmap bitmap = ibVarB.b;
                c = ' ';
                j = 4294967295L;
                if (i5 > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || pz0Var.d != i) {
                }
                pz0Var.c = jCeil;
                a10 a10Var = pz0Var.e;
                long jW = y64.W(jCeil);
                z00 z00Var = a10Var.c;
                wu0 wu0Var = z00Var.a;
                dx1 dx1Var = z00Var.b;
                y00 y00Var = z00Var.c;
                o9 o9Var = o9VarA;
                long j2 = z00Var.d;
                z00Var.a = tz0Var;
                z00Var.b = layoutDirection;
                z00Var.c = o9Var;
                z00Var.d = jW;
                o9Var.l();
                tz0.f(a10Var, re0.b, 0L, 0L, 0.0f, null, 62);
                this.m.invoke(a10Var);
                o9Var.i();
                z00 z00Var2 = a10Var.c;
                z00Var2.a = wu0Var;
                z00Var2.b = dx1Var;
                z00Var2.c = y00Var;
                z00Var2.d = j2;
                ibVarB.b.prepareToDraw();
                this.d = false;
                this.j = tz0Var.b();
            }
            ibVarB = sf3.b((int) (jCeil >> c), (int) (jCeil & j), i);
            o9VarA = g13.a(ibVarB);
            pz0Var.a = ibVarB;
            pz0Var.b = o9VarA;
            pz0Var.d = i;
            pz0Var.c = jCeil;
            a10 a10Var2 = pz0Var.e;
            long jW2 = y64.W(jCeil);
            z00 z00Var3 = a10Var2.c;
            wu0 wu0Var2 = z00Var3.a;
            dx1 dx1Var2 = z00Var3.b;
            y00 y00Var2 = z00Var3.c;
            o9 o9Var2 = o9VarA;
            long j3 = z00Var3.d;
            z00Var3.a = tz0Var;
            z00Var3.b = layoutDirection;
            z00Var3.c = o9Var2;
            z00Var3.d = jW2;
            o9Var2.l();
            tz0.f(a10Var2, re0.b, 0L, 0L, 0.0f, null, 62);
            this.m.invoke(a10Var2);
            o9Var2.i();
            z00 z00Var4 = a10Var2.c;
            z00Var4.a = wu0Var2;
            z00Var4.b = dx1Var2;
            z00Var4.c = y00Var2;
            z00Var4.d = j3;
            ibVarB.b.prepareToDraw();
            this.d = false;
            this.j = tz0Var.b();
        } else {
            ib ibVar = pz0Var.a;
            if (i != (ibVar != null ? ibVar.a() : 0)) {
                if (i == 1) {
                    jvVar = new jv(ug1Var.e, 5);
                } else {
                    jvVar = null;
                }
                this.h = jvVar;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tz0Var.b() >> 32));
                ft2 ft2Var3 = this.i;
                this.k = fIntBitsToFloat2 / Float.intBitsToFloat((int) (((bi3) ft2Var3.getValue()).a >> 32));
                this.l = Float.intBitsToFloat((int) (tz0Var.b() & 4294967295L)) / Float.intBitsToFloat((int) (((bi3) ft2Var3.getValue()).a & 4294967295L));
                long jCeil2 = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (tz0Var.b() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (tz0Var.b() & 4294967295L))))) & 4294967295L);
                dx1 layoutDirection2 = tz0Var.getLayoutDirection();
                ibVarB = pz0Var.a;
                o9 o9VarA2 = pz0Var.b;
                if (ibVarB != null) {
                    c = ' ';
                    j = 4294967295L;
                    ibVarB = sf3.b((int) (jCeil2 >> c), (int) (jCeil2 & j), i);
                    o9VarA2 = g13.a(ibVarB);
                    pz0Var.a = ibVarB;
                    pz0Var.b = o9VarA2;
                    pz0Var.d = i;
                } else {
                    c = ' ';
                    j = 4294967295L;
                    ibVarB = sf3.b((int) (jCeil2 >> c), (int) (jCeil2 & j), i);
                    o9VarA2 = g13.a(ibVarB);
                    pz0Var.a = ibVarB;
                    pz0Var.b = o9VarA2;
                    pz0Var.d = i;
                }
                pz0Var.c = jCeil2;
                a10 a10Var3 = pz0Var.e;
                long jW3 = y64.W(jCeil2);
                z00 z00Var5 = a10Var3.c;
                wu0 wu0Var3 = z00Var5.a;
                dx1 dx1Var3 = z00Var5.b;
                y00 y00Var3 = z00Var5.c;
                o9 o9Var3 = o9VarA2;
                long j4 = z00Var5.d;
                z00Var5.a = tz0Var;
                z00Var5.b = layoutDirection2;
                z00Var5.c = o9Var3;
                z00Var5.d = jW3;
                o9Var3.l();
                tz0.f(a10Var3, re0.b, 0L, 0L, 0.0f, null, 62);
                this.m.invoke(a10Var3);
                o9Var3.i();
                z00 z00Var6 = a10Var3.c;
                z00Var6.a = wu0Var3;
                z00Var6.b = dx1Var3;
                z00Var6.c = y00Var3;
                z00Var6.d = j4;
                ibVarB.b.prepareToDraw();
                this.d = false;
                this.j = tz0Var.b();
            }
        }
        if (te0Var != null) {
            te0Var2 = te0Var;
        } else {
            te0Var2 = ((te0) ft2Var.getValue()) != null ? (te0) ft2Var.getValue() : this.h;
        }
        ib ibVar2 = pz0Var.a;
        if (ibVar2 == null) {
            po1.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        tz0.d0(tz0Var, ibVar2, pz0Var.c, 0L, 0L, f, te0Var2, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        ft2 ft2Var = this.i;
        sb.append(Float.intBitsToFloat((int) (((bi3) ft2Var.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((bi3) ft2Var.getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
