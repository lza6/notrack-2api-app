package androidx.compose.ui.platform;

import android.graphics.Rect;
import defpackage.ze3;

/* JADX INFO: loaded from: classes.dex */
public final class SemanticsNodeWithAdjustedBounds {
    public static final int $stable = 8;
    private final Rect adjustedBounds;
    private final ze3 semanticsNode;

    public SemanticsNodeWithAdjustedBounds(ze3 ze3Var, Rect rect) {
        this.semanticsNode = ze3Var;
        this.adjustedBounds = rect;
    }

    public final Rect getAdjustedBounds() {
        return this.adjustedBounds;
    }

    public final ze3 getSemanticsNode() {
        return this.semanticsNode;
    }
}
