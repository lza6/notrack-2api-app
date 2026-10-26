package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

/* JADX INFO: loaded from: classes.dex */
public final class cl4 extends a {
    public final ht3 y;

    public cl4(Context context, Looper looper, f13 f13Var, ht3 ht3Var, ek4 ek4Var, ek4 ek4Var2) {
        super(context, looper, 270, f13Var, ek4Var, ek4Var2);
        this.y = ht3Var;
    }

    @Override // defpackage.mg
    public final int e() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface m(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof yk4 ? (yk4) iInterfaceQueryLocalInterface : new yk4(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final o61[] o() {
        return sf3.e;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle p() {
        this.y.getClass();
        return new Bundle();
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean t() {
        return true;
    }
}
