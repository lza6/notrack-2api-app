package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class de2 extends v0 {
    public static final Parcelable.Creator<de2> CREATOR = new p3(19);
    public final int c;
    public final int d;
    public final int h;
    public final long l;
    public final long m;
    public final String n;
    public final String o;
    public final int p;
    public final int q;

    public de2(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.c = i;
        this.d = i2;
        this.h = i3;
        this.l = j;
        this.m = j2;
        this.n = str;
        this.o = str2;
        this.p = i4;
        this.q = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = py.e0(parcel, 20293);
        py.d0(parcel, 1, 4);
        parcel.writeInt(this.c);
        py.d0(parcel, 2, 4);
        parcel.writeInt(this.d);
        py.d0(parcel, 3, 4);
        parcel.writeInt(this.h);
        py.d0(parcel, 4, 8);
        parcel.writeLong(this.l);
        py.d0(parcel, 5, 8);
        parcel.writeLong(this.m);
        py.a0(parcel, 6, this.n);
        py.a0(parcel, 7, this.o);
        py.d0(parcel, 8, 4);
        parcel.writeInt(this.p);
        py.d0(parcel, 9, 4);
        parcel.writeInt(this.q);
        py.f0(parcel, iE0);
    }
}
