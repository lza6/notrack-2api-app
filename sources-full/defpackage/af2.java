package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class af2 extends ww1 implements le1 {
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;
    public final /* synthetic */ hh3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af2(float f, long j, hh3 hh3Var) {
        super(1);
        this.c = f;
        this.d = j;
        this.h = hh3Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        gz0 gz0Var = (gz0) obj;
        ih3 ih3Var = ih3.c;
        float f = this.c;
        gz0Var.a(ih3Var, f);
        int i = (int) (this.d & 4294967295L);
        float f2 = i;
        float f3 = f / 2.0f;
        if (f2 > f3 && !this.h.a) {
            gz0Var.a(ih3.h, f3);
        }
        if (i != 0) {
            gz0Var.a(ih3.d, Math.max(0.0f, f - f2));
        }
        return w84.a;
    }
}
