package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class sq4 extends v0 {
    public static final Parcelable.Creator<sq4> CREATOR = new p3(27);
    public Bundle c;
    public o61[] d;
    public int h;
    public rl0 l;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = py.e0(parcel, 20293);
        Bundle bundle = this.c;
        if (bundle != null) {
            int iE1 = py.e0(parcel, 1);
            parcel.writeBundle(bundle);
            py.f0(parcel, iE1);
        }
        py.b0(parcel, 2, this.d, i);
        int i2 = this.h;
        py.d0(parcel, 3, 4);
        parcel.writeInt(i2);
        py.Z(parcel, 4, this.l, i);
        py.f0(parcel, iE0);
    }
}
