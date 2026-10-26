package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class fr implements Parcelable {
    public static final Parcelable.Creator<fr> CREATOR = new p3(2);
    public final int[] c;
    public final ArrayList d;
    public final int[] h;
    public final int[] l;
    public final int m;
    public final String n;
    public final int o;
    public final int p;
    public final CharSequence q;
    public final int r;
    public final CharSequence s;
    public final ArrayList t;
    public final ArrayList u;
    public final boolean v;

    public fr(Parcel parcel) {
        this.c = parcel.createIntArray();
        this.d = parcel.createStringArrayList();
        this.h = parcel.createIntArray();
        this.l = parcel.createIntArray();
        this.m = parcel.readInt();
        this.n = parcel.readString();
        this.o = parcel.readInt();
        this.p = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.q = (CharSequence) creator.createFromParcel(parcel);
        this.r = parcel.readInt();
        this.s = (CharSequence) creator.createFromParcel(parcel);
        this.t = parcel.createStringArrayList();
        this.u = parcel.createStringArrayList();
        this.v = parcel.readInt() != 0;
    }

    public fr(er erVar) {
        int size = erVar.a.size();
        this.c = new int[size * 6];
        if (!erVar.g) {
            u41.r("Not on back stack");
            throw null;
        }
        this.d = new ArrayList(size);
        this.h = new int[size];
        this.l = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            xd1 xd1Var = (xd1) erVar.a.get(i2);
            int i3 = i + 1;
            this.c[i] = xd1Var.a;
            ArrayList arrayList = this.d;
            xc1 xc1Var = xd1Var.b;
            arrayList.add(xc1Var != null ? xc1Var.m : null);
            int[] iArr = this.c;
            iArr[i3] = xd1Var.c ? 1 : 0;
            iArr[i + 2] = xd1Var.d;
            iArr[i + 3] = xd1Var.e;
            int i4 = i + 5;
            iArr[i + 4] = xd1Var.f;
            i += 6;
            iArr[i4] = xd1Var.g;
            this.h[i2] = xd1Var.h.ordinal();
            this.l[i2] = xd1Var.i.ordinal();
        }
        this.m = erVar.f;
        this.n = erVar.h;
        this.o = erVar.s;
        this.p = erVar.i;
        this.q = erVar.j;
        this.r = erVar.k;
        this.s = erVar.l;
        this.t = erVar.m;
        this.u = erVar.n;
        this.v = erVar.o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.c);
        parcel.writeStringList(this.d);
        parcel.writeIntArray(this.h);
        parcel.writeIntArray(this.l);
        parcel.writeInt(this.m);
        parcel.writeString(this.n);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p);
        TextUtils.writeToParcel(this.q, parcel, 0);
        parcel.writeInt(this.r);
        TextUtils.writeToParcel(this.s, parcel, 0);
        parcel.writeStringList(this.t);
        parcel.writeStringList(this.u);
        parcel.writeInt(this.v ? 1 : 0);
    }
}
