package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import notrack.ai.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class xh implements s93 {
    public final /* synthetic */ int a;
    public final Object b;

    public xh(MainActivity mainActivity) {
        this.a = 0;
        this.b = mainActivity;
    }

    public xh(t93 t93Var) {
        this.a = 1;
        this.b = new LinkedHashSet();
        t93Var.c("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.s93
    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ((MainActivity) obj).m().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) obj));
                return bundle2;
        }
    }
}
