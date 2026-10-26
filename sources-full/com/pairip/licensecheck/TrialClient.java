package com.pairip.licensecheck;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class TrialClient {
    private TrialClient() {
    }

    public static void stopTrial(Context context) {
        LicenseClient.stopTrial(context);
    }
}
