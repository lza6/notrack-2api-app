package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class yq0 implements Iterable {
    public final String c;

    public yq0(String str) {
        this.c = str;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new xq0(this);
    }
}
