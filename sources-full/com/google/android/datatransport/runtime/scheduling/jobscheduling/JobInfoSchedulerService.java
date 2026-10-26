package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import defpackage.ba;
import defpackage.ca4;
import defpackage.ci4;
import defpackage.g64;
import defpackage.mz2;
import defpackage.vo;
import defpackage.x94;

/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int c = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        g64.b(getApplicationContext());
        ci4 ci4VarA = vo.a();
        ci4VarA.I(string);
        ci4VarA.l = mz2.b(i);
        if (string2 != null) {
            ci4VarA.h = Base64.decode(string2, 0);
        }
        ca4 ca4Var = g64.a().d;
        ca4Var.e.execute(new x94(ca4Var, ci4VarA.o(), i2, new ba(this, 8, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
