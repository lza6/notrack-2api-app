package defpackage;

import android.database.sqlite.SQLiteDatabase;
import app.template.extension.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y94 implements xq3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ o83 d;

    public /* synthetic */ y94(o83 o83Var, int i) {
        this.c = i;
        this.d = o83Var;
    }

    @Override // defpackage.xq3
    public final Object d() {
        int i = this.c;
        o83 o83Var = this.d;
        switch (i) {
            case 0:
                o83Var.getClass();
                int i2 = kd0.e;
                ir3 ir3Var = new ir3();
                ir3Var.c = null;
                ir3Var.d = new ArrayList();
                ir3Var.h = null;
                ir3Var.l = BuildConfig.VERSION_NAME;
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseA = o83Var.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    kd0 kd0Var = (kd0) o83.K(sQLiteDatabaseA.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new it0(o83Var, map, ir3Var, 4));
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return kd0Var;
                } finally {
                    sQLiteDatabaseA.endTransaction();
                }
            default:
                Integer num = (Integer) o83Var.h(new k83(o83Var, o83Var.d.a() - o83Var.l.d));
                num.getClass();
                return num;
        }
    }
}
