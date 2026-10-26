package defpackage;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class tu implements x11 {
    public Context a;

    public /* synthetic */ tu(Context context, byte b) {
        this.a = context;
    }

    public tu(Context context, int i) {
        switch (i) {
            case 2:
                this.a = context.getApplicationContext();
                break;
            default:
                this.a = context.getApplicationContext();
                break;
        }
    }

    @Override // defpackage.x11
    public void a(yo4 yo4Var) {
        fl0 fl0Var = new fl0("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), fl0Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new p00(this, yo4Var, threadPoolExecutor, 2));
    }

    public kr0 b() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        kr0 kr0Var = new kr0();
        kr0Var.c = mx0.a(i51.a);
        f61 f61Var = new f61(context);
        kr0Var.d = f61Var;
        int i = 7;
        kr0Var.h = mx0.a(new mi4(f61Var, i, new jb(22, f61Var)));
        f61 f61Var2 = kr0Var.d;
        kr0Var.l = new b51(f61Var2, 1);
        int i2 = 10;
        t13 t13VarA = mx0.a(new bv0(i2, kr0Var.l, mx0.a(new b51(f61Var2, 0)), false));
        kr0Var.m = t13VarA;
        rn0 rn0Var = new rn0(29);
        f61 f61Var3 = kr0Var.d;
        iy2 iy2Var = new iy2(f61Var3, t13VarA, rn0Var, i);
        t13 t13Var = kr0Var.c;
        t13 t13Var2 = kr0Var.h;
        vu vuVar = new vu();
        vuVar.c = t13Var;
        vuVar.d = t13Var2;
        vuVar.h = iy2Var;
        vuVar.l = t13VarA;
        vuVar.m = t13VarA;
        s44 s44Var = new s44();
        s44Var.c = f61Var3;
        s44Var.d = t13Var2;
        s44Var.h = t13VarA;
        s44Var.l = iy2Var;
        s44Var.m = t13Var;
        s44Var.n = t13VarA;
        s44Var.o = t13VarA;
        kr0Var.n = mx0.a(new iy2(vuVar, s44Var, new ir3(t13Var, t13VarA, iy2Var, t13VarA), 14));
        return kr0Var;
    }
}
