package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.gb2;
import defpackage.mi4;
import defpackage.ml0;
import defpackage.p3;
import defpackage.py;
import defpackage.v0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends v0 implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new p3(26);
    public final int c;
    public final String d;
    public final PendingIntent h;
    public final ml0 l;

    public Status(int i, String str, PendingIntent pendingIntent, ml0 ml0Var) {
        this.c = i;
        this.d = str;
        this.h = pendingIntent;
        this.l = ml0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.c == status.c && gb2.D(this.d, status.d) && gb2.D(this.h, status.h) && gb2.D(this.l, status.l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.d, this.h, this.l});
    }

    public final String toString() {
        mi4 mi4Var = new mi4(this);
        String string = this.d;
        if (string == null) {
            int i = this.c;
            switch (i) {
                case -1:
                    string = "SUCCESS_CACHE";
                    break;
                case 0:
                    string = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
                    sb.append("unknown status code: ");
                    sb.append(i);
                    string = sb.toString();
                    break;
                case 2:
                    string = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    string = "SERVICE_DISABLED";
                    break;
                case 4:
                    string = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    string = "INVALID_ACCOUNT";
                    break;
                case 6:
                    string = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    string = "NETWORK_ERROR";
                    break;
                case 8:
                    string = "INTERNAL_ERROR";
                    break;
                case 10:
                    string = "DEVELOPER_ERROR";
                    break;
                case 13:
                    string = "ERROR";
                    break;
                case 14:
                    string = "INTERRUPTED";
                    break;
                case 15:
                    string = "TIMEOUT";
                    break;
                case 16:
                    string = "CANCELED";
                    break;
                case 17:
                    string = "API_NOT_CONNECTED";
                    break;
                case 18:
                    string = "DEAD_CLIENT";
                    break;
                case 19:
                    string = "REMOTE_EXCEPTION";
                    break;
                case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                    string = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    string = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    string = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        mi4Var.b(string, "statusCode");
        mi4Var.b(this.h, "resolution");
        return mi4Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = py.e0(parcel, 20293);
        py.d0(parcel, 1, 4);
        parcel.writeInt(this.c);
        py.a0(parcel, 2, this.d);
        py.Z(parcel, 3, this.h, i);
        py.Z(parcel, 4, this.l, i);
        py.f0(parcel, iE0);
    }
}
