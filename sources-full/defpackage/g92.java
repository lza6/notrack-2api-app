package defpackage;

import android.content.Context;
import notrack.ai.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class g92 implements kd4 {
    public final /* synthetic */ MainActivity a;

    public g92(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // defpackage.kd4
    public final gd4 a(Class cls) {
        Context applicationContext = this.a.getApplicationContext();
        applicationContext.getClass();
        return new hb0(new e60(applicationContext));
    }

    @Override // defpackage.kd4
    public final gd4 b(Class cls, zg2 zg2Var) {
        return a(cls);
    }
}
