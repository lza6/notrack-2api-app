package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class et2 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ et2(int i) {
        this.a = i;
    }

    public static ft2 a(Parcel parcel, ClassLoader classLoader) {
        t73 t73Var;
        if (classLoader == null) {
            classLoader = et2.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            t73Var = t73.t;
        } else if (i == 1) {
            t73Var = t73.A;
        } else {
            if (i != 2) {
                u41.r(ud2.q("Unsupported MutableState policy ", " was restored", i));
                return null;
            }
            t73Var = t73.x;
        }
        return new ft2(value, t73Var);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return g.d;
                }
                u41.r("superState must be null");
                return null;
            default:
                return new l44(parcel, null);
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return g.d;
                }
                u41.r("superState must be null");
                return null;
            default:
                return new l44(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ft2[i];
            case 1:
                return new g[i];
            default:
                return new l44[i];
        }
    }
}
