package defpackage;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zs4 implements wk1, IInterface {
    public final IBinder d;

    public zs4(IBinder iBinder) {
        this.d = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.d;
    }

    public final Account b() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                this.d.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain.recycle();
                Account account = (Account) sm4.a(parcelObtain2, Account.CREATOR);
                parcelObtain2.recycle();
                return account;
            } catch (RuntimeException e) {
                parcelObtain2.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }
}
