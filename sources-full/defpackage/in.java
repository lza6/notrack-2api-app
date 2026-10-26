package defpackage;

import app.template.extension.BuildConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class in implements Map.Entry, Cloneable {
    public String c;
    public String d;
    public kn h;

    public final Object clone() {
        try {
            return (in) super.clone();
        } catch (CloneNotSupportedException e) {
            m51.n(e);
            return null;
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && in.class == obj.getClass()) {
            in inVar = (in) obj;
            String str = this.c;
            String str2 = inVar.c;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            String str3 = this.d;
            String str4 = inVar.d;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.d;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.c;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        String str;
        String str2 = (String) obj;
        kn knVar = this.h;
        String str3 = this.c;
        int iB = knVar.b(str3);
        String str4 = BuildConfig.VERSION_NAME;
        if (iB != -1 && (str = knVar.h[iB]) != null) {
            str4 = str;
        }
        int iB2 = knVar.b(str3);
        if (iB2 != -1) {
            knVar.h[iB2] = str2;
        }
        this.d = str2;
        return str4;
    }
}
