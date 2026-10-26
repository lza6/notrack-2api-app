package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.c;
import defpackage.a8;
import defpackage.le1;
import defpackage.ms2;
import defpackage.sn0;
import defpackage.te0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final c a(c cVar, le1 le1Var) {
        return cVar.then(new DrawBehindElement(le1Var));
    }

    public static final c b(c cVar, le1 le1Var) {
        return cVar.then(new DrawWithCacheElement(le1Var));
    }

    public static final c c(c cVar, le1 le1Var) {
        return cVar.then(new DrawWithContentElement(le1Var));
    }

    public static c d(c cVar, ms2 ms2Var, a8 a8Var, sn0 sn0Var, float f, te0 te0Var, int i) {
        if ((i & 4) != 0) {
            a8Var = Alignment$Companion.getCenter();
        }
        a8 a8Var2 = a8Var;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        return cVar.then(new PainterElement(ms2Var, a8Var2, sn0Var, f, te0Var));
    }
}
