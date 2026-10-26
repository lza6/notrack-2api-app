package defpackage;

import androidx.compose.ui.platform.InspectableValue;

/* JADX INFO: loaded from: classes.dex */
public final class sx0 implements up0, InspectableValue {
    public final float c;

    public sx0(float f) {
        this.c = f;
    }

    @Override // defpackage.up0
    public final float a(long j, wu0 wu0Var) {
        return wu0Var.w(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sx0) && rx0.a(this.c, ((sx0) obj).c);
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public final Object getValueOverride() {
        return new rx0(this.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return "CornerSize(size = " + this.c + ".dp)";
    }
}
