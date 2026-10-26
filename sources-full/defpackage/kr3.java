package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class kr3 implements ua3 {
    public static final String n = v72.h("SystemJobScheduler");
    public final Context c;
    public final JobScheduler d;
    public final jr3 h;
    public final WorkDatabase l;
    public final jl0 m;

    public kr3(Context context, WorkDatabase workDatabase, jl0 jl0Var) {
        JobScheduler jobSchedulerA = ks1.a(context);
        jr3 jr3Var = new jr3(context, jl0Var.d, jl0Var.l);
        this.c = context;
        this.d = jobSchedulerA;
        this.h = jr3Var;
        this.l = workDatabase;
        this.m = jl0Var;
    }

    public static void b(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            v72.f().e(n, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList d(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        String str = ks1.a;
        jobScheduler.getClass();
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
            allPendingJobs.getClass();
        } catch (Throwable th) {
            v72.f().e(ks1.a, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static vh4 f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new vh4(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.ua3
    public final void a(String str) {
        ArrayList arrayList;
        Context context = this.c;
        JobScheduler jobScheduler = this.d;
        ArrayList arrayListD = d(context, jobScheduler);
        int i = 0;
        if (arrayListD == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            int size = arrayListD.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListD.get(i2);
                i2++;
                JobInfo jobInfo = (JobInfo) obj;
                vh4 vh4VarF = f(jobInfo);
                if (vh4VarF != null && str.equals(vh4VarF.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            b(jobScheduler, ((Integer) obj2).intValue());
        }
        ir3 ir3VarQ = this.l.q();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) ir3VarQ.c;
        workDatabase_Impl.b();
        hr3 hr3Var = (hr3) ir3VarQ.l;
        he1 he1VarA = hr3Var.a();
        he1VarA.i(1, str);
        try {
            workDatabase_Impl.c();
            try {
                he1VarA.a();
                workDatabase_Impl.p();
                workDatabase_Impl.k();
                hr3Var.j(he1VarA);
            } catch (Throwable th) {
                workDatabase_Impl.k();
                throw th;
            }
        } catch (Throwable th2) {
            hr3Var.j(he1VarA);
            throw th2;
        }
    }

    @Override // defpackage.ua3
    public final void c(hi4... hi4VarArr) {
        int iIntValue;
        jl0 jl0Var = this.m;
        WorkDatabase workDatabase = this.l;
        final yl1 yl1Var = new yl1(workDatabase, 0);
        for (hi4 hi4Var : hi4VarArr) {
            workDatabase.c();
            try {
                ji4 ji4VarU = workDatabase.u();
                String str = hi4Var.a;
                hi4 hi4VarL = ji4VarU.l(str);
                String str2 = n;
                if (hi4VarL == null) {
                    v72.f().i(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.p();
                } else if (hi4VarL.b != 1) {
                    v72.f().i(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.p();
                } else {
                    vh4 vh4VarA = ki4.a(hi4Var);
                    gr3 gr3VarW = workDatabase.q().W(vh4VarA);
                    if (gr3VarW != null) {
                        iIntValue = gr3VarW.c;
                    } else {
                        jl0Var.getClass();
                        final int i = jl0Var.i;
                        Object objN = yl1Var.a.n(new Callable() { // from class: xl1
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                WorkDatabase workDatabase2 = yl1Var.a;
                                Long lC = workDatabase2.l().c("next_job_scheduler_id");
                                int i2 = 0;
                                int iLongValue = lC != null ? (int) lC.longValue() : 0;
                                workDatabase2.l().f(new ey2("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                                if (iLongValue < 0 || iLongValue > i) {
                                    workDatabase2.l().f(new ey2("next_job_scheduler_id", 1L));
                                } else {
                                    i2 = iLongValue;
                                }
                                return Integer.valueOf(i2);
                            }
                        });
                        objN.getClass();
                        iIntValue = ((Number) objN).intValue();
                    }
                    if (gr3VarW == null) {
                        workDatabase.q().Z(new gr3(vh4VarA.a, vh4VarA.b, iIntValue));
                    }
                    g(hi4Var, iIntValue);
                    workDatabase.p();
                }
                workDatabase.k();
            } catch (Throwable th) {
                workDatabase.k();
                throw th;
            }
        }
    }

    @Override // defpackage.ua3
    public final boolean e() {
        return true;
    }

    public final void g(hi4 hi4Var, int i) {
        int i2;
        int i3;
        List<JobInfo> allPendingJobs;
        String str;
        jr3 jr3Var = this.h;
        jr3Var.getClass();
        tm0 tm0Var = hi4Var.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str2 = hi4Var.a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str2);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", hi4Var.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", hi4Var.d());
        JobInfo.Builder builder = new JobInfo.Builder(i, jr3Var.a);
        boolean z = tm0Var.c;
        Set<sm0> set = tm0Var.i;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z);
        boolean z2 = tm0Var.d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z2).setExtras(persistableBundle);
        NetworkRequest networkRequestA = tm0Var.a();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 28 || networkRequestA == null) {
            int i5 = tm0Var.a;
            if (i4 < 30 || i5 != 6) {
                int iZ = fq2.z(i5);
                if (iZ == 0) {
                    i2 = 0;
                } else if (iZ == 1) {
                    i2 = 1;
                } else if (iZ != 2) {
                    i2 = 3;
                    if (iZ != 3) {
                        i2 = 4;
                        if (iZ != 4 || i4 < 26) {
                            v72.f().c(jr3.d, "API version too low. Cannot convert network type value ".concat(ud2.y(i5)));
                            i2 = 1;
                        }
                    }
                } else {
                    i2 = 2;
                }
                extras.setRequiredNetworkType(i2);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        } else {
            extras.getClass();
            extras.setRequiredNetwork(networkRequestA);
        }
        if (!z2) {
            extras.setBackoffCriteria(hi4Var.m, hi4Var.l == 2 ? 0 : 1);
        }
        long jA = hi4Var.a();
        jr3Var.b.getClass();
        long jMax = Math.max(jA - System.currentTimeMillis(), 0L);
        if (i4 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!hi4Var.q && jr3Var.c) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (sm0 sm0Var : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(sm0Var.a, sm0Var.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(tm0Var.g);
            extras.setTriggerContentMaxDelay(tm0Var.h);
        }
        extras.setPersisted(false);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 26) {
            extras.setRequiresBatteryNotLow(tm0Var.e);
            extras.setRequiresStorageNotLow(tm0Var.f);
        }
        boolean z3 = hi4Var.k > 0;
        boolean z4 = jMax > 0;
        if (i6 >= 31 && hi4Var.q && !z3 && !z4) {
            extras.setExpedited(true);
        }
        if (i6 >= 35 && (str = hi4Var.x) != null) {
            extras.setTraceTag(str);
        }
        JobInfo jobInfoBuild = extras.build();
        String str3 = n;
        v72.f().c(str3, "Scheduling work ID " + str2 + "Job ID " + i);
        try {
            try {
                if (this.d.schedule(jobInfoBuild) != 0) {
                    return;
                }
                v72.f().i(str3, "Unable to schedule work ID " + str2);
                if (!hi4Var.q || hi4Var.r != 1) {
                    return;
                }
                i3 = 0;
                try {
                    hi4Var.q = false;
                    v72.f().c(str3, "Scheduling a non-expedited job (work ID " + str2 + ")");
                    g(hi4Var, i);
                    return;
                } catch (IllegalStateException e) {
                    e = e;
                }
            } catch (IllegalStateException e2) {
                e = e2;
                i3 = 0;
            }
        } catch (Throwable th) {
            v72.f().e(str3, "Unable to schedule " + hi4Var, th);
            return;
        }
        IllegalStateException illegalStateException = e;
        String str4 = ks1.a;
        Context context = this.c;
        context.getClass();
        WorkDatabase workDatabase = this.l;
        workDatabase.getClass();
        jl0 jl0Var = this.m;
        jl0Var.getClass();
        int i7 = Build.VERSION.SDK_INT;
        int i8 = i7 >= 31 ? 150 : 100;
        int size = workDatabase.u().j().size();
        String strD0 = "<faulty JobScheduler failed to getPendingJobs>";
        if (i7 >= 34) {
            JobScheduler jobSchedulerA = ks1.a(context);
            try {
                allPendingJobs = jobSchedulerA.getAllPendingJobs();
                allPendingJobs.getClass();
            } catch (Throwable th2) {
                v72.f().e(ks1.a, "getAllPendingJobs() is not reliable on this device.", th2);
                allPendingJobs = null;
            }
            if (allPendingJobs != null) {
                ArrayList arrayListD = d(context, jobSchedulerA);
                int size2 = arrayListD != null ? allPendingJobs.size() - arrayListD.size() : i3;
                String str5 = size2 == 0 ? null : size2 + " of which are not owned by WorkManager";
                Object systemService = context.getSystemService("jobscheduler");
                systemService.getClass();
                ArrayList arrayListD2 = d(context, (JobScheduler) systemService);
                int size3 = arrayListD2 != null ? arrayListD2.size() : i3;
                strD0 = ke0.D0(vl.t0(new String[]{allPendingJobs.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str5, size3 != 0 ? size3 + " from WorkManager in the default namespace" : null}), ",\n", null, null, null, 62);
            }
        } else {
            ArrayList arrayListD3 = d(context, ks1.a(context));
            if (arrayListD3 != null) {
                strD0 = arrayListD3.size() + " jobs from WorkManager";
            }
        }
        StringBuilder sb = new StringBuilder("JobScheduler ");
        sb.append(i8);
        sb.append(" job limit exceeded.\nIn JobScheduler there are ");
        sb.append(strD0);
        sb.append(".\nThere are ");
        sb.append(size);
        sb.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
        String strP = fq2.p(sb, jl0Var.k, '.');
        v72.f().d(str3, strP);
        throw new IllegalStateException(strP, illegalStateException);
    }
}
