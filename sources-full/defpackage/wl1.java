package defpackage;

import android.content.res.AssetFileDescriptor;
import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wl1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wl1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                WorkDatabase workDatabase = ((yl1) obj).a;
                Long lC = workDatabase.l().c("next_alarm_manager_id");
                int iLongValue = lC != null ? (int) lC.longValue() : 0;
                workDatabase.l().f(new ey2("next_alarm_manager_id", Long.valueOf(iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0)));
                return Integer.valueOf(iLongValue);
            default:
                return (AssetFileDescriptor) obj;
        }
    }
}
