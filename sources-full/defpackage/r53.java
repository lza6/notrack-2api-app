package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class r53 extends ee2 {
    public final /* synthetic */ int c = 1;
    public final Context d;

    public r53(Context context) {
        super(9, 10);
        this.d = context;
    }

    public r53(Context context, int i, int i2) {
        super(i, i2);
        this.d = context;
    }

    @Override // defpackage.ee2
    public final void a(be1 be1Var) {
        int i = this.c;
        Context context = this.d;
        switch (i) {
            case 0:
                if (this.b >= 10) {
                    be1Var.x(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                be1Var.c.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    be1Var.a();
                    try {
                        be1Var.x(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                        be1Var.x(new Object[]{"reschedule_needed", Long.valueOf(j2)});
                        sharedPreferences.edit().clear().apply();
                        be1Var.O();
                        be1Var.l();
                    } catch (Throwable th) {
                        be1Var.l();
                        throw th;
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i2 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i3 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    be1Var.a();
                    try {
                        be1Var.x(new Object[]{"next_job_scheduler_id", Integer.valueOf(i2)});
                        be1Var.x(new Object[]{"next_alarm_manager_id", Integer.valueOf(i3)});
                        sharedPreferences2.edit().clear().apply();
                        be1Var.O();
                        return;
                    } finally {
                        be1Var.l();
                    }
                }
                return;
        }
    }
}
