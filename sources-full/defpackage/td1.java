package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public final class td1 implements Parcelable {
    public static final Parcelable.Creator<td1> CREATOR = new p3(7);
    public final String c;
    public final String d;
    public final boolean h;
    public final boolean l;
    public final int m;
    public final int n;
    public final String o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final int t;
    public final String u;
    public final int v;
    public final boolean w;

    public td1(Parcel parcel) {
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.h = parcel.readInt() != 0;
        this.l = parcel.readInt() != 0;
        this.m = parcel.readInt();
        this.n = parcel.readInt();
        this.o = parcel.readString();
        this.p = parcel.readInt() != 0;
        this.q = parcel.readInt() != 0;
        this.r = parcel.readInt() != 0;
        this.s = parcel.readInt() != 0;
        this.t = parcel.readInt();
        this.u = parcel.readString();
        this.v = parcel.readInt();
        this.w = parcel.readInt() != 0;
    }

    public td1(xc1 xc1Var) {
        this.c = xc1Var.getClass().getName();
        this.d = xc1Var.m;
        this.h = xc1Var.v;
        this.l = xc1Var.x;
        this.m = xc1Var.F;
        this.n = xc1Var.G;
        this.o = xc1Var.H;
        this.p = xc1Var.K;
        this.q = xc1Var.t;
        this.r = xc1Var.J;
        this.s = xc1Var.I;
        this.t = xc1Var.U.ordinal();
        this.u = xc1Var.p;
        this.v = xc1Var.q;
        this.w = xc1Var.P;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(Uuid.SIZE_BITS);
        sb.append("FragmentState{");
        sb.append(this.c);
        sb.append(" (");
        sb.append(this.d);
        sb.append(")}:");
        if (this.h) {
            sb.append(" fromLayout");
        }
        if (this.l) {
            sb.append(" dynamicContainer");
        }
        int i = this.n;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.o;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.p) {
            sb.append(" retainInstance");
        }
        if (this.q) {
            sb.append(" removing");
        }
        if (this.r) {
            sb.append(" detached");
        }
        if (this.s) {
            sb.append(" hidden");
        }
        String str2 = this.u;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.v);
        }
        if (this.w) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        parcel.writeString(this.o);
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeInt(this.r ? 1 : 0);
        parcel.writeInt(this.s ? 1 : 0);
        parcel.writeInt(this.t);
        parcel.writeString(this.u);
        parcel.writeInt(this.v);
        parcel.writeInt(this.w ? 1 : 0);
    }
}
