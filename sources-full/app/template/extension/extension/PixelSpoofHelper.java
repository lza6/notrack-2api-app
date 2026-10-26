package app.template.extension.extension;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import app.template.extension.BuildConfig;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class PixelSpoofHelper {
    private static final String BASEBAND = "g5400i-260317-260429-B-15308590";
    private static final String BOOTLOADER = "deepspace-17.2-15372054";
    private static final String BRAND = "google";
    private static final String BUILD_DATE = "Fri May 15 15:38:48 PDT 2026";
    private static final String BUILD_UUID = "Pp8difaf-KKDmY-2rNwgGVP0L-Oy5ujwsPvXWqUJuoo";
    private static final String CLIENT_ID = "android-google";
    private static final String DESCRIPTION = "mustang-user 17 CP2A.260605.012 15430684 release-keys";
    private static final String DEVICE = "mustang";
    private static final String FINGERPRINT = "google/mustang/mustang:17/CP2A.260605.012/15430684:user/release-keys";
    private static final String FIRST_API_LEVEL = "37";
    private static final String ID = "CP2A.260605.012";
    private static final String INCREMENTAL = "15430684";
    private static final String MANUFACTURER = "Google";
    private static final String MODEL = "Pixel 10 Pro XL";
    private static final String PHOTOS_BOOTLOADER = "unknown";
    private static final String PHOTOS_DESCRIPTION = "marlin-user 10 QP1A.191005.007.A3 5972272 release-keys";
    private static final String PHOTOS_DEVICE = "marlin";
    private static final String PHOTOS_FINGERPRINT = "google/marlin/marlin:10/QP1A.191005.007.A3/5972272:user/release-keys";
    private static final String PHOTOS_FIRST_API_LEVEL = "25";
    private static final String PHOTOS_ID = "QP1A.191005.007.A3";
    private static final String PHOTOS_INCREMENTAL = "5972272";
    private static final String PHOTOS_MODEL = "Pixel XL";
    private static final String PHOTOS_PLATFORM = "msm8996";
    private static final String PHOTOS_PRODUCT = "marlin";
    private static final String PHOTOS_RELEASE = "10";
    private static final int PHOTOS_SDK_INT = 29;
    private static final String PHOTOS_SECURITY_PATCH = "2019-10-05";
    private static final String PHOTOS_SOC_MODEL = "MSM8996";
    private static final long PHOTOS_TIME = 1570233600000L;
    private static final String PHOTOS_TIME_SEC = "1570233600";
    private static final String PLATFORM = "laguna";
    private static final String PRODUCT = "mustang";
    private static final String RELEASE = "17";
    private static final String SDK_FULL = "37.0";
    private static final int SDK_INT = 37;
    private static final String SECURITY_PATCH = "2026-06-05";
    private static final String SERIAL = "39061FDJG000Q8";
    private static final String SOC_MANUFACTURER = "Google";
    private static final String SOC_MODEL = "Tensor G5";
    private static final long TIME = 1778884728000L;
    private static final String TIME_SEC = "1778884728";
    private static volatile boolean initialized;
    private static volatile boolean photosMode;
    private static final Set<String> PIXEL_FEATURES = new HashSet();
    private static final Set<String> PHOTOS_ENABLE_FEATURES = new HashSet();
    private static final Set<String> PHOTOS_DISABLE_FEATURES = new HashSet();

    private static final class FeatureHandler implements InvocationHandler {
        private final Object original;

        FeatureHandler(Object obj) {
            this.original = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            Boolean boolForcedFeatureValue;
            String name = method.getName();
            if ("hasSystemFeature".equals(name) && objArr != null && objArr.length > 0 && (boolForcedFeatureValue = PixelSpoofHelper.forcedFeatureValue(String.valueOf(objArr[0]))) != null) {
                return boolForcedFeatureValue;
            }
            try {
                Object objInvoke = method.invoke(this.original, objArr);
                return ("getSystemAvailableFeatures".equals(name) && (objInvoke instanceof FeatureInfo[])) ? PixelSpoofHelper.addPixelFeatures((FeatureInfo[]) objInvoke) : objInvoke;
            } catch (InvocationTargetException e) {
                throw e.getTargetException();
            }
        }
    }

    static {
        String[] strArr = {"com.google.android.feature.PIXEL_EXPERIENCE", "com.google.android.feature.TURBO_PRELOAD", "com.google.android.feature.WELLBEING", "com.google.android.feature.D2D_CABLE_MIGRATION_FEATURE", "com.google.android.feature.PIXEL_2017_EXPERIENCE", "com.google.android.feature.PIXEL_2018_EXPERIENCE", "com.google.android.feature.PIXEL_2019_EXPERIENCE", "com.google.android.feature.PIXEL_2019_MIDYEAR_EXPERIENCE", "com.google.android.feature.PIXEL_2020_EXPERIENCE", "com.google.android.feature.PIXEL_2020_MIDYEAR_EXPERIENCE", "com.google.android.feature.PIXEL_2021_EXPERIENCE", "com.google.android.feature.PIXEL_2021_MIDYEAR_EXPERIENCE", "com.google.android.feature.PIXEL_2022_EXPERIENCE", "com.google.android.feature.PIXEL_2022_MIDYEAR_EXPERIENCE", "com.google.android.feature.PIXEL_2023_EXPERIENCE", "com.google.android.feature.PIXEL_2023_MIDYEAR_EXPERIENCE", "com.google.android.feature.PIXEL_2024_EXPERIENCE", "com.google.android.feature.PIXEL_2024_MIDYEAR_EXPERIENCE", "com.google.android.feature.PIXEL_2025_EXPERIENCE", "com.google.android.feature.PIXEL_2025_MIDYEAR_EXPERIENCE", "com.google.android.feature.GOOGLE_BUILD", "com.google.android.feature.GOOGLE_EXPERIENCE", "com.google.android.feature.GOOGLE_CAMERA_EXPERIENCE", "com.google.android.feature.QUICK_TAP", "com.google.android.feature.NOW_PLAYING_APP_26Q1", "com.google.android.feature.NEXT_GENERATION_ASSISTANT", "com.google.android.feature.GEMINI_EXPERIENCE", "com.google.android.feature.AMBIENT_DATA", "com.google.android.feature.CONTEXTUAL_SEARCH", "com.google.android.feature.CONTEXTUAL_SEARCH_LIVE_TRANSLATE", "com.android.systemui.SUPPORTS_DRAG_ASSISTANT_TO_SPLIT"};
        for (int i = 0; i < 31; i++) {
            PIXEL_FEATURES.add(strArr[i]);
        }
        String[] strArr2 = {"com.google.android.apps.photos.NEXUS_PRELOAD", "com.google.android.apps.photos.nexus_preload", "com.google.android.feature.PIXEL_EXPERIENCE", "com.google.android.apps.photos.PIXEL_PRELOAD", "com.google.android.apps.photos.PIXEL_2016_PRELOAD"};
        for (int i2 = 0; i2 < 5; i2++) {
            PHOTOS_ENABLE_FEATURES.add(strArr2[i2]);
        }
        String[] strArr3 = {"com.google.android.apps.photos.PIXEL_2017_PRELOAD", "com.google.android.apps.photos.PIXEL_2018_PRELOAD", "com.google.android.apps.photos.PIXEL_2019_MIDYEAR_PRELOAD", "com.google.android.apps.photos.PIXEL_2019_PRELOAD", "com.google.android.feature.PIXEL_2020_MIDYEAR_EXPERIENCE", "com.google.android.feature.PIXEL_2020_EXPERIENCE", "com.google.android.feature.PIXEL_2021_MIDYEAR_EXPERIENCE", "com.google.android.feature.PIXEL_2021_EXPERIENCE", "com.google.android.feature.PIXEL_2022_MIDYEAR_EXPERIENCE", "com.google.android.feature.PIXEL_2022_EXPERIENCE", "com.google.android.feature.PIXEL_2023_MIDYEAR_EXPERIENCE", "com.google.android.feature.PIXEL_2023_EXPERIENCE", "com.google.android.feature.PIXEL_2024_MIDYEAR_EXPERIENCE", "com.google.android.feature.PIXEL_2024_EXPERIENCE", "com.google.android.feature.PIXEL_2025_MIDYEAR_EXPERIENCE", "com.google.android.feature.PIXEL_2025_EXPERIENCE", "com.google.android.feature.PIXEL_2026_MIDYEAR_EXPERIENCE", "com.google.android.feature.PIXEL_2026_EXPERIENCE", "com.google.android.feature.PIXEL_2027_MIDYEAR_EXPERIENCE"};
        for (int i3 = 0; i3 < 19; i3++) {
            PHOTOS_DISABLE_FEATURES.add(strArr3[i3]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FeatureInfo[] addPixelFeatures(FeatureInfo[] featureInfoArr) {
        Set<String> set = photosMode ? PHOTOS_ENABLE_FEATURES : PIXEL_FEATURES;
        HashSet hashSet = new HashSet();
        int i = 0;
        for (FeatureInfo featureInfo : featureInfoArr) {
            if (featureInfo == null || featureInfo.name == null) {
                i++;
            } else if (!photosMode || !PHOTOS_DISABLE_FEATURES.contains(featureInfo.name)) {
                hashSet.add(featureInfo.name);
                i++;
            }
        }
        Iterator<String> it = set.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (!hashSet.contains(it.next())) {
                i2++;
            }
        }
        FeatureInfo[] featureInfoArr2 = (FeatureInfo[]) Array.newInstance((Class<?>) FeatureInfo.class, i + i2);
        int i3 = 0;
        for (FeatureInfo featureInfo2 : featureInfoArr) {
            if (featureInfo2 == null || featureInfo2.name == null || !photosMode || !PHOTOS_DISABLE_FEATURES.contains(featureInfo2.name)) {
                featureInfoArr2[i3] = featureInfo2;
                i3++;
            }
        }
        for (String str : set) {
            if (!hashSet.contains(str)) {
                FeatureInfo featureInfo3 = new FeatureInfo();
                featureInfo3.name = str;
                featureInfoArr2[i3] = featureInfo3;
                i3++;
            }
        }
        return featureInfoArr2;
    }

    private static String bootloader() {
        return photosMode ? PHOTOS_BOOTLOADER : BOOTLOADER;
    }

    private static long buildTime() {
        return photosMode ? PHOTOS_TIME : TIME;
    }

    private static String description() {
        return photosMode ? PHOTOS_DESCRIPTION : DESCRIPTION;
    }

    private static String device() {
        return photosMode ? "marlin" : "mustang";
    }

    private static void exemptHiddenApis() {
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                Class.forName("org.lsposed.hiddenapibypass.HiddenApiBypass").getMethod("addHiddenApiExemptions", String[].class).invoke(null, new String[]{"L"});
            }
        } catch (Throwable unused) {
        }
    }

    private static String fingerprint() {
        return photosMode ? PHOTOS_FINGERPRINT : FINGERPRINT;
    }

    private static String firstApiLevel() {
        return photosMode ? PHOTOS_FIRST_API_LEVEL : FIRST_API_LEVEL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Boolean forcedFeatureValue(String str) {
        if (str == null) {
            return null;
        }
        if (!photosMode) {
            if (PIXEL_FEATURES.contains(str)) {
                return Boolean.TRUE;
            }
            return null;
        }
        if (PHOTOS_ENABLE_FEATURES.contains(str)) {
            return Boolean.TRUE;
        }
        if (PHOTOS_DISABLE_FEATURES.contains(str)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static String getSystemProperty(String str, String str2) {
        if (str != null) {
            if ("ro.soc.model".equals(str)) {
                return socModel();
            }
            if ("ro.soc.manufacturer".equals(str)) {
                return "Google";
            }
            if (str.endsWith(".model") || "ro.product.model".equals(str) || "ro.product.model_for_attestation".equals(str)) {
                return model();
            }
            if (str.endsWith(".device") || "ro.product.device".equals(str) || "ro.product.device_for_attestation".equals(str)) {
                return device();
            }
            if (str.endsWith(".name") || "ro.product.name".equals(str) || "ro.product.name_for_attestation".equals(str)) {
                return product();
            }
            if (str.endsWith(".brand") || "ro.product.brand".equals(str) || "ro.product.brand_for_attestation".equals(str)) {
                return BRAND;
            }
            if (str.endsWith(".manufacturer") || "ro.product.manufacturer".equals(str) || "ro.product.manufacturer_for_attestation".equals(str)) {
                return "Google";
            }
            if (str.endsWith(".board") || "ro.product.board".equals(str)) {
                return device();
            }
            if (str.endsWith(".build.fingerprint") || "ro.build.fingerprint".equals(str)) {
                return fingerprint();
            }
            if (str.endsWith(".build.id") || "ro.build.id".equals(str)) {
                return id();
            }
            if (str.endsWith(".build.tags") || "ro.build.tags".equals(str)) {
                return "release-keys";
            }
            if (str.endsWith(".build.type") || "ro.build.type".equals(str)) {
                return "user";
            }
            if ("ro.build.user".equals(str)) {
                return "android-build";
            }
            if ("ro.build.host".equals(str)) {
                return "bcb8c9bcce95";
            }
            if ("ro.board.platform".equals(str)) {
                return platform();
            }
            if ("ro.bootloader".equals(str) || "ro.build.expect.bootloader".equals(str)) {
                return bootloader();
            }
            if ("ro.build.description".equals(str)) {
                return description();
            }
            if (str.startsWith("ro.com.google.clientidbase")) {
                return CLIENT_ID;
            }
            if ("ro.opa.eligible_device".equals(str)) {
                return "true";
            }
            if (str.endsWith(".build.version.release") || "ro.build.version.release_or_codename".equals(str)) {
                return release();
            }
            if (str.endsWith(".build.version.sdk")) {
                return String.valueOf(sdkInt());
            }
            if (str.endsWith(".build.version.security_patch")) {
                return securityPatch();
            }
            if (str.endsWith(".build.version.incremental")) {
                return incremental();
            }
            if ("ro.product.first_api_level".equals(str)) {
                return firstApiLevel();
            }
            if ("ro.build.characteristics".equals(str)) {
                return "nosdcard";
            }
            if (str.endsWith(".build.version.sdk_full")) {
                return SDK_FULL;
            }
            if (str.endsWith(".build.uuid")) {
                return BUILD_UUID;
            }
            if (str.endsWith(".build.date")) {
                return BUILD_DATE;
            }
            if (str.endsWith(".build.date.utc")) {
                return timeSec();
            }
            if (str.contains("baseband")) {
                return BASEBAND;
            }
            if (str.endsWith(".cpu.abilist")) {
                return "arm64-v8a";
            }
            if (str.endsWith(".cpu.abilist32")) {
                return BuildConfig.VERSION_NAME;
            }
            if (str.endsWith(".cpu.abilist64")) {
                return "arm64-v8a";
            }
            if ("ro.build.flavor".equals(str)) {
                return device() + "-user";
            }
            if ("ro.serialno".equals(str) || "ro.boot.serialno".equals(str)) {
                return SERIAL;
            }
        }
        return str2;
    }

    public static boolean getSystemPropertyBoolean(String str, boolean z) {
        if (str != null && "ro.opa.eligible_device".equals(str)) {
            return true;
        }
        return z;
    }

    public static int getSystemPropertyInt(String str, int i) {
        if (str != null) {
            if ("ro.build.version.sdk".equals(str) || str.endsWith(".build.version.sdk")) {
                return sdkInt();
            }
            if ("ro.product.first_api_level".equals(str)) {
                return Integer.parseInt(firstApiLevel());
            }
        }
        return i;
    }

    public static long getSystemPropertyLong(String str, long j) {
        return (str != null && ("ro.build.date.utc".equals(str) || str.endsWith(".build.date.utc"))) ? Long.parseLong(timeSec()) : j;
    }

    public static boolean hasPixelSystemFeature(String str, boolean z) {
        Boolean boolForcedFeatureValue = forcedFeatureValue(str);
        return boolForcedFeatureValue != null ? boolForcedFeatureValue.booleanValue() : z;
    }

    private static String id() {
        return photosMode ? PHOTOS_ID : ID;
    }

    private static String incremental() {
        return photosMode ? PHOTOS_INCREMENTAL : INCREMENTAL;
    }

    public static void init(Context context, String str) {
        if (initialized) {
            return;
        }
        boolean z = true;
        initialized = true;
        photosMode = str != null && str.contains("photos");
        boolean z2 = str == null || str.contains("build");
        if (str != null) {
            str.contains("props");
        }
        if (str != null && !str.contains("features")) {
            z = false;
        }
        exemptHiddenApis();
        if (z2) {
            spoofBuildFields();
        }
        if (!z || context == null) {
            return;
        }
        spoofPackageFeatures(context);
    }

    private static String model() {
        return photosMode ? PHOTOS_MODEL : MODEL;
    }

    private static String platform() {
        return photosMode ? PHOTOS_PLATFORM : PLATFORM;
    }

    private static String product() {
        return photosMode ? "marlin" : "mustang";
    }

    private static String release() {
        return photosMode ? PHOTOS_RELEASE : RELEASE;
    }

    private static int sdkInt() {
        return photosMode ? PHOTOS_SDK_INT : SDK_INT;
    }

    private static String securityPatch() {
        return photosMode ? PHOTOS_SECURITY_PATCH : SECURITY_PATCH;
    }

    private static void setStatic(Class<?> cls, String str, Object obj) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(null, obj);
        } catch (Throwable unused) {
        }
    }

    private static String socModel() {
        return photosMode ? PHOTOS_SOC_MODEL : SOC_MODEL;
    }

    private static void spoofBuildFields() {
        setStatic(Build.class, "DISPLAY", id());
        setStatic(Build.class, "BOOTLOADER", bootloader());
        setStatic(Build.class, "HARDWARE", device());
        setStatic(Build.class, "BOARD", device());
        setStatic(Build.class, "BRAND", BRAND);
        setStatic(Build.class, "DEVICE", device());
        setStatic(Build.class, "PRODUCT", product());
        setStatic(Build.class, "MANUFACTURER", "Google");
        setStatic(Build.class, "MODEL", model());
        setStatic(Build.class, "SERIAL", SERIAL);
        setStatic(Build.class, "SOC_MANUFACTURER", "Google");
        setStatic(Build.class, "SOC_MODEL", socModel());
        setStatic(Build.class, "ID", id());
        setStatic(Build.class, "TIME", Long.valueOf(buildTime()));
        setStatic(Build.class, "TAGS", "release-keys");
        setStatic(Build.class, "TYPE", "user");
        setStatic(Build.class, "USER", "android-build");
        setStatic(Build.class, "HOST", "bcb8c9bcce95");
        setStatic(Build.class, "FINGERPRINT", fingerprint());
        setStatic(Build.class, "SUPPORTED_ABIS", new String[]{"arm64-v8a"});
        setStatic(Build.class, "SUPPORTED_64_BIT_ABIS", new String[]{"arm64-v8a"});
        setStatic(Build.class, "SUPPORTED_32_BIT_ABIS", new String[0]);
        setStatic(Build.VERSION.class, "RELEASE", release());
        setStatic(Build.VERSION.class, "SDK_INT", Integer.valueOf(sdkInt()));
        setStatic(Build.VERSION.class, "SECURITY_PATCH", securityPatch());
        setStatic(Build.VERSION.class, "INCREMENTAL", incremental());
    }

    private static void spoofPackageFeatures(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            Field declaredField = Class.forName("android.app.ApplicationPackageManager").getDeclaredField("mPM");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(packageManager);
            if (obj == null) {
                return;
            }
            Object objNewProxyInstance = Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new FeatureHandler(obj));
            declaredField.set(packageManager, objNewProxyInstance);
            Field declaredField2 = Class.forName("android.app.ActivityThread").getDeclaredField("sPackageManager");
            declaredField2.setAccessible(true);
            declaredField2.set(null, objNewProxyInstance);
        } catch (Throwable unused) {
        }
    }

    private static String timeSec() {
        return photosMode ? PHOTOS_TIME_SEC : TIME_SEC;
    }
}
