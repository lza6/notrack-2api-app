package com.pairip.licensecheck;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class LicenseClient$$ExternalSyntheticLambda11 implements Runnable {
    public final /* synthetic */ LicenseClient f$0;
    public final /* synthetic */ RepeatedCheckMetadata f$1;
    public final /* synthetic */ Bundle f$2;

    public /* synthetic */ LicenseClient$$ExternalSyntheticLambda11(LicenseClient licenseClient, RepeatedCheckMetadata repeatedCheckMetadata, Bundle bundle) {
        this.f$0 = licenseClient;
        this.f$1 = repeatedCheckMetadata;
        this.f$2 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.lambda$processResponse$0(this.f$1, this.f$2);
    }
}
