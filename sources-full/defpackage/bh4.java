package defpackage;

import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class bh4 {
    public static int c(int i, int i2) {
        if (i2 < 0) {
            u41.k("cannot store more than Integer.MAX_VALUE elements");
            return 0;
        }
        if (i2 <= i) {
            return i;
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int iHighestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = iHighestOneBit + iHighestOneBit;
        }
        return i3 < 0 ? IntCompanionObject.MAX_VALUE : i3;
    }

    public void a(boolean z) {
    }

    public abstract void b(boolean z);
}
