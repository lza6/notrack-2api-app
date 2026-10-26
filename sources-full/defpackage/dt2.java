package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class dt2 extends mn3 implements Parcelable, zk3, gn3, mi2 {
    public static final Parcelable.Creator<dt2> CREATOR = new p3(13);
    public yk3 d;

    public dt2(long j) {
        pk3 pk3VarK = vk3.k();
        yk3 yk3Var = new yk3(pk3VarK.g(), j);
        if (!(pk3VarK instanceof rf1)) {
            yk3Var.b = new yk3(1L, j);
        }
        this.d = yk3Var;
    }

    @Override // defpackage.zk3
    public final bl3 a() {
        return t73.A;
    }

    @Override // defpackage.ln3
    public final nn3 b() {
        return this.d;
    }

    @Override // defpackage.ln3
    public final nn3 d(nn3 nn3Var, nn3 nn3Var2, nn3 nn3Var3) {
        if (((yk3) nn3Var2).c == ((yk3) nn3Var3).c) {
            return nn3Var2;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long f() {
        return ((yk3) vk3.t(this.d, this)).c;
    }

    @Override // defpackage.ln3
    public final void g(nn3 nn3Var) {
        nn3Var.getClass();
        this.d = (yk3) nn3Var;
    }

    @Override // defpackage.gn3
    public final Object getValue() {
        return Long.valueOf(f());
    }

    public final void h(long j) {
        pk3 pk3VarK;
        yk3 yk3Var = (yk3) vk3.i(this.d);
        if (yk3Var.c != j) {
            yk3 yk3Var2 = this.d;
            synchronized (vk3.b) {
                pk3VarK = vk3.k();
                ((yk3) vk3.o(yk3Var2, this, pk3VarK, yk3Var)).c = j;
            }
            vk3.n(pk3VarK, this);
        }
    }

    @Override // defpackage.mi2
    public final void setValue(Object obj) {
        h(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((yk3) vk3.i(this.d)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(f());
    }
}
