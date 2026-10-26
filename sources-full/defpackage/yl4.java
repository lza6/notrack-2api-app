package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class yl4 extends ak4 implements am4 {
    public final int e(String str, String str2, int i) {
        Parcel parcelB = b();
        parcelB.writeInt(i);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        Parcel parcelC = c(parcelB, 1);
        int i2 = parcelC.readInt();
        parcelC.recycle();
        return i2;
    }

    public final int g(int i, String str, String str2, Bundle bundle) {
        Parcel parcelB = b();
        parcelB.writeInt(i);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        int i2 = bm4.a;
        parcelB.writeInt(1);
        bundle.writeToParcel(parcelB, 0);
        Parcel parcelC = c(parcelB, 10);
        int i3 = parcelC.readInt();
        parcelC.recycle();
        return i3;
    }

    public final Bundle h(String str, String str2, String str3) {
        Parcel parcelB = b();
        parcelB.writeInt(3);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        parcelB.writeString(str3);
        parcelB.writeString(null);
        Parcel parcelC = c(parcelB, 3);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) bm4.a(parcelC);
        parcelC.recycle();
        return bundle;
    }

    public final Bundle i(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelB = b();
        parcelB.writeInt(i);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        parcelB.writeString(str3);
        parcelB.writeString(null);
        int i2 = bm4.a;
        parcelB.writeInt(1);
        bundle.writeToParcel(parcelB, 0);
        Parcel parcelC = c(parcelB, 8);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) bm4.a(parcelC);
        parcelC.recycle();
        return bundle2;
    }

    public final Bundle j(String str, String str2, String str3) {
        Parcel parcelB = b();
        parcelB.writeInt(3);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        parcelB.writeString(str3);
        Parcel parcelC = c(parcelB, 4);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) bm4.a(parcelC);
        parcelC.recycle();
        return bundle;
    }

    public final Bundle k(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelB = b();
        parcelB.writeInt(i);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        parcelB.writeString(str3);
        int i2 = bm4.a;
        parcelB.writeInt(1);
        bundle.writeToParcel(parcelB, 0);
        Parcel parcelC = c(parcelB, 11);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) bm4.a(parcelC);
        parcelC.recycle();
        return bundle2;
    }

    public final Bundle l(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelB = b();
        parcelB.writeInt(i);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        int i2 = bm4.a;
        parcelB.writeInt(1);
        bundle.writeToParcel(parcelB, 0);
        parcelB.writeInt(1);
        bundle2.writeToParcel(parcelB, 0);
        Parcel parcelC = c(parcelB, 901);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle3 = (Bundle) bm4.a(parcelC);
        parcelC.recycle();
        return bundle3;
    }

    public final void m(String str, Bundle bundle, an4 an4Var) {
        Parcel parcelB = b();
        parcelB.writeInt(25);
        parcelB.writeString(str);
        int i = bm4.a;
        parcelB.writeInt(1);
        bundle.writeToParcel(parcelB, 0);
        parcelB.writeStrongBinder(an4Var);
        try {
            this.e.transact(2101, parcelB, null, 1);
        } finally {
            parcelB.recycle();
        }
    }
}
