package defpackage;

import androidx.compose.runtime.Composer$Companion;
import kotlin.uuid.Uuid;
import okhttp3.Protocol$Companion;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class x02 {
    public static final void LazyLayoutPinnableItem(Object obj, int i, y02 y02Var, ne1 ne1Var, ck0 ck0Var, int i2) {
        int i3;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-2079116560);
        if ((i2 & 6) == 0) {
            i3 = (kk0Var.j(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= kk0Var.f(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= kk0Var.j(y02Var) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= kk0Var.j(ne1Var) ? 2048 : 1024;
        }
        if (kk0Var.S(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zH = kk0Var.h(obj) | kk0Var.h(y02Var);
            Object objP = kk0Var.P();
            if (zH || objP == Composer$Companion.getEmpty()) {
                objP = new w02(obj, y02Var);
                kk0Var.l0(objP);
            }
            w02 w02Var = (w02) objP;
            w02Var.c = i;
            ft2 ft2Var = w02Var.g;
            dl0 dl0Var = kv2.a;
            w02 w02Var2 = (w02) kk0Var.l(dl0Var);
            pk3 currentThreadSnapshot = Protocol$Companion.getCurrentThreadSnapshot();
            le1 le1VarE = currentThreadSnapshot != null ? currentThreadSnapshot.e() : null;
            pk3 pk3VarMakeCurrentNonObservable = Protocol$Companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                if (w02Var2 != ((w02) ft2Var.getValue())) {
                    ft2Var.setValue(w02Var2);
                    if (w02Var.d > 0) {
                        w02 w02Var3 = w02Var.e;
                        if (w02Var3 != null) {
                            w02Var3.b();
                        }
                        if (w02Var2 != null) {
                            w02Var2.a();
                        } else {
                            w02Var2 = null;
                        }
                        w02Var.e = w02Var2;
                    }
                }
                Protocol$Companion.restoreNonObservable(currentThreadSnapshot, pk3VarMakeCurrentNonObservable, le1VarE);
                boolean zH2 = kk0Var.h(w02Var);
                Object objP2 = kk0Var.P();
                if (zH2 || objP2 == Composer$Companion.getEmpty()) {
                    objP2 = new e8(22, w02Var);
                    kk0Var.l0(objP2);
                }
                r11.DisposableEffect(w02Var, (le1) objP2, kk0Var, 0);
                yk0.CompositionLocalProvider(dl0Var.c(w02Var), ne1Var, kk0Var, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                Protocol$Companion.restoreNonObservable(currentThreadSnapshot, pk3VarMakeCurrentNonObservable, le1VarE);
                throw th;
            }
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ra(obj, i, y02Var, ne1Var, i2));
        }
    }
}
