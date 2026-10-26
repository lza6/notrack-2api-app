package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jc4;
import defpackage.kc4;
import defpackage.u41;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(jc4 jc4Var) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.a;
        if (jc4Var.e(1)) {
            i = ((kc4) jc4Var).e.readInt();
        }
        iconCompat.a = i;
        byte[] bArr = iconCompat.c;
        if (jc4Var.e(2)) {
            Parcel parcel = ((kc4) jc4Var).e;
            int i2 = parcel.readInt();
            if (i2 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i2];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.c = bArr;
        iconCompat.d = jc4Var.f(iconCompat.d, 3);
        int i3 = iconCompat.e;
        if (jc4Var.e(4)) {
            i3 = ((kc4) jc4Var).e.readInt();
        }
        iconCompat.e = i3;
        int i4 = iconCompat.f;
        if (jc4Var.e(5)) {
            i4 = ((kc4) jc4Var).e.readInt();
        }
        iconCompat.f = i4;
        iconCompat.g = (ColorStateList) jc4Var.f(iconCompat.g, 6);
        String string = iconCompat.i;
        if (jc4Var.e(7)) {
            string = ((kc4) jc4Var).e.readString();
        }
        iconCompat.i = string;
        String string2 = iconCompat.j;
        if (jc4Var.e(8)) {
            string2 = ((kc4) jc4Var).e.readString();
        }
        iconCompat.j = string2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    return iconCompat;
                }
                u41.k("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.c;
                iconCompat.b = bArr3;
                iconCompat.a = 3;
                iconCompat.e = 0;
                iconCompat.f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = str;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, jc4 jc4Var) {
        jc4Var.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            jc4Var.h(1);
            ((kc4) jc4Var).e.writeInt(i);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            jc4Var.h(2);
            Parcel parcel = ((kc4) jc4Var).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            jc4Var.h(3);
            ((kc4) jc4Var).e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            jc4Var.h(4);
            ((kc4) jc4Var).e.writeInt(i2);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            jc4Var.h(5);
            ((kc4) jc4Var).e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            jc4Var.h(6);
            ((kc4) jc4Var).e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            jc4Var.h(7);
            ((kc4) jc4Var).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            jc4Var.h(8);
            ((kc4) jc4Var).e.writeString(str2);
        }
    }
}
