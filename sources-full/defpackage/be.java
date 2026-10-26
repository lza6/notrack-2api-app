package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class be extends TextPaint {
    public bc a;
    public tt3 b;
    public int c;
    public pg3 d;
    public re0 e;
    public yx f;
    public fv0 g;
    public bi3 h;
    public uz0 i;

    public final ks2 a() {
        bc bcVar = this.a;
        if (bcVar != null) {
            return bcVar;
        }
        bc bcVar2 = new bc(this);
        this.a = bcVar2;
        return bcVar2;
    }

    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        ((bc) a()).e(i);
        this.c = i;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    public final void c(yx yxVar, long j, float f) {
        if (yxVar == null) {
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
            return;
        }
        if (yxVar instanceof vl3) {
            d(p23.J(f, ((vl3) yxVar).a));
            return;
        }
        if (yxVar instanceof ng3) {
            int i = 0;
            if (kr1.n(this.f, yxVar)) {
                bi3 bi3Var = this.h;
                if (!(bi3Var == null ? false : bi3.a(bi3Var.a, j))) {
                    if (j != 9205357640488583168L) {
                        this.f = yxVar;
                        this.h = new bi3(j);
                        this.g = cl3.b(new ae(i, j, yxVar));
                    }
                }
            } else if (j != 9205357640488583168L) {
                this.f = yxVar;
                this.h = new bi3(j);
                this.g = cl3.b(new ae(i, j, yxVar));
            }
            ks2 ks2VarA = a();
            fv0 fv0Var = this.g;
            ((bc) ks2VarA).i(fv0Var != null ? (Shader) fv0Var.getValue() : null);
            this.e = null;
            jr1.J(this, f);
        }
    }

    public final void d(long j) {
        re0 re0Var = this.e;
        if ((re0Var == null ? false : re0.c(re0Var.a, j)) || j == 16) {
            return;
        }
        this.e = new re0(j);
        setColor(gb2.X(j));
        this.g = null;
        this.f = null;
        this.h = null;
        setShader(null);
    }

    public final void e(uz0 uz0Var) {
        if (uz0Var == null || kr1.n(this.i, uz0Var)) {
            return;
        }
        this.i = uz0Var;
        if (uz0Var.equals(b71.a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (uz0Var instanceof vo3) {
            ((bc) a()).m(1);
            vo3 vo3Var = (vo3) uz0Var;
            ((bc) a()).l(vo3Var.a);
            ks2 ks2VarA = a();
            ((Paint) ((bc) ks2VarA).d).setStrokeMiter(vo3Var.b);
            ((bc) a()).k(vo3Var.d);
            ((bc) a()).j(vo3Var.c);
            ((Paint) ((bc) a()).d).setPathEffect(null);
        }
    }

    public final void f(pg3 pg3Var) {
        if (pg3Var == null || kr1.n(this.d, pg3Var)) {
            return;
        }
        this.d = pg3Var;
        if (pg3Var.equals(pg3.d)) {
            clearShadowLayer();
            return;
        }
        pg3 pg3Var2 = this.d;
        float f = pg3Var2.c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (pg3Var2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), gb2.X(this.d.a));
    }

    public final void g(tt3 tt3Var) {
        if (tt3Var == null || kr1.n(this.b, tt3Var)) {
            return;
        }
        this.b = tt3Var;
        int i = tt3Var.a;
        setUnderlineText((i | 1) == i);
        int i2 = this.b.a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
