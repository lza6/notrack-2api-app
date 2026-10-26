package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.p3;
import defpackage.py;
import defpackage.u41;
import defpackage.v0;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends v0 implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new p3(25);
    public final int c;
    public final String d;

    public Scope(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            u41.k("scopeUri must not be null or empty");
            throw null;
        }
        this.c = i;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.d.equals(((Scope) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = py.e0(parcel, 20293);
        py.d0(parcel, 1, 4);
        parcel.writeInt(this.c);
        py.a0(parcel, 2, this.d);
        py.f0(parcel, iE0);
    }
}
