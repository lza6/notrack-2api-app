package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes.dex */
public final class dl4 extends v0 {
    public static final Parcelable.Creator<dl4> CREATOR = new p3(20);
    public final int c;
    public final Account d;
    public final int h;
    public final GoogleSignInAccount l;

    public dl4(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.c = i;
        this.d = account;
        this.h = i2;
        this.l = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = py.e0(parcel, 20293);
        py.d0(parcel, 1, 4);
        parcel.writeInt(this.c);
        py.Z(parcel, 2, this.d, i);
        py.d0(parcel, 3, 4);
        parcel.writeInt(this.h);
        py.Z(parcel, 4, this.l, i);
        py.f0(parcel, iE0);
    }
}
