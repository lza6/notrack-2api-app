package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class o61 extends v0 {
    public static final Parcelable.Creator<o61> CREATOR = new p3(24);
    public final String c;
    public final int d;
    public final long h;
    public final boolean l;

    public o61(String str, int i, long j, boolean z) {
        this.c = str;
        this.d = i;
        this.h = j;
        this.l = z;
    }

    public final long a() {
        long j = this.h;
        return j == -1 ? this.d : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o61) {
            o61 o61Var = (o61) obj;
            if (gb2.D(this.c, o61Var.c) && a() == o61Var.a() && this.l == o61Var.l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Long.valueOf(a()), Boolean.valueOf(this.l)});
    }

    public final String toString() {
        mi4 mi4Var = new mi4(this);
        mi4Var.b(this.c, "name");
        mi4Var.b(Long.valueOf(a()), "version");
        mi4Var.b(Boolean.valueOf(this.l), "is_fully_rolled_out");
        return mi4Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = py.e0(parcel, 20293);
        py.a0(parcel, 1, this.c);
        py.d0(parcel, 2, 4);
        parcel.writeInt(this.d);
        long jA = a();
        py.d0(parcel, 3, 8);
        parcel.writeLong(jA);
        py.d0(parcel, 4, 4);
        parcel.writeInt(this.l ? 1 : 0);
        py.f0(parcel, iE0);
    }
}
