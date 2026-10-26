package defpackage;

import androidx.compose.runtime.Composer$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class uh3 {
    public static final tm3 a = kr1.l0(7, null);

    @cv0
    /* JADX INFO: renamed from: animateColorAsState-KTwxG1Y, reason: not valid java name */
    public static final /* synthetic */ gn3 m1817x431628d5(long j, wf wfVar, le1 le1Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            wfVar = a;
        }
        wf wfVar2 = wfVar;
        if ((i2 & 4) != 0) {
            le1Var = null;
        }
        return m1818xd84e23a5(j, wfVar2, null, le1Var, ck0Var, (i & 126) | ((i << 3) & 7168), 4);
    }

    /* JADX INFO: renamed from: animateColorAsState-euL9pac, reason: not valid java name */
    public static final gn3 m1818xd84e23a5(long j, wf wfVar, String str, le1 le1Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            wfVar = a;
        }
        wf wfVar2 = wfVar;
        if ((i2 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            le1Var = null;
        }
        le1 le1Var2 = le1Var;
        kk0 kk0Var = (kk0) ck0Var;
        boolean zH = kk0Var.h(re0.f(j));
        Object objP = kk0Var.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            bf0 bf0VarF = re0.f(j);
            sx sxVar = sx.n;
            e8 e8Var = new e8(10, bf0VarF);
            x64 x64Var = mb4.a;
            x64 x64Var2 = new x64(sxVar, e8Var);
            kk0Var.l0(x64Var2);
            objP = x64Var2;
        }
        int i3 = i << 6;
        return we.animateValueAsState(new re0(j), (w64) objP, wfVar2, null, str2, le1Var2, kk0Var, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
    }
}
