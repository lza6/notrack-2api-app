package defpackage;

import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public final class m74 {
    public final uz3 a;
    public final uz3 b;
    public final uz3 c;
    public final uz3 d;
    public final uz3 e;
    public final uz3 f;
    public final uz3 g;
    public final uz3 h;
    public final uz3 i;
    public final uz3 j;
    public final uz3 k;
    public final uz3 l;
    public final uz3 m;
    public final uz3 n;
    public final uz3 o;

    public m74(uz3 uz3Var, uz3 uz3Var2, uz3 uz3Var3, uz3 uz3Var4, uz3 uz3Var5, uz3 uz3Var6, uz3 uz3Var7, uz3 uz3Var8, uz3 uz3Var9, int i) {
        this(p74.d, p74.e, p74.f, p74.g, (i & 16) != 0 ? p74.h : uz3Var, p74.i, (i & 64) != 0 ? p74.m : uz3Var2, (i & Uuid.SIZE_BITS) != 0 ? p74.n : uz3Var3, p74.o, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? p74.a : uz3Var4, (i & 1024) != 0 ? p74.b : uz3Var5, (i & 2048) != 0 ? p74.c : uz3Var6, (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? p74.j : uz3Var7, (i & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? p74.k : uz3Var8, (i & 16384) != 0 ? p74.l : uz3Var9);
    }

    public m74(uz3 uz3Var, uz3 uz3Var2, uz3 uz3Var3, uz3 uz3Var4, uz3 uz3Var5, uz3 uz3Var6, uz3 uz3Var7, uz3 uz3Var8, uz3 uz3Var9, uz3 uz3Var10, uz3 uz3Var11, uz3 uz3Var12, uz3 uz3Var13, uz3 uz3Var14, uz3 uz3Var15) {
        this.a = uz3Var;
        this.b = uz3Var2;
        this.c = uz3Var3;
        this.d = uz3Var4;
        this.e = uz3Var5;
        this.f = uz3Var6;
        this.g = uz3Var7;
        this.h = uz3Var8;
        this.i = uz3Var9;
        this.j = uz3Var10;
        this.k = uz3Var11;
        this.l = uz3Var12;
        this.m = uz3Var13;
        this.n = uz3Var14;
        this.o = uz3Var15;
    }

    public final uz3 a() {
        return this.j;
    }

    public final uz3 b() {
        return this.k;
    }

    public final uz3 c() {
        return this.l;
    }

    public final uz3 d() {
        return this.n;
    }

    public final uz3 e() {
        return this.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m74)) {
            return false;
        }
        m74 m74Var = (m74) obj;
        return kr1.n(this.a, m74Var.a) && kr1.n(this.b, m74Var.b) && kr1.n(this.c, m74Var.c) && kr1.n(this.d, m74Var.d) && kr1.n(this.e, m74Var.e) && kr1.n(this.f, m74Var.f) && kr1.n(this.g, m74Var.g) && kr1.n(this.h, m74Var.h) && kr1.n(this.i, m74Var.i) && kr1.n(this.j, m74Var.j) && kr1.n(this.k, m74Var.k) && kr1.n(this.l, m74Var.l) && kr1.n(this.m, m74Var.m) && kr1.n(this.n, m74Var.n) && kr1.n(this.o, m74Var.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Typography(displayLarge=" + this.a + ", displayMedium=" + this.b + ",displaySmall=" + this.c + ", headlineLarge=" + this.d + ", headlineMedium=" + this.e + ", headlineSmall=" + this.f + ", titleLarge=" + this.g + ", titleMedium=" + this.h + ", titleSmall=" + this.i + ", bodyLarge=" + this.j + ", bodyMedium=" + this.k + ", bodySmall=" + this.l + ", labelLarge=" + this.m + ", labelMedium=" + this.n + ", labelSmall=" + this.o + ')';
    }
}
