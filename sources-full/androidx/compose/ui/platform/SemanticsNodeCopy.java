package androidx.compose.ui.platform;

import defpackage.eh2;
import defpackage.gq1;
import defpackage.ue3;
import defpackage.ze3;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SemanticsNodeCopy {
    public static final int $stable = 8;
    private final eh2 children;
    private final ue3 unmergedConfig;

    public SemanticsNodeCopy(ze3 ze3Var, gq1 gq1Var) {
        this.unmergedConfig = ze3Var.d;
        this.children = new eh2(ze3.h(ze3Var, 4).size());
        List listH = ze3.h(ze3Var, 4);
        int size = listH.size();
        for (int i = 0; i < size; i++) {
            ze3 ze3Var2 = (ze3) listH.get(i);
            if (gq1Var.a(ze3Var2.g)) {
                this.children.a(ze3Var2.g);
            }
        }
    }

    public final eh2 getChildren() {
        return this.children;
    }

    public final ue3 getUnmergedConfig() {
        return this.unmergedConfig;
    }
}
