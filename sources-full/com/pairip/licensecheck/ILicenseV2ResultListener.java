package com.pairip.licensecheck;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface ILicenseV2ResultListener extends IInterface {
    public static final String DESCRIPTOR = "com.android.vending.licensing.ILicenseV2ResultListener";

    public static abstract class Stub extends Binder implements ILicenseV2ResultListener {
        static final int TRANSACTION_VERIFY_LICENSE = 1;

        public Stub() {
            attachInterface(this, ILicenseV2ResultListener.DESCRIPTOR);
        }

        private static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> c) {
            if (parcel.readInt() != 0) {
                return c.createFromParcel(parcel);
            }
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            if (code >= 1 && code <= 16777215) {
                data.enforceInterface(ILicenseV2ResultListener.DESCRIPTOR);
            }
            if (code == 1) {
                verifyLicense(data.readInt(), (Bundle) readTypedObject(data, Bundle.CREATOR));
                return true;
            }
            if (code != 1598968902) {
                return super.onTransact(code, data, reply, flags);
            }
            reply.writeString(ILicenseV2ResultListener.DESCRIPTOR);
            return true;
        }
    }

    void verifyLicense(int responseCode, Bundle responsePayload) throws RemoteException;
}
