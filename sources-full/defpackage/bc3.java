package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bc3 implements ck2 {
    public final oc3 c;
    public boolean d;

    public bc3(oc3 oc3Var, boolean z) {
        this.c = oc3Var;
        this.d = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ck2
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public final Object mo111x5577af55(long j, long j2, so0 so0Var) throws Throwable {
        ac3 ac3Var;
        long jD;
        long j3;
        if (so0Var instanceof ac3) {
            ac3Var = (ac3) so0Var;
            int i = ac3Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ac3Var.l = i - Integer.MIN_VALUE;
            } else {
                ac3Var = new ac3(this, (uo0) so0Var);
            }
        } else {
            ac3Var = new ac3(this, (uo0) so0Var);
        }
        Object objB = ac3Var.d;
        int i2 = ac3Var.l;
        if (i2 != 0) {
            if (i2 == 1) {
                j2 = ac3Var.c;
                g13.O(objB);
                j3 = ((dc4) objB).a;
            } else {
                if (i2 != 2) {
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = ac3Var.c;
                g13.O(objB);
                j3 = ((dc4) objB).a;
            }
            jD = dc4.d(j2, j3);
        } else {
            g13.O(objB);
            jD = 0;
            if (this.d) {
                oc3 oc3Var = this.c;
                if (oc3Var.h) {
                    j3 = 0;
                } else {
                    ac3Var.c = j2;
                    ac3Var.l = 1;
                    objB = oc3Var.b(j2, ac3Var);
                    hq0 hq0Var = hq0.c;
                    if (objB == hq0Var) {
                        return hq0Var;
                    }
                    j3 = ((dc4) objB).a;
                }
                jD = dc4.d(j2, j3);
            }
        }
        return new dc4(jD);
    }

    @Override // defpackage.ck2
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo112x75b18a1d(long j, long j2, int i) {
        if (!this.d) {
            return 0L;
        }
        oc3 oc3Var = this.c;
        if (oc3Var.a.b()) {
            return 0L;
        }
        return oc3Var.h(oc3Var.d(oc3Var.a.e(oc3Var.d(oc3Var.g(j2)))));
    }
}
