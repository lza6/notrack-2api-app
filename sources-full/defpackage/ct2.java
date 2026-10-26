package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class ct2 extends mn3 implements Parcelable, fh2, zk3 {
    public static final Parcelable.Creator<ct2> CREATOR = new p3(12);
    public xk3 d;

    public ct2(int i) {
        pk3 pk3VarK = vk3.k();
        xk3 xk3Var = new xk3(pk3VarK.g(), i);
        if (!(pk3VarK instanceof rf1)) {
            xk3Var.b = new xk3(1L, i);
        }
        this.d = xk3Var;
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
        if (((xk3) nn3Var2).c == ((xk3) nn3Var3).c) {
            return nn3Var2;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int f() {
        return ((xk3) vk3.t(this.d, this)).c;
    }

    @Override // defpackage.ln3
    public final void g(nn3 nn3Var) {
        nn3Var.getClass();
        this.d = (xk3) nn3Var;
    }

    public final void h(int i) {
        pk3 pk3VarK;
        xk3 xk3Var = (xk3) vk3.i(this.d);
        if (xk3Var.c != i) {
            xk3 xk3Var2 = this.d;
            synchronized (vk3.b) {
                pk3VarK = vk3.k();
                ((xk3) vk3.o(xk3Var2, this, pk3VarK, xk3Var)).c = i;
            }
            vk3.n(pk3VarK, this);
        }
    }

    public final String toString() {
        return "MutableIntState(value=" + ((xk3) vk3.i(this.d)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(f());
    }
}
