package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class rl0 extends v0 {
    public static final Parcelable.Creator<rl0> CREATOR = new p3(28);
    public final u73 c;
    public final boolean d;
    public final boolean h;
    public final int[] l;
    public final int m;
    public final int[] n;

    public rl0(u73 u73Var, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.c = u73Var;
        this.d = z;
        this.h = z2;
        this.l = iArr;
        this.m = i;
        this.n = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = py.e0(parcel, 20293);
        py.Z(parcel, 1, this.c, i);
        py.d0(parcel, 2, 4);
        parcel.writeInt(this.d ? 1 : 0);
        py.d0(parcel, 3, 4);
        parcel.writeInt(this.h ? 1 : 0);
        int[] iArr = this.l;
        if (iArr != null) {
            int iE1 = py.e0(parcel, 4);
            parcel.writeIntArray(iArr);
            py.f0(parcel, iE1);
        }
        py.d0(parcel, 5, 4);
        parcel.writeInt(this.m);
        int[] iArr2 = this.n;
        if (iArr2 != null) {
            int iE2 = py.e0(parcel, 6);
            parcel.writeIntArray(iArr2);
            py.f0(parcel, iE2);
        }
        py.f0(parcel, iE0);
    }
}
