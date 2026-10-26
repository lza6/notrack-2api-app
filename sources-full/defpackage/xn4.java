package defpackage;

import android.os.BadParcelableException;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class xn4 extends ck4 {
    public final ms4 e;

    public xn4(ms4 ms4Var) {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback", 1);
        this.e = ms4Var;
    }

    @Override // defpackage.ck4
    public final boolean g(Parcel parcel, int i) {
        if (i != 1) {
            return false;
        }
        int i2 = parcel.readInt();
        int i3 = bm4.a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(ud2.m(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
        this.e.a(Integer.valueOf(i2));
        return true;
    }
}
