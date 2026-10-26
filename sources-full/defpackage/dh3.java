package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dh3 implements ck2 {
    public final /* synthetic */ hh3 c;
    public final /* synthetic */ le1 d;

    public dh3(hh3 hh3Var, le1 le1Var) {
        this.c = hh3Var;
        this.d = le1Var;
    }

    @Override // defpackage.ck2
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public final Object mo111x5577af55(long j, long j2, so0 so0Var) {
        this.d.invoke(new Float(dc4.c(j2)));
        return new dc4(j2);
    }

    @Override // defpackage.ck2
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo112x75b18a1d(long j, long j2, int i) {
        if (i != 1) {
            return 0L;
        }
        ji4 ji4Var = this.c.c;
        float fO = ji4Var.o(ln2.g(j2));
        bt2 bt2Var = (bt2) ji4Var.j;
        float f = Float.isNaN(bt2Var.f()) ? 0.0f : bt2Var.f();
        bt2Var.h(fO);
        return y64.b(0.0f, fO - f);
    }

    @Override // defpackage.ck2
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public final Object mo113x43e5835a(long j, so0 so0Var) {
        float fC = dc4.c(j);
        hh3 hh3Var = this.c;
        float fP = hh3Var.c.p();
        float fC2 = hh3Var.c.f().c();
        if (fC >= 0.0f || fP <= fC2) {
            j = 0;
        } else {
            this.d.invoke(new Float(fC));
        }
        return new dc4(j);
    }

    @Override // defpackage.ck2
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final long mo114x38849c55(long j, int i) {
        float fG = ln2.g(j);
        if (fG >= 0.0f || i != 1) {
            return 0L;
        }
        ji4 ji4Var = this.c.c;
        float fO = ji4Var.o(fG);
        bt2 bt2Var = (bt2) ji4Var.j;
        float f = Float.isNaN(bt2Var.f()) ? 0.0f : bt2Var.f();
        bt2Var.h(fO);
        return y64.b(0.0f, fO - f);
    }
}
