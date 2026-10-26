package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class zk2 extends vr {
    public static final String c = v72.h("NetworkMeteredCtrlr");
    public final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk2(im0 im0Var) {
        super(im0Var);
        im0Var.getClass();
        this.b = 7;
    }

    @Override // defpackage.fm0
    public final boolean a(hi4 hi4Var) {
        hi4Var.getClass();
        return hi4Var.j.a == 5;
    }

    @Override // defpackage.vr
    public final int d() {
        return this.b;
    }

    @Override // defpackage.vr
    public final boolean e(Object obj) {
        hl2 hl2Var = (hl2) obj;
        hl2Var.getClass();
        boolean z = hl2Var.a;
        if (Build.VERSION.SDK_INT >= 26) {
            return (z && hl2Var.c) ? false : true;
        }
        v72.f().c(c, "Metered network constraint is not supported before API 26, only checking for connected state.");
        return !z;
    }
}
