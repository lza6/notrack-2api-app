package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: loaded from: classes.dex */
public final class ng2 extends Binder implements zk1 {
    public final /* synthetic */ MultiInstanceInvalidationService d;

    public ng2(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.d = multiInstanceInvalidationService;
        attachInterface(this, zk1.b);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        og2 og2Var;
        String str = zk1.b;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        int i3 = 0;
        yk1 yk1Var = null;
        yk1 yk1Var2 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(yk1.a);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof yk1)) {
                    xk1 xk1Var = new xk1();
                    xk1Var.d = strongBinder;
                    yk1Var = xk1Var;
                } else {
                    yk1Var = (yk1) iInterfaceQueryLocalInterface;
                }
            }
            String string = parcel.readString();
            yk1Var.getClass();
            if (string != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.d;
                synchronized (multiInstanceInvalidationService.h) {
                    try {
                        int i4 = multiInstanceInvalidationService.c + 1;
                        multiInstanceInvalidationService.c = i4;
                        if (multiInstanceInvalidationService.h.register(yk1Var, Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.d.put(Integer.valueOf(i4), string);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.c--;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
        if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(yk1.a);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof yk1)) {
                    xk1 xk1Var2 = new xk1();
                    xk1Var2.d = strongBinder2;
                    yk1Var2 = xk1Var2;
                } else {
                    yk1Var2 = (yk1) iInterfaceQueryLocalInterface2;
                }
            }
            int i5 = parcel.readInt();
            yk1Var2.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.d;
            synchronized (multiInstanceInvalidationService2.h) {
                multiInstanceInvalidationService2.h.unregister(yk1Var2);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i6 = parcel.readInt();
        String[] strArrCreateStringArray = parcel.createStringArray();
        strArrCreateStringArray.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.d;
        synchronized (multiInstanceInvalidationService3.h) {
            try {
                String str2 = (String) multiInstanceInvalidationService3.d.get(Integer.valueOf(i6));
                if (str2 == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                } else {
                    int iBeginBroadcast = multiInstanceInvalidationService3.h.beginBroadcast();
                    while (true) {
                        og2Var = multiInstanceInvalidationService3.h;
                        if (i3 >= iBeginBroadcast) {
                            break;
                        }
                        try {
                            Object broadcastCookie = og2Var.getBroadcastCookie(i3);
                            broadcastCookie.getClass();
                            Integer num = (Integer) broadcastCookie;
                            int iIntValue = num.intValue();
                            String str3 = (String) multiInstanceInvalidationService3.d.get(num);
                            if (i6 != iIntValue && str2.equals(str3)) {
                                try {
                                    ((yk1) multiInstanceInvalidationService3.h.getBroadcastItem(i3)).d(strArrCreateStringArray);
                                } catch (RemoteException e) {
                                    Log.w("ROOM", "Error invoking a remote callback", e);
                                }
                            }
                            i3++;
                        } catch (Throwable th2) {
                            multiInstanceInvalidationService3.h.finishBroadcast();
                            throw th2;
                        }
                    }
                    og2Var.finishBroadcast();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return true;
    }
}
