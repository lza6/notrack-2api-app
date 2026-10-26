package com.pairip.application;

import android.content.Context;
import app.template.extension.extension.SignatureHookApp;
import com.pairip.licensecheck.LicenseClient;

/* JADX INFO: loaded from: classes.dex */
public class Application extends SignatureHookApp {
    @Override // app.template.extension.extension.SignatureHookApp, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        LicenseClient.checkLicense(context);
        super.attachBaseContext(context);
    }
}
