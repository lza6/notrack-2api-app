package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vk4 extends v0 {
    public static final Parcelable.Creator<vk4> CREATOR = new p3(17);
    public final List c;
    public final String d;

    public vk4(String str, ArrayList arrayList) {
        this.c = arrayList;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = py.e0(parcel, 20293);
        List<String> list = this.c;
        if (list != null) {
            int iE1 = py.e0(parcel, 1);
            parcel.writeStringList(list);
            py.f0(parcel, iE1);
        }
        py.a0(parcel, 2, this.d);
        py.f0(parcel, iE0);
    }
}
