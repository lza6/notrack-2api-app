package defpackage;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o93 implements s93 {
    public final t93 a;
    public boolean b;
    public Bundle c;
    public final yq3 d;

    public o93(t93 t93Var, nd4 nd4Var) {
        t93Var.getClass();
        this.a = t93Var;
        this.d = new yq3(new i43(2, nd4Var));
    }

    @Override // defpackage.s93
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((p93) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((k93) entry.getValue()).e.a();
            if (!kr1.n(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundle;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleA = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleA != null) {
            bundle.putAll(bundleA);
        }
        this.c = bundle;
        this.b = true;
    }
}
