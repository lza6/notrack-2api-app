package kotlinx.coroutines.flow;

import defpackage.sb3;
import defpackage.zf3;

/* JADX INFO: loaded from: classes.dex */
public final class SharingStarted$Companion {
    private static final sb3 Eagerly = new sb3(1);
    private static final zf3 Lazily = new zf3(1);

    public static sb3 getEagerly() {
        return Eagerly;
    }

    public static zf3 getLazily() {
        return Lazily;
    }
}
