package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class nb0 extends ww1 implements ne1 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ e14 d;
    public final /* synthetic */ c h;
    public final /* synthetic */ jb0 l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb0(boolean z, e14 e14Var, c cVar, jb0 jb0Var, int i) {
        super(2);
        this.c = z;
        this.d = e14Var;
        this.h = cVar;
        this.l = jb0Var;
        this.m = i;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        qb0.CheckboxImpl(this.c, this.d, this.h, this.l, (ck0) obj, sf3.V(this.m | 1));
        return w84.a;
    }
}
