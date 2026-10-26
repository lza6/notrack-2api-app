package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class ft2 extends mn3 implements Parcelable, zk3 {
    public static final Parcelable.Creator<ft2> CREATOR = new et2(0);
    public final bl3 d;
    public al3 h;

    public ft2(Object obj, bl3 bl3Var) {
        this.d = bl3Var;
        pk3 pk3VarK = vk3.k();
        al3 al3Var = new al3(obj, pk3VarK.g());
        if (!(pk3VarK instanceof rf1)) {
            al3Var.b = new al3(obj, 1L);
        }
        this.h = al3Var;
    }

    @Override // defpackage.zk3
    public final bl3 a() {
        return this.d;
    }

    @Override // defpackage.ln3
    public final nn3 b() {
        return this.h;
    }

    @Override // defpackage.ln3
    public final nn3 d(nn3 nn3Var, nn3 nn3Var2, nn3 nn3Var3) {
        if (this.d.e(((al3) nn3Var2).c, ((al3) nn3Var3).c)) {
            return nn3Var2;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.ln3
    public final void g(nn3 nn3Var) {
        nn3Var.getClass();
        this.h = (al3) nn3Var;
    }

    @Override // defpackage.gn3
    public final Object getValue() {
        return ((al3) vk3.t(this.h, this)).c;
    }

    @Override // defpackage.mi2
    public final void setValue(Object obj) {
        pk3 pk3VarK;
        al3 al3Var = (al3) vk3.i(this.h);
        if (this.d.e(al3Var.c, obj)) {
            return;
        }
        al3 al3Var2 = this.h;
        synchronized (vk3.b) {
            pk3VarK = vk3.k();
            ((al3) vk3.o(al3Var2, this, pk3VarK, al3Var)).c = obj;
        }
        vk3.n(pk3VarK, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((al3) vk3.i(this.h)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        t73 t73Var = t73.t;
        bl3 bl3Var = this.d;
        if (kr1.n(bl3Var, t73Var)) {
            i2 = 0;
        } else if (kr1.n(bl3Var, t73.A)) {
            i2 = 1;
        } else {
            if (!kr1.n(bl3Var, t73.x)) {
                u41.r("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
