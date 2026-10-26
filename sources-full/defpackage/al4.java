package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class al4 {
    public static final mi4 i = new mi4(new yj4(2), new bg1(21));
    public final Context a;
    public final String b;
    public final mi4 c;
    public final ht3 d;
    public final vg e;
    public final int f;
    public final t73 g;
    public final zf1 h;

    public al4(Context context) {
        uf1 uf1Var = uf1.b;
        g13.t(context, "Null context is not permitted.");
        mi4 mi4Var = i;
        g13.t(mi4Var, "Api must not be null.");
        g13.t(uf1Var, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        g13.t(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.b = attributionTag;
        this.c = mi4Var;
        this.d = ht3.a;
        this.e = new vg(mi4Var, attributionTag);
        zf1 zf1VarD = zf1.d(applicationContext);
        this.h = zf1VarD;
        this.f = zf1VarD.h.getAndIncrement();
        this.g = uf1Var.a;
        el4 el4Var = zf1VarD.m;
        el4Var.sendMessage(el4Var.obtainMessage(7, this));
    }

    public final ci4 a() {
        ci4 ci4Var = new ci4(15, false);
        Set set = Collections.EMPTY_SET;
        if (((ul) ci4Var.d) == null) {
            ci4Var.d = new ul(0);
        }
        ((ul) ci4Var.d).addAll(set);
        Context context = this.a;
        ci4Var.l = context.getClass().getName();
        ci4Var.h = context.getPackageName();
        return ci4Var;
    }

    public final void b(gt3 gt3Var) {
        sk3 sk3Var = new sk3(5);
        o61[] o61VarArr = {sf3.d};
        sk3Var.d = new sk3(21, gt3Var);
        cr1 cr1Var = new cr1(sk3Var, o61VarArr, false);
        us3 us3Var = new us3();
        zf1 zf1Var = this.h;
        zf1Var.getClass();
        nk4 nk4Var = new nk4(new wk4(cr1Var, us3Var, this.g), zf1Var.i.get(), this);
        el4 el4Var = zf1Var.m;
        el4Var.sendMessage(el4Var.obtainMessage(4, nk4Var));
    }
}
