package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class gr implements Parcelable {
    public static final Parcelable.Creator<gr> CREATOR = new p3(3);
    public final ArrayList c;
    public final ArrayList d;

    public gr(Parcel parcel) {
        this.c = parcel.createStringArrayList();
        this.d = parcel.createTypedArrayList(fr.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.c);
        parcel.writeTypedList(this.d);
    }
}
