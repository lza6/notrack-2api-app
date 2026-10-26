package defpackage;

import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class p02 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SkippableItem-JVlU9Rs, reason: not valid java name */
    public static final void m1799x1e2afaf6(q02 q02Var, Object obj, int i, Object obj2, ck0 ck0Var, int i2) {
        int i3;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1439843069);
        if ((i2 & 6) == 0) {
            i3 = (kk0Var.h(q02Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= kk0Var.h(obj) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= kk0Var.f(i) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= kk0Var.h(obj2) ? 2048 : 1024;
        }
        if (kk0Var.S(i3 & 1, (i3 & 1171) != 1170)) {
            ((b93) obj).SaveableStateProvider(obj2, zg0.rememberComposableLambda(980966366, true, new o02(i, q02Var, obj2), kk0Var, 54), kk0Var, 48);
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ra(q02Var, obj, i, obj2, i2));
        }
    }
}
