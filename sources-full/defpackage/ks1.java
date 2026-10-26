package defpackage;

import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class ks1 {
    public static final String a = v72.h("SystemJobScheduler");

    public static final JobScheduler a(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("jobscheduler");
        systemService.getClass();
        JobScheduler jobScheduler = (JobScheduler) systemService;
        if (Build.VERSION.SDK_INT < 34) {
            return jobScheduler;
        }
        JobScheduler jobSchedulerForNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        jobSchedulerForNamespace.getClass();
        return jobSchedulerForNamespace;
    }
}
