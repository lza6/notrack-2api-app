package app.template.extension.extension;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.widget.Toast;

/* JADX INFO: loaded from: classes.dex */
public class GmsCoreSupportPatch {
    public static void checkGmsCore(Activity activity) {
        checkGmsCore((Context) activity);
    }

    public static void checkGmsCore(Context context) {
        try {
            String originalPackageName = getOriginalPackageName();
            if (originalPackageName == null || !originalPackageName.equals(context.getPackageName())) {
                String gmsCoreVendorGroupId = getGmsCoreVendorGroupId();
                if (!gmsCoreVendorGroupId.endsWith(".android.gms")) {
                    gmsCoreVendorGroupId = gmsCoreVendorGroupId + ".android.gms";
                }
                try {
                    context.getPackageManager().getPackageInfo(gmsCoreVendorGroupId, 1);
                } catch (PackageManager.NameNotFoundException unused) {
                    Toast.makeText(context, "MicroG / GmsCore (" + gmsCoreVendorGroupId + ") is not installed. Google sign-in will not work.", 1).show();
                }
            }
        } catch (Exception unused2) {
        }
    }

    private static String getGmsCoreVendorGroupId() {
        return "app.revanced";
    }

    private static String getOriginalPackageName() {
        return null;
    }
}
