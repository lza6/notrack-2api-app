package defpackage;

import ai.notrack.app.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.Iterator;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public abstract class wf1 {
    public static final int a;

    static {
        int i = ag1.c;
        a = 12451000;
    }

    public Intent a(int i, Context context, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && gm4.I(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                tu tuVarA = ej4.a(context);
                sb.append(tuVarA.a.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:105:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:112:0x0210  */
    /* JADX WARN: Code duplicated, block: B:121:0x0231  */
    /* JADX WARN: Code duplicated, block: B:122:0x0233  */
    /* JADX WARN: Code duplicated, block: B:159:0x0214 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:98:0x0197  */
    /* JADX WARN: Instruction removed from duplicated block: B:103:0x01ba, please report this as an issue */
    public int b(Context context, int i) {
        boolean z;
        PackageInfo packageInfo;
        int i2;
        int i3;
        ApplicationInfo applicationInfo;
        int i4 = ag1.c;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        boolean z2 = true;
        if (!"com.google.android.gms".equals(context.getPackageName()) && !ag1.b.get()) {
            synchronized (gm4.k) {
                try {
                    if (!gm4.l) {
                        gm4.l = true;
                        try {
                            Bundle bundle = ej4.a(context).a.getPackageManager().getApplicationInfo(context.getPackageName(), Uuid.SIZE_BITS).metaData;
                            if (bundle != null) {
                                bundle.getString("com.google.app.id");
                                gm4.m = bundle.getInt("com.google.android.gms.version");
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i5 = gm4.m;
            if (i5 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i5 != 12451000) {
                int i6 = a;
                StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 104 + String.valueOf(i5).length() + 194);
                sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb.append(i6);
                sb.append(" but found ");
                sb.append(i5);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new GooglePlayServicesIncorrectManifestValueException(sb.toString());
            }
        }
        if (gm4.I(context)) {
            z = false;
        } else {
            if (gm4.p == null) {
                gm4.p = Boolean.valueOf(sf3.J() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
            }
            if (gm4.p.booleanValue()) {
                z = false;
            } else {
                z = true;
            }
        }
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        int i7 = 9;
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", Build.VERSION.SDK_INT >= 28 ? 134225984 : 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
            synchronized (bg1.class) {
                if (bg1.d == null) {
                    do4 do4Var = ls4.a;
                    synchronized (ls4.class) {
                        if (ls4.c == null) {
                            ls4.c = context.getApplicationContext();
                        } else {
                            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                        }
                    }
                    bg1 bg1Var = new bg1(0);
                    context.getApplicationContext();
                    bg1.d = bg1Var;
                }
            }
            if (!bg1.g(packageInfo2)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else if (z) {
                g13.s(packageInfo);
                if (!bg1.g(packageInfo)) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                } else if (z || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    i2 = packageInfo2.versionCode;
                    if (i2 == -1) {
                        i3 = -1;
                    } else {
                        i3 = i2 / 1000;
                    }
                    if (i3 < (i != -1 ? i / 1000 : -1)) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i).length() + 11 + String.valueOf(i2).length());
                        sb2.append("Google Play services out of date for ");
                        sb2.append(packageName);
                        sb2.append(".  Requires ");
                        sb2.append(i);
                        sb2.append(" but found ");
                        sb2.append(i2);
                        Log.w("GooglePlayServicesUtil", sb2.toString());
                        i7 = 2;
                    } else {
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException e2) {
                                Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e2);
                                i7 = 1;
                            }
                        }
                        if (applicationInfo.enabled) {
                            i7 = 0;
                        } else {
                            i7 = 3;
                        }
                    }
                } else {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                }
            } else if (z) {
                i2 = packageInfo2.versionCode;
                if (i2 == -1) {
                    i3 = -1;
                } else {
                    i3 = i2 / 1000;
                }
                if (i3 < (i != -1 ? i / 1000 : -1)) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i).length() + 11 + String.valueOf(i2).length());
                    sb3.append("Google Play services out of date for ");
                    sb3.append(packageName);
                    sb3.append(".  Requires ");
                    sb3.append(i);
                    sb3.append(" but found ");
                    sb3.append(i2);
                    Log.w("GooglePlayServicesUtil", sb3.toString());
                    i7 = 2;
                } else {
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    }
                    if (applicationInfo.enabled) {
                        i7 = 3;
                    } else {
                        i7 = 0;
                    }
                }
            } else {
                i2 = packageInfo2.versionCode;
                if (i2 == -1) {
                    i3 = -1;
                } else {
                    i3 = i2 / 1000;
                }
                if (i3 < (i != -1 ? i / 1000 : -1)) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i).length() + 11 + String.valueOf(i2).length());
                    sb4.append("Google Play services out of date for ");
                    sb4.append(packageName);
                    sb4.append(".  Requires ");
                    sb4.append(i);
                    sb4.append(" but found ");
                    sb4.append(i2);
                    Log.w("GooglePlayServicesUtil", sb4.toString());
                    i7 = 2;
                } else {
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    }
                    if (applicationInfo.enabled) {
                        i7 = 3;
                    } else {
                        i7 = 0;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
        }
        if (i7 != 18) {
            if (i7 == 1) {
                try {
                    Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                    while (it.hasNext()) {
                        if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                        }
                    }
                    z2 = context.getPackageManager().getApplicationInfo("com.google.android.gms", ConstantsKt.DEFAULT_BUFFER_SIZE).enabled;
                } catch (PackageManager.NameNotFoundException | Exception unused4) {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
        }
        if (z2) {
            return 18;
        }
        return i7;
    }
}
