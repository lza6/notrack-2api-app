package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class bt2 extends mn3 implements Parcelable, ah2, zk3 {
    public static final Parcelable.Creator<bt2> CREATOR = new p3(11);
    public wk3 d;

    public bt2(float f) {
        pk3 pk3VarK = vk3.k();
        wk3 wk3Var = new wk3(f, pk3VarK.g());
        if (!(pk3VarK instanceof rf1)) {
            wk3Var.b = new wk3(f, 1L);
        }
        this.d = wk3Var;
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
        if (((wk3) nn3Var2).c == ((wk3) nn3Var3).c) {
            return nn3Var2;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float f() {
        return ((wk3) vk3.t(this.d, this)).c;
    }

    @Override // defpackage.ln3
    public final void g(nn3 nn3Var) {
        nn3Var.getClass();
        this.d = (wk3) nn3Var;
    }

    public final void h(float f) {
        pk3 pk3VarK;
        wk3 wk3Var = (wk3) vk3.i(this.d);
        if (wk3Var.c == f) {
            return;
        }
        wk3 wk3Var2 = this.d;
        synchronized (vk3.b) {
            pk3VarK = vk3.k();
            ((wk3) vk3.o(wk3Var2, this, pk3VarK, wk3Var)).c = f;
        }
        vk3.n(pk3VarK, this);
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((wk3) vk3.i(this.d)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(f());
    }
}
