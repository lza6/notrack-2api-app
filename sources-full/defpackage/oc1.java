package defpackage;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class oc1 implements Runnable {
    public static final String m = v72.h("ForceStopRunnable");
    public static final long n = 315360000000L;
    public final Context c;
    public final wh4 d;
    public final yl1 h;
    public int l = 0;

    public oc1(Context context, wh4 wh4Var) {
        this.c = context.getApplicationContext();
        this.d = wh4Var;
        this.h = wh4Var.g;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + n;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x020a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0222  */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    public final void a() {
        boolean z;
        yl1 yl1Var = this.h;
        wh4 wh4Var = this.d;
        WorkDatabase workDatabase = wh4Var.c;
        jl0 jl0Var = wh4Var.b;
        yl1 yl1Var2 = wh4Var.g;
        WorkDatabase workDatabase2 = wh4Var.c;
        String str = kr3.n;
        Context context = this.c;
        JobScheduler jobSchedulerA = ks1.a(context);
        ArrayList arrayListD = kr3.d(context, jobSchedulerA);
        ir3 ir3VarQ = workDatabase.q();
        ir3VarQ.getClass();
        q73 q73VarA = q73.a(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) ir3VarQ.c;
        workDatabase_Impl.b();
        Cursor cursorM = workDatabase_Impl.m(q73VarA);
        try {
            ArrayList arrayList = new ArrayList(cursorM.getCount());
            while (cursorM.moveToNext()) {
                arrayList.add(cursorM.getString(0));
            }
            cursorM.close();
            q73VarA.l();
            HashSet hashSet = new HashSet(arrayListD != null ? arrayListD.size() : 0);
            if (arrayListD != null && !arrayListD.isEmpty()) {
                int size = arrayListD.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListD.get(i);
                    i++;
                    JobInfo jobInfo = (JobInfo) obj;
                    vh4 vh4VarF = kr3.f(jobInfo);
                    if (vh4VarF != null) {
                        hashSet.add(vh4VarF.a);
                    } else {
                        kr3.b(jobSchedulerA, jobInfo.getId());
                    }
                }
            }
            int size2 = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    z = false;
                    break;
                }
                Object obj2 = arrayList.get(i2);
                i2++;
                if (!hashSet.contains((String) obj2)) {
                    v72.f().c(kr3.n, "Reconciling jobs");
                    z = true;
                    break;
                }
            }
            if (z) {
                workDatabase.c();
                try {
                    ji4 ji4VarU = workDatabase.u();
                    int size3 = arrayList.size();
                    int i3 = 0;
                    while (i3 < size3) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        ji4VarU.n((String) obj3, -1L);
                    }
                    workDatabase.p();
                    workDatabase.k();
                } catch (Throwable th) {
                    workDatabase.k();
                    throw th;
                }
            }
            ji4 ji4VarU2 = workDatabase2.u();
            ci4 ci4VarT = workDatabase2.t();
            workDatabase2.c();
            try {
                ArrayList arrayListI = ji4VarU2.i();
                boolean zIsEmpty = arrayListI.isEmpty();
                if (!zIsEmpty) {
                    int size4 = arrayListI.size();
                    int i4 = 0;
                    while (i4 < size4) {
                        Object obj4 = arrayListI.get(i4);
                        i4++;
                        String str2 = ((hi4) obj4).a;
                        ji4VarU2.v(1, str2);
                        ji4VarU2.w(-512, str2);
                        ji4VarU2.n(str2, -1L);
                        zIsEmpty = zIsEmpty;
                    }
                }
                boolean z2 = zIsEmpty;
                WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) ci4VarT.d;
                workDatabase_Impl2.b();
                hr3 hr3Var = (hr3) ci4VarT.l;
                he1 he1VarA = hr3Var.a();
                try {
                    workDatabase_Impl2.c();
                    try {
                        he1VarA.a();
                        workDatabase_Impl2.p();
                        workDatabase_Impl2.k();
                        hr3Var.j(he1VarA);
                        workDatabase2.p();
                        workDatabase2.k();
                        boolean z3 = !z2 || z;
                        Long lC = yl1Var2.a.l().c("reschedule_needed");
                        String str3 = m;
                        if (lC != null && lC.longValue() == 1) {
                            v72.f().c(str3, "Rescheduling Workers.");
                            wh4Var.c();
                            yl1Var2.getClass();
                            yl1Var2.a.l().f(new ey2("reschedule_needed", 0L));
                            return;
                        }
                        try {
                            int i5 = Build.VERSION.SDK_INT;
                            int i6 = i5 >= 31 ? 570425344 : 536870912;
                            Intent intent = new Intent();
                            intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                            intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                            PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i6);
                            if (i5 < 30) {
                                if (broadcast == null) {
                                    c(context);
                                    v72.f().c(str3, "Application was force-stopped, rescheduling.");
                                    wh4Var.c();
                                    jl0Var.d.getClass();
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    yl1Var.getClass();
                                    yl1Var.a.l().f(new ey2("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis)));
                                    return;
                                }
                                if (z3) {
                                    v72.f().c(str3, "Found unfinished work, scheduling it.");
                                    ya3.b(jl0Var, workDatabase2, wh4Var.e);
                                }
                            }
                            if (broadcast != null) {
                                broadcast.cancel();
                            }
                            List historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                            if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                                Long lC2 = yl1Var.a.l().c("last_force_stop_ms");
                                long jLongValue = lC2 != null ? lC2.longValue() : 0L;
                                for (int i7 = 0; i7 < historicalProcessExitReasons.size(); i7++) {
                                    ApplicationExitInfo applicationExitInfoF = g1.f(historicalProcessExitReasons.get(i7));
                                    if (applicationExitInfoF.getReason() == 10 && applicationExitInfoF.getTimestamp() >= jLongValue) {
                                        v72.f().c(str3, "Application was force-stopped, rescheduling.");
                                        wh4Var.c();
                                        jl0Var.d.getClass();
                                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                                        yl1Var.getClass();
                                        yl1Var.a.l().f(new ey2("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis2)));
                                        return;
                                    }
                                }
                            }
                            if (z3) {
                                v72.f().c(str3, "Found unfinished work, scheduling it.");
                                ya3.b(jl0Var, workDatabase2, wh4Var.e);
                            }
                        } catch (IllegalArgumentException e) {
                            e = e;
                            if (v72.f().c <= 5) {
                                Log.w(str3, "Ignoring exception", e);
                            }
                        } catch (SecurityException e2) {
                            e = e2;
                            if (v72.f().c <= 5) {
                                Log.w(str3, "Ignoring exception", e);
                            }
                        }
                    } catch (Throwable th2) {
                        workDatabase_Impl2.k();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    hr3Var.j(he1VarA);
                    throw th3;
                }
            } catch (Throwable th4) {
                workDatabase2.k();
                throw th4;
            }
        } catch (Throwable th5) {
            cursorM.close();
            q73VarA.l();
            throw th5;
        }
    }

    public final boolean b() {
        jl0 jl0Var = this.d.b;
        jl0Var.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = m;
        if (zIsEmpty) {
            v72.f().c(str, "The default process name was not specified.");
            return true;
        }
        boolean zA = rz2.a(this.c, jl0Var);
        v72.f().c(str, "Is default app process = " + zA);
        return zA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.c;
        String str = m;
        wh4 wh4Var = this.d;
        try {
            if (!b()) {
                wh4Var.b();
                return;
            }
            while (true) {
                try {
                    rh4.a(context);
                    v72.f().c(str, "Performing cleanup operations.");
                    try {
                        a();
                        wh4Var.b();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e) {
                        int i = this.l + 1;
                        this.l = i;
                        if (i >= 3) {
                            String str2 = ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked() ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            v72.f().e(str, str2, e);
                            IllegalStateException illegalStateException = new IllegalStateException(str2, e);
                            wh4Var.b.getClass();
                            throw illegalStateException;
                        }
                        long j = ((long) i) * 300;
                        String str3 = "Retrying after " + j;
                        if (v72.f().c <= 3) {
                            Log.d(str, str3, e);
                        }
                        try {
                            Thread.sleep(((long) this.l) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e2) {
                    v72.f().d(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                    wh4Var.b.getClass();
                    throw illegalStateException2;
                }
            }
        } catch (Throwable th) {
            wh4Var.b();
            throw th;
        }
    }
}
