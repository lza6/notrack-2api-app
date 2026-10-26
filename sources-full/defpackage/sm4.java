package defpackage;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class sm4 {
    public static final /* synthetic */ int a = 0;

    static {
        sm4.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iDataAvail).length() + 45);
        sb.append("Parcel data not fully consumed, unread size: ");
        sb.append(iDataAvail);
        throw new BadParcelableException(sb.toString());
    }
}
