package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zk4 extends v0 {
    public static final Parcelable.Creator<zk4> CREATOR = new p3(18);
    public final int c;
    public final ml0 d;
    public final fl4 h;

    public zk4(int i, ml0 ml0Var, fl4 fl4Var) {
        this.c = i;
        this.d = ml0Var;
        this.h = fl4Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = py.e0(parcel, 20293);
        py.d0(parcel, 1, 4);
        parcel.writeInt(this.c);
        py.Z(parcel, 2, this.d, i);
        py.Z(parcel, 3, this.h, i);
        py.f0(parcel, iE0);
    }
}
