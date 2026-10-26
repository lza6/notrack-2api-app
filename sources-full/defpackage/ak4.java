package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class ak4 implements IInterface {
    public final /* synthetic */ int d;
    public final IBinder e;
    public final String f;

    public /* synthetic */ ak4(IBinder iBinder, String str, int i) {
        this.d = i;
        this.e = iBinder;
        this.f = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.d;
        return this.e;
    }

    public Parcel b() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f);
        return parcelObtain;
    }

    public Parcel c(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.e.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }
}
