package androidx.compose.ui.platform;

import defpackage.fb3;
import defpackage.zr2;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollObservationScope implements zr2 {
    public static final int $stable = 8;
    private final List<ScrollObservationScope> allScopes;
    private fb3 horizontalScrollAxisRange;
    private Float oldXValue;
    private Float oldYValue;
    private final int semanticsNodeId;
    private fb3 verticalScrollAxisRange;

    public ScrollObservationScope(int i, List<ScrollObservationScope> list, Float f, Float f2, fb3 fb3Var, fb3 fb3Var2) {
        this.semanticsNodeId = i;
        this.allScopes = list;
        this.oldXValue = f;
        this.oldYValue = f2;
        this.horizontalScrollAxisRange = fb3Var;
        this.verticalScrollAxisRange = fb3Var2;
    }

    public final List<ScrollObservationScope> getAllScopes() {
        return this.allScopes;
    }

    public final fb3 getHorizontalScrollAxisRange() {
        return this.horizontalScrollAxisRange;
    }

    public final Float getOldXValue() {
        return this.oldXValue;
    }

    public final Float getOldYValue() {
        return this.oldYValue;
    }

    public final int getSemanticsNodeId() {
        return this.semanticsNodeId;
    }

    public final fb3 getVerticalScrollAxisRange() {
        return this.verticalScrollAxisRange;
    }

    @Override // defpackage.zr2
    public boolean isValidOwnerScope() {
        return this.allScopes.contains(this);
    }

    public final void setHorizontalScrollAxisRange(fb3 fb3Var) {
        this.horizontalScrollAxisRange = fb3Var;
    }

    public final void setOldXValue(Float f) {
        this.oldXValue = f;
    }

    public final void setOldYValue(Float f) {
        this.oldYValue = f;
    }

    public final void setVerticalScrollAxisRange(fb3 fb3Var) {
        this.verticalScrollAxisRange = fb3Var;
    }
}
