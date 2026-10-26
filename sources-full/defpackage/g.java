package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements Parcelable {
    public final Parcelable c;
    public static final f d = new f();
    public static final Parcelable.Creator<g> CREATOR = new et2(1);

    public g() {
        this.c = null;
    }

    public g(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.c = parcelable == null ? d : parcelable;
    }

    public g(Parcelable parcelable) {
        if (parcelable != null) {
            this.c = parcelable == d ? null : parcelable;
        } else {
            u41.k("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.c, i);
    }
}
