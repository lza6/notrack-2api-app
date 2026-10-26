package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class u73 extends v0 {
    public static final Parcelable.Creator<u73> CREATOR = new p3(23);
    public final int c;
    public final boolean d;
    public final boolean h;
    public final int l;
    public final int m;

    public u73(int i, int i2, int i3, boolean z, boolean z2) {
        this.c = i;
        this.d = z;
        this.h = z2;
        this.l = i2;
        this.m = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = py.e0(parcel, 20293);
        py.d0(parcel, 1, 4);
        parcel.writeInt(this.c);
        py.d0(parcel, 2, 4);
        parcel.writeInt(this.d ? 1 : 0);
        py.d0(parcel, 3, 4);
        parcel.writeInt(this.h ? 1 : 0);
        py.d0(parcel, 4, 4);
        parcel.writeInt(this.l);
        py.d0(parcel, 5, 4);
        parcel.writeInt(this.m);
        py.f0(parcel, iE0);
    }
}
