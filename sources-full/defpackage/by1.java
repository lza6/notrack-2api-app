package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class by1 implements wb2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ cy1 d;
    public final /* synthetic */ iy1 e;
    public final /* synthetic */ le1 f;

    public by1(int i, int i2, Map map, cy1 cy1Var, iy1 iy1Var, le1 le1Var) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = cy1Var;
        this.e = iy1Var;
        this.f = le1Var;
    }

    @Override // defpackage.wb2
    public final Map a() {
        return this.c;
    }

    @Override // defpackage.wb2
    public final void b() {
        wo1 wo1Var;
        ux1 ux1Var = this.e.c;
        boolean zR = this.d.r();
        le1 le1Var = this.f;
        if (!zR || (wo1Var = ((xo1) ux1Var.N.c).U) == null) {
            le1Var.invoke(((xo1) ux1Var.N.c).q);
        } else {
            le1Var.invoke(wo1Var.q);
        }
    }

    @Override // defpackage.wb2
    public final le1 c() {
        return null;
    }

    @Override // defpackage.wb2
    public final int getHeight() {
        return this.b;
    }

    @Override // defpackage.wb2
    public final int getWidth() {
        return this.a;
    }
}
