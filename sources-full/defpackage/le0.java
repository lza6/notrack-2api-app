package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class le0 extends kr1 {
    public static int q0(Iterable iterable, int i) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
