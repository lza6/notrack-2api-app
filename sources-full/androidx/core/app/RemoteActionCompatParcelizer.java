package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.jc4;
import defpackage.kc4;
import defpackage.lc4;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(jc4 jc4Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        lc4 lc4VarG = remoteActionCompat.a;
        boolean z = true;
        if (jc4Var.e(1)) {
            lc4VarG = jc4Var.g();
        }
        remoteActionCompat.a = (IconCompat) lc4VarG;
        CharSequence charSequence = remoteActionCompat.b;
        if (jc4Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((kc4) jc4Var).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (jc4Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((kc4) jc4Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) jc4Var.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (jc4Var.e(5)) {
            z2 = ((kc4) jc4Var).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!jc4Var.e(6)) {
            z = z3;
        } else if (((kc4) jc4Var).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, jc4 jc4Var) {
        jc4Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        jc4Var.h(1);
        jc4Var.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        jc4Var.h(2);
        Parcel parcel = ((kc4) jc4Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        jc4Var.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        jc4Var.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        jc4Var.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        jc4Var.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
