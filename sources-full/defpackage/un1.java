package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class un1 implements Iterable, gu1 {
    public final /* synthetic */ int c;
    public final Object d;

    public /* synthetic */ un1(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                return new q01((Iterator) ((je1) obj).invoke());
            default:
                return new ru0((su0) obj);
        }
    }
}
