package defpackage;

import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class fn3 {
    public final boolean equals(Object obj) {
        return obj instanceof fn3;
    }

    public final int hashCode() {
        return Long.hashCode(LongCompanionObject.MAX_VALUE) + (Long.hashCode(0L) * 31);
    }

    public final String toString() {
        return ud2.r(new StringBuilder("SharingStarted.WhileSubscribed("), ke0.D0(kr1.q(new c52(2)), null, null, null, null, 63), ')');
    }
}
