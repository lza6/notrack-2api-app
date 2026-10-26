package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class fl4 extends v0 {
    public static final Parcelable.Creator<fl4> CREATOR = new p3(21);
    public final int c;
    public final IBinder d;
    public final ml0 h;
    public final boolean l;
    public final boolean m;

    public fl4(int i, IBinder iBinder, ml0 ml0Var, boolean z, boolean z2) {
        this.c = i;
        this.d = iBinder;
        this.h = ml0Var;
        this.l = z;
        this.m = z2;
    }

    public final boolean equals(Object obj) {
        Object zs4Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl4)) {
            return false;
        }
        fl4 fl4Var = (fl4) obj;
        if (!this.h.equals(fl4Var.h)) {
            return false;
        }
        Object zs4Var2 = null;
        IBinder iBinder = this.d;
        if (iBinder == null) {
            zs4Var = null;
        } else {
            int i = e2.e;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            zs4Var = iInterfaceQueryLocalInterface instanceof wk1 ? (wk1) iInterfaceQueryLocalInterface : new zs4(iBinder);
        }
        IBinder iBinder2 = fl4Var.d;
        if (iBinder2 != null) {
            int i2 = e2.e;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            zs4Var2 = iInterfaceQueryLocalInterface2 instanceof wk1 ? (wk1) iInterfaceQueryLocalInterface2 : new zs4(iBinder2);
        }
        return gb2.D(zs4Var, zs4Var2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = py.e0(parcel, 20293);
        py.d0(parcel, 1, 4);
        parcel.writeInt(this.c);
        IBinder iBinder = this.d;
        if (iBinder != null) {
            int iE1 = py.e0(parcel, 2);
            parcel.writeStrongBinder(iBinder);
            py.f0(parcel, iE1);
        }
        py.Z(parcel, 3, this.h, i);
        py.d0(parcel, 4, 4);
        parcel.writeInt(this.l ? 1 : 0);
        py.d0(parcel, 5, 4);
        parcel.writeInt(this.m ? 1 : 0);
        py.f0(parcel, iE0);
    }
}
