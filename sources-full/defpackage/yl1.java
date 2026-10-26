package defpackage;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class yl1 {
    public final WorkDatabase a;

    public yl1(WorkDatabase workDatabase, int i) {
        switch (i) {
            case 1:
                this.a = workDatabase;
                break;
            default:
                workDatabase.getClass();
                this.a = workDatabase;
                break;
        }
    }
}
