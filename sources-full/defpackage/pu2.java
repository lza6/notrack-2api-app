package defpackage;

import androidx.compose.ui.platform.InspectableValue;

/* JADX INFO: loaded from: classes.dex */
public final class pu2 implements up0, InspectableValue {
    public final float c;

    public pu2(float f) {
        this.c = f;
        if (f < 0.0f || f > 100.0f) {
            so1.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.up0
    public final float a(long j, wu0 wu0Var) {
        return (this.c / 100.0f) * bi3.c(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pu2) && Float.compare(this.c, ((pu2) obj).c) == 0;
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public final Object getValueOverride() {
        return fq2.o(new StringBuilder(), this.c, '%');
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return "CornerSize(size = " + this.c + "%)";
    }
}
