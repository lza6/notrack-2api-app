package defpackage;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class uh4 {
    public final zh4 a;
    public final tz2 b;
    public final ji4 c;

    static {
        v72.h("WMFgUpdater");
    }

    public uh4(WorkDatabase workDatabase, tz2 tz2Var, zh4 zh4Var) {
        this.b = tz2Var;
        this.a = zh4Var;
        this.c = workDatabase.u();
    }
}
