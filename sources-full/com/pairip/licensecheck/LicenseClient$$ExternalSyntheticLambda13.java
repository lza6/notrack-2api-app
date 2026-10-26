package com.pairip.licensecheck;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class LicenseClient$$ExternalSyntheticLambda13 implements Runnable {
    public final /* synthetic */ LicenseClient f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ LicenseClient$$ExternalSyntheticLambda13(LicenseClient licenseClient, boolean z) {
        this.f$0 = licenseClient;
        this.f$1 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.lambda$retryOrThrow$1(this.f$1);
    }
}
