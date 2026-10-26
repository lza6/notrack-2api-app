package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hb4 extends ww1 implements ne1 {
    public final /* synthetic */ String c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float h;
    public final /* synthetic */ float l;
    public final /* synthetic */ float m;
    public final /* synthetic */ float n;
    public final /* synthetic */ float o;
    public final /* synthetic */ float p;
    public final /* synthetic */ List q;
    public final /* synthetic */ ne1 r;
    public final /* synthetic */ int s;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb4(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ne1 ne1Var, int i, int i2) {
        super(2);
        this.c = str;
        this.d = f;
        this.h = f2;
        this.l = f3;
        this.m = f4;
        this.n = f5;
        this.o = f6;
        this.p = f7;
        this.q = list;
        this.r = ne1Var;
        this.s = i;
        this.t = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        jb4.Group(this.c, this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r, (ck0) obj, sf3.V(this.s | 1), this.t);
        return w84.a;
    }
}
