package defpackage;

import app.template.extension.BuildConfig;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class eq2 {
    public final int a;
    public final int b;

    public eq2(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public /* synthetic */ eq2(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public abstract void a(ce0 ce0Var, xk xkVar, bk3 bk3Var, z43 z43Var);

    public final String toString() {
        String classSimpleName = Options$Companion.getClassSimpleName(r43.a(getClass()).c);
        return classSimpleName == null ? BuildConfig.VERSION_NAME : classSimpleName;
    }
}
