package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class od1 implements Parcelable {
    public static final Parcelable.Creator<od1> CREATOR = new p3(6);
    public ArrayList c;
    public ArrayList d;
    public fr[] h;
    public int l;
    public String m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList p;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.c);
        parcel.writeStringList(this.d);
        parcel.writeTypedArray(this.h, i);
        parcel.writeInt(this.l);
        parcel.writeString(this.m);
        parcel.writeStringList(this.n);
        parcel.writeTypedList(this.o);
        parcel.writeTypedList(this.p);
    }
}
