package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* JADX INFO: loaded from: classes.dex */
public abstract class a7 {
    public static final String a = v72.h("Alarms");

    public static void a(Context context, vh4 vh4Var, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = vf0.n;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        vf0.c(intent, vh4Var);
        PendingIntent service = PendingIntent.getService(context, i, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        v72.f().c(a, "Cancelling existing alarm with (workSpecId, systemId) (" + vh4Var + ", " + i + ")");
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, vh4 vh4Var, long j) {
        ir3 ir3VarQ = workDatabase.q();
        gr3 gr3VarW = ir3VarQ.W(vh4Var);
        if (gr3VarW != null) {
            int i = gr3VarW.c;
            a(context, vh4Var, i);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = vf0.n;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            vf0.c(intent, vh4Var);
            PendingIntent service = PendingIntent.getService(context, i, intent, 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j, service);
                return;
            }
            return;
        }
        Object objN = workDatabase.n(new wl1(0, new yl1(workDatabase, 0)));
        objN.getClass();
        int iIntValue = ((Number) objN).intValue();
        ir3VarQ.Z(new gr3(vh4Var.a, vh4Var.b, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = vf0.n;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        vf0.c(intent2, vh4Var);
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, intent2, 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j, service2);
        }
    }
}
