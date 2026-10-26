package defpackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes.dex */
public final class kw2 extends l0 {
    @Override // defpackage.j23
    public final int e(int i) {
        return ThreadLocalRandom.current().nextInt(0, i);
    }

    @Override // defpackage.l0
    public final Random f() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        threadLocalRandomCurrent.getClass();
        return threadLocalRandomCurrent;
    }
}
