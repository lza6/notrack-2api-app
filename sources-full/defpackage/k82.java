package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k82 implements wb2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ le1 d;
    public final /* synthetic */ m82 e;

    public k82(int i, int i2, Map map, le1 le1Var, m82 m82Var) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = le1Var;
        this.e = m82Var;
    }

    @Override // defpackage.wb2
    public final Map a() {
        return this.c;
    }

    @Override // defpackage.wb2
    public final void b() {
        this.d.invoke(this.e.q);
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
