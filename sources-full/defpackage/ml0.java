package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ml0 extends v0 {
    public final int c;
    public final int d;
    public final PendingIntent h;
    public final String l;
    public final Integer m;
    public static final ml0 n = new ml0(0, null, null);
    public static final Parcelable.Creator<ml0> CREATOR = new p3(22);

    public ml0(int i, int i2, PendingIntent pendingIntent, String str, Integer num) {
        this.c = i;
        this.d = i2;
        this.h = pendingIntent;
        this.l = str;
        this.m = num;
    }

    public ml0(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }

    public static String a(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ml0)) {
            return false;
        }
        ml0 ml0Var = (ml0) obj;
        return this.d == ml0Var.d && gb2.D(this.h, ml0Var.h) && gb2.D(this.l, ml0Var.l) && gb2.D(this.m, ml0Var.m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d), this.h, this.l, this.m});
    }

    public final String toString() {
        mi4 mi4Var = new mi4(this);
        mi4Var.b(a(this.d), "statusCode");
        mi4Var.b(this.h, "resolution");
        mi4Var.b(this.l, "message");
        mi4Var.b(this.m, "clientMethodKey");
        return mi4Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = py.e0(parcel, 20293);
        py.d0(parcel, 1, 4);
        parcel.writeInt(this.c);
        py.d0(parcel, 2, 4);
        parcel.writeInt(this.d);
        py.Z(parcel, 3, this.h, i);
        py.a0(parcel, 4, this.l);
        Integer num = this.m;
        if (num != null) {
            py.d0(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        py.f0(parcel, iE0);
    }
}
