package defpackage;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ck4 extends Binder implements IInterface {
    public final /* synthetic */ int d;

    public /* synthetic */ ck4(int i) {
        this.d = i;
    }

    public ck4(String str, int i) {
        this.d = i;
        switch (i) {
            case 2:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.d;
        return this;
    }

    public abstract boolean g(Parcel parcel, int i);

    public boolean h(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean zOnTransact = false;
        switch (this.d) {
            case 0:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i2)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                ok4 ok4Var = (ok4) this;
                switch (i) {
                    case 3:
                        kk4.b(parcel);
                        break;
                    case 4:
                        kk4.b(parcel);
                        break;
                    case 5:
                    default:
                        return false;
                    case 6:
                        kk4.b(parcel);
                        break;
                    case 7:
                        kk4.b(parcel);
                        break;
                    case 8:
                        zk4 zk4Var = (zk4) kk4.a(parcel, zk4.CREATOR);
                        kk4.b(parcel);
                        ok4Var.f.post(new io4(14, ok4Var, zk4Var, zOnTransact));
                        break;
                    case 9:
                        kk4.b(parcel);
                        break;
                }
                parcel2.writeNoException();
                return true;
            case 1:
                if (i > 16777215) {
                    zOnTransact = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (zOnTransact) {
                    return true;
                }
                return g(parcel, i);
            case 2:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return h(i, parcel, parcel2);
            default:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i2)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                ks4 ks4Var = (ks4) this;
                if (i == 2) {
                    Parcelable.Creator creator = Bundle.CREATOR;
                    int i3 = vm4.a;
                    Bundle bundle = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator.createFromParcel(parcel) : null);
                    int iDataAvail = parcel.dataAvail();
                    if (iDataAvail > 0) {
                        throw new BadParcelableException(ud2.m(iDataAvail, "Parcel data not fully consumed, unread size: "));
                    }
                    ks4Var.j(bundle);
                } else {
                    if (i != 3) {
                        return false;
                    }
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    int i4 = vm4.a;
                    Bundle bundle2 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator2.createFromParcel(parcel) : null);
                    int iDataAvail2 = parcel.dataAvail();
                    if (iDataAvail2 > 0) {
                        throw new BadParcelableException(ud2.m(iDataAvail2, "Parcel data not fully consumed, unread size: "));
                    }
                    ks4Var.i(bundle2);
                }
                return true;
        }
    }
}
