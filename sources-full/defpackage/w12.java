package defpackage;

import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class w12 implements u02 {
    public final r12 a;
    public final s02 b;
    public final long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ s02 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ y7 h;
    public final /* synthetic */ z7 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ long m;
    public final /* synthetic */ g22 n;

    public w12(long j, boolean z, r12 r12Var, s02 s02Var, int i, int i2, y7 y7Var, z7 z7Var, boolean z2, int i3, int i4, long j2, g22 g22Var) {
        this.d = z;
        this.e = s02Var;
        this.f = i;
        this.g = i2;
        this.h = y7Var;
        this.i = z7Var;
        this.j = z2;
        this.k = i3;
        this.l = i4;
        this.m = j2;
        this.n = g22Var;
        this.a = r12Var;
        this.b = s02Var;
        this.c = wm0.b(z ? um0.h(j) : Integer.MAX_VALUE, z ? IntCompanionObject.MAX_VALUE : um0.g(j), 5);
    }

    public final a22 a(long j, int i) {
        t12 t12Var = (t12) this.a;
        Object objB = t12Var.b(i);
        Object objJ = t12Var.b.J(i);
        return new a22(i, this.b.a(j, i), this.d, this.h, this.i, this.e.d.getLayoutDirection(), this.j, this.k, this.l, i == this.f + (-1) ? 0 : this.g, this.m, objB, objJ, this.n.m, j);
    }
}
