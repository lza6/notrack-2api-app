package app.template.extension.extension;

import android.app.AppOpsManager;
import android.app.UiModeManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import app.template.extension.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class UniversalPatchHelper {
    private static final String GENERIC_DARK_CSS = "html,body{background:#121212!important;color:#e8eaed!important;color-scheme:dark!important;}body *{border-color:#303134!important;}input,textarea,select,button{background:#1f1f1f!important;color:#e8eaed!important;border-color:#3c4043!important;}a{color:#8ab4f8!important;}table,thead,tbody,tr,td,th{background-color:transparent!important;color:#e8eaed!important;}pre,code{background:#1f1f1f!important;color:#f1f3f4!important;}dialog,[role=dialog],.modal,.popup,.popover{background:#1f1f1f!important;color:#e8eaed!important;}img,video,canvas,svg,picture{filter:none!important;background:transparent!important;}";

    public static void addWindowFlags(Window window, int i) {
        if (window != null) {
            window.addFlags(i & (-8193));
        }
    }

    public static boolean bindService(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        if (intent != null) {
            String str = String.valueOf(intent.getAction()).toLowerCase() + " " + String.valueOf(intent.getPackage()).toLowerCase() + " " + String.valueOf(intent).toLowerCase();
            if (str.contains("integrity") || str.contains("playcore.integrity")) {
                return false;
            }
        }
        return context.bindService(intent, serviceConnection, i);
    }

    public static int checkOp(AppOpsManager appOpsManager, int i, int i2, String str) {
        return i == 58 ? 2 : 0;
    }

    public static int checkOp(AppOpsManager appOpsManager, String str, int i, String str2) {
        if ("android:mock_location".equals(str)) {
            return 2;
        }
        return appOpsManager.checkOp(str, i, str2);
    }

    public static int checkOpNoThrow(AppOpsManager appOpsManager, int i, int i2, String str) {
        return i == 58 ? 2 : 0;
    }

    public static int checkOpNoThrow(AppOpsManager appOpsManager, String str, int i, String str2) {
        if ("android:mock_location".equals(str)) {
            return 2;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    public static NetworkInfo.DetailedState connectedDetailedState(NetworkInfo.DetailedState detailedState) {
        return NetworkInfo.DetailedState.CONNECTED;
    }

    public static NetworkInfo.State connectedState(NetworkInfo.State state) {
        return NetworkInfo.State.CONNECTED;
    }

    public static void enableWebViewDarkMode(final WebView webView) {
        if (webView == null) {
            return;
        }
        try {
            WebSettings settings = webView.getSettings();
            if (settings != null) {
                try {
                    WebSettings.class.getMethod("setForceDark", Integer.TYPE).invoke(settings, 2);
                } catch (Throwable unused) {
                }
                WebSettings.class.getMethod("setAlgorithmicDarkeningAllowed", Boolean.TYPE).invoke(settings, true);
            }
        } catch (Throwable unused2) {
        }
        try {
            webView.post(new Runnable() { // from class: app.template.extension.extension.UniversalPatchHelper.1
                @Override // java.lang.Runnable
                public void run() {
                    String strReplace = UniversalPatchHelper.GENERIC_DARK_CSS.replace("\\", "\\\\").replace("'", "\\'");
                    webView.evaluateJavascript("(function(){var id='morphe-universal-dark';var s=document.getElementById(id);if(!s){s=document.createElement('style');s.id=id;(document.head||document.documentElement).appendChild(s);}s.textContent='" + strReplace + "';})();", null);
                }
            });
        } catch (Throwable unused3) {
        }
    }

    public static void forceDarkTheme(Context context) {
        try {
            Class.forName("androidx.appcompat.app.AppCompatDelegate").getMethod("setDefaultNightMode", Integer.TYPE).invoke(null, 2);
        } catch (Throwable unused) {
        }
        if (context != null) {
            try {
                Object systemService = context.getSystemService("uimode");
                if (systemService instanceof UiModeManager) {
                    ((UiModeManager) systemService).setApplicationNightMode(2);
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public static int forceNightMode(int i) {
        return 2;
    }

    public static int forceUiModeNightYes(int i) {
        return (i & (-49)) | 32;
    }

    public static int getSettingsGlobalInt(ContentResolver contentResolver, String str) throws Settings.SettingNotFoundException {
        if ("adb_enabled".equals(str) || "development_settings_enabled".equals(str)) {
            return 0;
        }
        return Settings.Global.getInt(contentResolver, str);
    }

    public static int getSettingsGlobalInt(ContentResolver contentResolver, String str, int i) {
        if ("adb_enabled".equals(str) || "development_settings_enabled".equals(str)) {
            return 0;
        }
        return Settings.Global.getInt(contentResolver, str, i);
    }

    public static float getSettingsSecureFloat(ContentResolver contentResolver, String str) throws Settings.SettingNotFoundException {
        if ("mock_location".equals(str)) {
            return 0.0f;
        }
        return Settings.Secure.getFloat(contentResolver, str);
    }

    public static float getSettingsSecureFloat(ContentResolver contentResolver, String str, float f) {
        if ("mock_location".equals(str)) {
            return 0.0f;
        }
        return Settings.Secure.getFloat(contentResolver, str, f);
    }

    public static int getSettingsSecureInt(ContentResolver contentResolver, String str) throws Settings.SettingNotFoundException {
        if ("mock_location".equals(str)) {
            return 0;
        }
        return Settings.Secure.getInt(contentResolver, str);
    }

    public static int getSettingsSecureInt(ContentResolver contentResolver, String str, int i) {
        if ("mock_location".equals(str)) {
            return 0;
        }
        return Settings.Secure.getInt(contentResolver, str, i);
    }

    public static long getSettingsSecureLong(ContentResolver contentResolver, String str) throws Settings.SettingNotFoundException {
        if ("mock_location".equals(str)) {
            return 0L;
        }
        return Settings.Secure.getLong(contentResolver, str);
    }

    public static long getSettingsSecureLong(ContentResolver contentResolver, String str, long j) {
        if ("mock_location".equals(str)) {
            return 0L;
        }
        return Settings.Secure.getLong(contentResolver, str, j);
    }

    public static String getSettingsSecureString(ContentResolver contentResolver, String str) {
        return "mock_location".equals(str) ? "0" : Settings.Secure.getString(contentResolver, str);
    }

    public static boolean hasCapability(NetworkCapabilities networkCapabilities, int i) {
        if (i == 15) {
            return true;
        }
        return networkCapabilities != null && networkCapabilities.hasCapability(i);
    }

    public static boolean hasTransport(NetworkCapabilities networkCapabilities, int i) {
        return (i == 4 || networkCapabilities == null || !networkCapabilities.hasTransport(i)) ? false : true;
    }

    public static String hideProxyProperty(String str, String str2) {
        if ("http.proxyHost".equals(str) || "https.proxyHost".equals(str) || "socksProxyHost".equals(str)) {
            return BuildConfig.VERSION_NAME;
        }
        return ("http.proxyPort".equals(str) || "https.proxyPort".equals(str) || "socksProxyPort".equals(str)) ? "-1" : str2;
    }

    public static String hideVpnInterfaceName(String str) {
        if (str == null) {
            return null;
        }
        return str.matches("^(tun[0-9]+|ppp[0-9]+).*") ? BuildConfig.VERSION_NAME : str;
    }

    public static String hideVpnNetworkName(String str) {
        return "VPN".equalsIgnoreCase(str) ? "WIFI" : str;
    }

    public static int hideVpnNetworkType(int i) {
        if (i == 17) {
            return 1;
        }
        return i;
    }

    public static String normalizeLocationProvider(String str) {
        return normalizeLocationProvider(str, "gps");
    }

    public static String normalizeLocationProvider(String str, String str2) {
        if (str == null) {
            return null;
        }
        if ("gps".equals(str) || "network".equals(str) || "passive".equals(str) || "fused".equals(str)) {
            return str;
        }
        return ("network".equals(str2) || "passive".equals(str2) || "fused".equals(str2)) ? str2 : "gps";
    }

    public static Bundle patchLocationExtras(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        bundle2.remove("mockLocation");
        bundle2.remove("isFromMockProvider");
        bundle2.remove("is_mock");
        bundle2.remove("mock_location");
        bundle2.putBoolean("mockLocation", false);
        return bundle2;
    }

    public static AudioAttributes.Builder setAllowedCapturePolicy(AudioAttributes.Builder builder, int i) {
        if (builder == null) {
            return null;
        }
        return builder.setAllowedCapturePolicy(1);
    }

    public static void setAllowedCapturePolicy(AudioManager audioManager, int i) {
        if (audioManager != null) {
            audioManager.setAllowedCapturePolicy(1);
        }
    }

    public static void setWindowFlags(Window window, int i, int i2) {
        if (window != null) {
            window.setFlags(i & (-8193), i2 & (-8193));
        }
    }

    public static String spoofAndroidId(String str, String str2, String str3) {
        return "android_id".equals(str) ? str3 : str2;
    }
}
