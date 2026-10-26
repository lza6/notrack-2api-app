package defpackage;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.ReportFragment$Companion;
import androidx.lifecycle.a;

/* JADX INFO: loaded from: classes.dex */
public final class i32 extends v21 {
    @Override // defpackage.v21, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        int i = a.d;
        ReportFragment$Companion.injectIfNeededIn(activity);
    }
}
