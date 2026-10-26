package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.a;

/* JADX INFO: loaded from: classes.dex */
public final class cp4 extends gl4 {
    public final IBinder g;
    public final /* synthetic */ a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp4(a aVar, int i, IBinder iBinder, Bundle bundle) {
        super(aVar, i, bundle);
        this.h = aVar;
        this.g = iBinder;
    }

    @Override // defpackage.gl4
    public final boolean a() {
        IBinder iBinder = this.g;
        try {
            g13.s(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            a aVar = this.h;
            if (!aVar.r().equals(interfaceDescriptor)) {
                String strR = aVar.r();
                StringBuilder sb = new StringBuilder(strR.length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(strR);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.w("GmsClient", sb.toString());
                return false;
            }
            IInterface iInterfaceM = aVar.m(iBinder);
            if (iInterfaceM == null || !(aVar.u(2, 4, iInterfaceM) || aVar.u(3, 4, iInterfaceM))) {
                return false;
            }
            aVar.s = null;
            sk3 sk3Var = aVar.n;
            if (sk3Var == null) {
                return true;
            }
            ((xf1) sk3Var.d).e();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // defpackage.gl4
    public final void b(ml0 ml0Var) {
        sk3 sk3Var = this.h.o;
        if (sk3Var != null) {
            ((yf1) sk3Var.d).c(ml0Var);
        }
        System.currentTimeMillis();
    }
}
