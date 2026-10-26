package defpackage;

import androidx.compose.foundation.layout.e;

/* JADX INFO: loaded from: classes.dex */
public final class c01 {
    public static final c01 a = new c01();

    public final long getContainerColor(ck0 ck0Var, int i) {
        return af0.getValue(ze0.v, ck0Var, 6);
    }

    public final long getModalContainerColor(ck0 ck0Var, int i) {
        return af0.getValue(ze0.z, ck0Var, 6);
    }

    public final long getScrimColor(ck0 ck0Var, int i) {
        return re0.b(0.32f, af0.getValue(ze0.s, ck0Var, 6));
    }

    public final rg3 getShape(ck0 ck0Var, int i) {
        return wg3.getValue(tg3.n, ck0Var, 6);
    }

    public final long getStandardContainerColor(ck0 ck0Var, int i) {
        return af0.getValue(ze0.v, ck0Var, 6);
    }

    public final e getWindowInsets(ck0 ck0Var, int i) {
        return new v32(dr3.getSystemBarsForVisualComponents(e.a, ck0Var, 6), mh4.f | mh4.a);
    }
}
