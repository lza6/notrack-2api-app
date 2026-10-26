package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class b51 implements i61 {
    public final /* synthetic */ int c;
    public final t13 d;

    public /* synthetic */ b51(t13 t13Var, int i) {
        this.c = i;
        this.d = t13Var;
    }

    @Override // defpackage.t13
    public final Object get() {
        int i = this.c;
        t13 t13Var = this.d;
        switch (i) {
            case 0:
                String packageName = ((Context) t13Var.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                m51.x("Cannot return null from a non-@Nullable @Provides method");
                return null;
            default:
                return new bb3(Integer.valueOf(bb3.l).intValue(), (Context) t13Var.get(), "com.google.android.datatransport.events");
        }
    }
}
