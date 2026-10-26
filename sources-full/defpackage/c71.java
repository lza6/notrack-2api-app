package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c71 extends of2 implements lx1 {
    public fw0 c;
    public float d;

    @Override // defpackage.lx1
    public final wb2 d(xb2 xb2Var, qb2 qb2Var, long j) {
        int iJ;
        int iH;
        int iG;
        int i;
        if (!um0.d(j) || this.c == fw0.c) {
            iJ = um0.j(j);
            iH = um0.h(j);
        } else {
            int iRound = Math.round(um0.h(j) * this.d);
            int iJ2 = um0.j(j);
            iJ = um0.h(j);
            if (iRound < iJ2) {
                iRound = iJ2;
            }
            if (iRound <= iJ) {
                iJ = iRound;
            }
            iH = iJ;
        }
        if (!um0.c(j) || this.c == fw0.d) {
            int i2 = um0.i(j);
            int iG2 = um0.g(j);
            iG = i2;
            i = iG2;
        } else {
            int iRound2 = Math.round(um0.g(j) * this.d);
            int i3 = um0.i(j);
            iG = um0.g(j);
            if (iRound2 < i3) {
                iRound2 = i3;
            }
            if (iRound2 <= iG) {
                iG = iRound2;
            }
            i = iG;
        }
        nv2 nv2VarC = qb2Var.c(wm0.a(iJ, iH, iG, i));
        return xb2Var.s(nv2VarC.c, nv2VarC.d, a31.c, new xc(nv2VarC, 7));
    }
}
