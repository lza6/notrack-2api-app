package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import defpackage.ca4;
import defpackage.ci4;
import defpackage.g64;
import defpackage.mz2;
import defpackage.vo;
import defpackage.x94;
import defpackage.z6;

/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        g64.b(context);
        ci4 ci4VarA = vo.a();
        ci4VarA.I(queryParameter);
        ci4VarA.l = mz2.b(iIntValue);
        if (queryParameter2 != null) {
            ci4VarA.h = Base64.decode(queryParameter2, 0);
        }
        ca4 ca4Var = g64.a().d;
        ca4Var.e.execute(new x94(ca4Var, ci4VarA.o(), i, new z6()));
    }
}
