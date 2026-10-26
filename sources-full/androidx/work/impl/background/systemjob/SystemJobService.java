package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import defpackage.dn3;
import defpackage.fp1;
import defpackage.fq2;
import defpackage.h51;
import defpackage.nr0;
import defpackage.og;
import defpackage.pg;
import defpackage.tz2;
import defpackage.u41;
import defpackage.v72;
import defpackage.vh4;
import defpackage.wh4;
import defpackage.zf3;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements h51 {
    public static final String m = v72.h("SystemJobService");
    public wh4 c;
    public final HashMap d = new HashMap();
    public final nr0 h = new nr0(4);
    public fp1 l;

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        u41.r(fq2.n("Cannot invoke ", str, " on a background thread"));
    }

    public static vh4 b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new vh4(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.h51
    public final void d(vh4 vh4Var, boolean z) {
        a("onExecuted");
        v72.f().c(m, vh4Var.a + " executed on JobScheduler");
        JobParameters jobParameters = (JobParameters) this.d.remove(vh4Var);
        this.h.c(vh4Var);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            wh4 wh4VarA = wh4.a(getApplicationContext());
            this.c = wh4VarA;
            tz2 tz2Var = wh4VarA.f;
            this.l = new fp1(tz2Var, wh4VarA.d);
            tz2Var.a(this);
        } catch (IllegalStateException e) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
            v72.f().i(m, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        wh4 wh4Var = this.c;
        if (wh4Var != null) {
            wh4Var.f.f(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        wh4 wh4Var = this.c;
        String str = m;
        if (wh4Var == null) {
            v72.f().c(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        vh4 vh4VarB = b(jobParameters);
        if (vh4VarB == null) {
            v72.f().d(str, "WorkSpec id not found!");
            return false;
        }
        HashMap map = this.d;
        if (map.containsKey(vh4VarB)) {
            v72.f().c(str, "Job is already being executed by SystemJobService: " + vh4VarB);
            return false;
        }
        v72.f().c(str, "onStartJob for " + vh4VarB);
        map.put(vh4VarB, jobParameters);
        zf3 zf3Var = new zf3(11);
        if (jobParameters.getTriggeredContentUris() != null) {
            Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            og.e(jobParameters);
        }
        this.l.o(this.h.f(vh4VarB), zf3Var);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        a("onStopJob");
        if (this.c == null) {
            v72.f().c(m, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        vh4 vh4VarB = b(jobParameters);
        if (vh4VarB == null) {
            v72.f().d(m, "WorkSpec id not found!");
            return false;
        }
        v72.f().c(m, "onStopJob for " + vh4VarB);
        this.d.remove(vh4VarB);
        dn3 dn3VarC = this.h.c(vh4VarB);
        if (dn3VarC != null) {
            int iC = Build.VERSION.SDK_INT >= 31 ? pg.c(jobParameters) : -512;
            fp1 fp1Var = this.l;
            fp1Var.getClass();
            fp1Var.p(dn3VarC, iC);
        }
        tz2 tz2Var = this.c.f;
        String str = vh4VarB.a;
        synchronized (tz2Var.k) {
            zContains = tz2Var.i.contains(str);
        }
        return !zContains;
    }
}
