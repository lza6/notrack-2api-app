package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yv3 extends nn3 {
    public CharSequence c;
    public List d;
    public jz3 e;
    public uz3 f;
    public boolean g;
    public boolean h;
    public float i;
    public float j;
    public dx1 k;
    public kb1 l;
    public long m;
    public xy3 n;

    public yv3() {
        super(vk3.k().g());
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.m = wm0.b(0, 0, 15);
    }

    @Override // defpackage.nn3
    public final void a(nn3 nn3Var) {
        nn3Var.getClass();
        yv3 yv3Var = (yv3) nn3Var;
        this.c = yv3Var.c;
        this.d = yv3Var.d;
        this.e = yv3Var.e;
        this.f = yv3Var.f;
        this.g = yv3Var.g;
        this.h = yv3Var.h;
        this.i = yv3Var.i;
        this.j = yv3Var.j;
        this.k = yv3Var.k;
        this.l = yv3Var.l;
        this.m = yv3Var.m;
        this.n = yv3Var.n;
    }

    @Override // defpackage.nn3
    public final nn3 b() {
        return new yv3();
    }

    public final String toString() {
        return "CacheRecord(visualText=" + ((Object) this.c) + ", composingAnnotations=" + this.d + ", composition=" + this.e + ", textStyle=" + this.f + ", singleLine=" + this.g + ", softWrap=" + this.h + ", densityValue=" + this.i + ", fontScale=" + this.j + ", layoutDirection=" + this.k + ", fontFamilyResolver=" + this.l + ", constraints=" + ((Object) um0.l(this.m)) + ", layoutResult=" + this.n + ')';
    }
}
