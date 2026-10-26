package defpackage;

import app.template.extension.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class ou0 implements n11 {
    @Override // defpackage.n11
    public final void a(o11 o11Var) {
        o11Var.d(0, o11Var.a.g(), BuildConfig.VERSION_NAME);
    }

    public final boolean equals(Object obj) {
        return obj instanceof ou0;
    }

    public final int hashCode() {
        return r43.a(ou0.class).hashCode();
    }

    public final String toString() {
        return "DeleteAllCommand()";
    }
}
