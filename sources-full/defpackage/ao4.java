package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.a;

/* JADX INFO: loaded from: classes.dex */
public final class ao4 extends ck4 {
    public a e;
    public final int f;

    public ao4(a aVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 2);
        this.e = aVar;
        this.f = i;
    }

    @Override // defpackage.ck4
    public final boolean h(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) sm4.a(parcel, Bundle.CREATOR);
            sm4.b(parcel);
            g13.t(this.e, "onPostInitComplete can be called only once per call to getRemoteService");
            a aVar = this.e;
            int i3 = this.f;
            aVar.getClass();
            cp4 cp4Var = new cp4(aVar, i2, strongBinder, bundle);
            em4 em4Var = aVar.e;
            em4Var.sendMessage(em4Var.obtainMessage(1, i3, -1, cp4Var));
            this.e = null;
        } else if (i == 2) {
            parcel.readInt();
            sm4.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i4 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            sq4 sq4Var = (sq4) sm4.a(parcel, sq4.CREATOR);
            sm4.b(parcel);
            a aVar2 = this.e;
            g13.t(aVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            g13.s(sq4Var);
            aVar2.u = sq4Var;
            Bundle bundle2 = sq4Var.c;
            g13.t(this.e, "onPostInitComplete can be called only once per call to getRemoteService");
            a aVar3 = this.e;
            int i5 = this.f;
            aVar3.getClass();
            cp4 cp4Var2 = new cp4(aVar3, i4, strongBinder2, bundle2);
            em4 em4Var2 = aVar3.e;
            em4Var2.sendMessage(em4Var2.obtainMessage(1, i5, -1, cp4Var2));
            this.e = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
