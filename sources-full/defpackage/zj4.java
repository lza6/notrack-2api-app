package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zj4 extends v0 {
    public static final Parcelable.Creator<zj4> CREATOR = new p3(15);
    public final int c;
    public final int d;
    public final Intent h;

    public zj4(int i, int i2, Intent intent) {
        this.c = i;
        this.d = i2;
        this.h = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = py.e0(parcel, 20293);
        py.d0(parcel, 1, 4);
        parcel.writeInt(this.c);
        py.d0(parcel, 2, 4);
        parcel.writeInt(this.d);
        py.Z(parcel, 3, this.h, i);
        py.f0(parcel, iE0);
    }
}
