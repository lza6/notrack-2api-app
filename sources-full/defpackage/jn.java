package defpackage;

import app.template.extension.BuildConfig;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class jn implements Iterator {
    public int c = 0;
    public final /* synthetic */ kn d;

    public jn(kn knVar) {
        this.d = knVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.d.c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        kn knVar = this.d;
        String[] strArr = knVar.h;
        int i = this.c;
        String str = strArr[i];
        String str2 = knVar.d[i];
        if (str == null) {
            str = BuildConfig.VERSION_NAME;
        }
        in inVar = new in();
        if (str2 == null) {
            u41.k("Object must not be null");
            return null;
        }
        inVar.c = str2.trim();
        if (str2.length() == 0) {
            u41.k("String must not be empty");
            return null;
        }
        inVar.d = str;
        inVar.h = knVar;
        this.c++;
        return inVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.c;
        int i2 = i - 1;
        this.c = i2;
        kn knVar = this.d;
        int i3 = knVar.c;
        if (i2 >= i3) {
            u41.k("Must be false");
            return;
        }
        int i4 = (i3 - i2) - 1;
        if (i4 > 0) {
            String[] strArr = knVar.d;
            System.arraycopy(strArr, i, strArr, i2, i4);
            String[] strArr2 = knVar.h;
            System.arraycopy(strArr2, i, strArr2, i2, i4);
        }
        int i5 = knVar.c - 1;
        knVar.c = i5;
        knVar.d[i5] = null;
        knVar.h[i5] = null;
    }
}
