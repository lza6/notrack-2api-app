package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class sq1 implements Parcelable {
    public static final Parcelable.Creator<sq1> CREATOR = new p3(8);
    public final IntentSender c;
    public final Intent d;
    public final int h;
    public final int l;

    public sq1(IntentSender intentSender, Intent intent, int i, int i2) {
        intentSender.getClass();
        this.c = intentSender;
        this.d = intent;
        this.h = i;
        this.l = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeInt(this.h);
        parcel.writeInt(this.l);
    }
}
