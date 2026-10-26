package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.kc4;
import defpackage.lc4;
import defpackage.p3;

/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new p3(10);
    public final lc4 c;

    public ParcelImpl(Parcel parcel) {
        this.c = new kc4(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new kc4(parcel).i(this.c);
    }
}
