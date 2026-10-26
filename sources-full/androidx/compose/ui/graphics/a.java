package androidx.compose.ui.graphics;

import androidx.compose.ui.c;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.e54;
import defpackage.ig1;
import defpackage.k43;
import defpackage.le1;
import defpackage.rg3;
import kotlin.io.ConstantsKt;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final c a(c cVar, le1 le1Var) {
        return cVar.then(new BlockGraphicsLayerElement(le1Var));
    }

    public static c b(c cVar, float f, float f2, float f3, rg3 rg3Var, boolean z, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f4 = f;
        float f5 = (i & 32) != 0 ? 0.0f : f2;
        float f6 = (i & FontInfo.NUMBER_OF_CHAR_CODES) != 0 ? 0.0f : f3;
        long j = e54.b;
        rg3 rg3Var2 = (i & 2048) != 0 ? k43.a : rg3Var;
        boolean z2 = (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? false : z;
        long j2 = ig1.a;
        return cVar.then(new GraphicsLayerElement(f4, f5, f6, j, rg3Var2, z2, j2, j2));
    }

    public static final c c(c cVar) {
        return InspectableValueKt.isDebugInspectorInfoEnabled() ? cVar.then(b(c.i, 0.0f, 0.0f, 0.0f, null, false, 131071)) : cVar;
    }
}
