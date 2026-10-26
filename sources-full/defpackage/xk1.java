package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class xk1 implements yk1 {
    public IBinder d;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.d;
    }

    @Override // defpackage.yk1
    public final void d(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(yk1.a);
            parcelObtain.writeStringArray(strArr);
            this.d.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
