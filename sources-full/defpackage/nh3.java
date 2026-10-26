package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

/* JADX INFO: loaded from: classes.dex */
public final class nh3 extends a {
    public final Bundle A;
    public final Integer B;
    public final boolean y;
    public final f13 z;

    public nh3(Context context, Looper looper, f13 f13Var, Bundle bundle, xf1 xf1Var, yf1 yf1Var) {
        super(context, looper, 44, f13Var, xf1Var, yf1Var);
        this.y = true;
        this.z = f13Var;
        this.A = bundle;
        this.B = (Integer) f13Var.f;
    }

    @Override // defpackage.mg
    public final int e() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.mg
    public final boolean k() {
        return this.y;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface m(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof sk4 ? (sk4) iInterfaceQueryLocalInterface : new sk4(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle p() {
        f13 f13Var = this.z;
        boolean zEquals = this.c.getPackageName().equals((String) f13Var.a);
        Bundle bundle = this.A;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) f13Var.a);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.gms.signin.service.START";
    }
}
