package defpackage;

import android.app.Notification;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class nm2 {
    public final String a;
    public final int b;
    public final Notification c;

    public nm2(String str, int i, Notification notification) {
        this.a = str;
        this.b = i;
        this.c = notification;
    }

    public final void a(cl1 cl1Var) {
        String str = this.a;
        int i = this.b;
        Notification notification = this.c;
        al1 al1Var = (al1) cl1Var;
        al1Var.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(cl1.c);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(null);
            parcelObtain.writeInt(1);
            notification.writeToParcel(parcelObtain, 0);
            al1Var.d.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.a);
        sb.append(", id:");
        return fq2.q(sb, this.b, ", tag:null]");
    }
}
