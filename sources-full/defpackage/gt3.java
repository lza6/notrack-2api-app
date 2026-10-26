package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gt3 extends v0 {
    public static final Parcelable.Creator<gt3> CREATOR = new p3(14);
    public final int c;
    public List d;

    public gt3(int i, List list) {
        this.c = i;
        this.d = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = py.e0(parcel, 20293);
        py.d0(parcel, 1, 4);
        parcel.writeInt(this.c);
        py.c0(parcel, 2, this.d);
        py.f0(parcel, iE0);
    }
}
