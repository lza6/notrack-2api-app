package app.template.extension.extension;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import app.template.extension.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.lsposed.hiddenapibypass.HiddenApiBypass;

/* JADX INFO: loaded from: classes.dex */
public class FlightradarHelper {
    public static Object tempFeatures;

    public static void cleanupEmsData(Object obj) {
        if (obj == null) {
            return;
        }
        try {
            Class<?> cls = obj.getClass();
            Field declaredFieldRecursive = getDeclaredFieldRecursive(cls, "hasAirspace");
            Field declaredFieldRecursive2 = getDeclaredFieldRecursive(cls, "airspace");
            if (declaredFieldRecursive != null && declaredFieldRecursive2 != null) {
                declaredFieldRecursive.setAccessible(true);
                declaredFieldRecursive.setBoolean(obj, declaredFieldRecursive2.get(obj) != null);
            }
            Field declaredFieldRecursive3 = getDeclaredFieldRecursive(cls, "hasIas");
            Field declaredFieldRecursive4 = getDeclaredFieldRecursive(cls, "ias");
            if (declaredFieldRecursive3 != null && declaredFieldRecursive4 != null) {
                declaredFieldRecursive3.setAccessible(true);
                declaredFieldRecursive3.setBoolean(obj, declaredFieldRecursive4.get(obj) != null);
            }
            Field declaredFieldRecursive5 = getDeclaredFieldRecursive(cls, "hasTas");
            Field declaredFieldRecursive6 = getDeclaredFieldRecursive(cls, "tas");
            if (declaredFieldRecursive5 != null && declaredFieldRecursive6 != null) {
                declaredFieldRecursive5.setAccessible(true);
                declaredFieldRecursive5.setBoolean(obj, declaredFieldRecursive6.get(obj) != null);
            }
            Field declaredFieldRecursive7 = getDeclaredFieldRecursive(cls, "hasMach");
            Field declaredFieldRecursive8 = getDeclaredFieldRecursive(cls, "mach");
            if (declaredFieldRecursive7 != null && declaredFieldRecursive8 != null) {
                declaredFieldRecursive7.setAccessible(true);
                declaredFieldRecursive7.setBoolean(obj, declaredFieldRecursive8.get(obj) != null);
            }
            Field declaredFieldRecursive9 = getDeclaredFieldRecursive(cls, "hasOat");
            Field declaredFieldRecursive10 = getDeclaredFieldRecursive(cls, "oat");
            if (declaredFieldRecursive9 != null && declaredFieldRecursive10 != null) {
                declaredFieldRecursive9.setAccessible(true);
                declaredFieldRecursive9.setBoolean(obj, declaredFieldRecursive10.get(obj) != null);
            }
            Field declaredFieldRecursive11 = getDeclaredFieldRecursive(cls, "hasWind");
            Field declaredFieldRecursive12 = getDeclaredFieldRecursive(cls, "windSpeed");
            Field declaredFieldRecursive13 = getDeclaredFieldRecursive(cls, "windDirection");
            if (declaredFieldRecursive11 != null && declaredFieldRecursive12 != null && declaredFieldRecursive13 != null) {
                declaredFieldRecursive11.setAccessible(true);
                declaredFieldRecursive11.setBoolean(obj, (declaredFieldRecursive12.get(obj) == null || declaredFieldRecursive13.get(obj) == null) ? false : true);
            }
            Field declaredFieldRecursive14 = getDeclaredFieldRecursive(cls, "hasAgps");
            Field declaredFieldRecursive15 = getDeclaredFieldRecursive(cls, "agps");
            if (declaredFieldRecursive14 == null || declaredFieldRecursive15 == null) {
                return;
            }
            declaredFieldRecursive14.setAccessible(true);
            declaredFieldRecursive14.setBoolean(obj, declaredFieldRecursive15.get(obj) != null);
        } catch (Throwable th) {
            Log.e("FlightradarHelper", "Error in cleanupEmsData", th);
        }
    }

    public static Boolean getAvailability(Boolean bool, Object obj) {
        return Boolean.valueOf(obj != null);
    }

    private static Field getDeclaredFieldRecursive(Class<?> cls, String str) {
        while (cls != null && cls != Object.class) {
            try {
                return cls.getDeclaredField(str);
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    private static byte[] hexStringToByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    public static void init() {
        Log.i("FlightradarHelper", "FlightradarHelper.init() started");
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                HiddenApiBypass.addHiddenApiExemptions("L");
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, null);
            Field declaredField = cls.getDeclaredField("sPackageManager");
            declaredField.setAccessible(true);
            final Object obj = declaredField.get(null);
            if (obj == null) {
                Method declaredMethod2 = cls.getDeclaredMethod("getPackageManager", null);
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(null, null);
            }
            if (declaredField.get(null) == null) {
                return;
            }
            Class<?> cls2 = Class.forName("android.content.pm.IPackageManager");
            final Object objNewProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: app.template.extension.extension.FlightradarHelper.1
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj2, Method method, Object[] objArr) throws Throwable {
                    String name = method.getName();
                    if (("getPackageInfo".equals(name) || "getPackageInfoAsUser".equals(name)) && "com.flightradar24free".equals((String) objArr[0])) {
                        PackageInfo packageInfo = (PackageInfo) method.invoke(obj, objArr);
                        if (packageInfo != null) {
                            FlightradarHelper.spoofPackageInfo(packageInfo);
                        }
                        return packageInfo;
                    }
                    if ((!"getApplicationInfo".equals(name) && !"getApplicationInfoAsUser".equals(name)) || !"com.flightradar24free".equals((String) objArr[0])) {
                        try {
                            return method.invoke(obj, objArr);
                        } catch (InvocationTargetException e) {
                            throw e.getTargetException();
                        }
                    }
                    ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(obj, objArr);
                    if (applicationInfo != null) {
                        FlightradarHelper.spoofApplicationInfo(applicationInfo);
                    }
                    return applicationInfo;
                }
            });
            declaredField.set(null, objNewProxyInstance);
            try {
                Class<?> cls3 = Class.forName("android.os.ServiceManager");
                Field declaredField2 = cls3.getDeclaredField("sCache");
                declaredField2.setAccessible(true);
                Map map = (Map) declaredField2.get(null);
                final IBinder iBinder = (IBinder) cls3.getMethod("getService", String.class).invoke(null, "package");
                if (iBinder != null) {
                    map.put("package", (IBinder) Proxy.newProxyInstance(IBinder.class.getClassLoader(), new Class[]{IBinder.class}, new InvocationHandler() { // from class: app.template.extension.extension.FlightradarHelper.2
                        @Override // java.lang.reflect.InvocationHandler
                        public Object invoke(Object obj2, Method method, Object[] objArr) throws Throwable {
                            if ("queryLocalInterface".equals(method.getName())) {
                                return objNewProxyInstance;
                            }
                            try {
                                return method.invoke(iBinder, objArr);
                            } catch (InvocationTargetException e) {
                                throw e.getTargetException();
                            }
                        }
                    }));
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void mockSubscriptionItem(Object obj) throws Exception {
        Field declaredFieldRecursive = getDeclaredFieldRecursive(obj.getClass(), "subscriptions");
        if (declaredFieldRecursive == null) {
            return;
        }
        declaredFieldRecursive.setAccessible(true);
        Object objNewInstance = declaredFieldRecursive.get(obj);
        if (objNewInstance == null) {
            objNewInstance = declaredFieldRecursive.getType().newInstance();
            declaredFieldRecursive.set(obj, objNewInstance);
        }
        Field declaredFieldRecursive2 = getDeclaredFieldRecursive(objNewInstance.getClass(), "k0");
        if (declaredFieldRecursive2 == null) {
            return;
        }
        declaredFieldRecursive2.setAccessible(true);
        Object objNewInstance2 = declaredFieldRecursive2.get(objNewInstance);
        if (objNewInstance2 == null) {
            objNewInstance2 = declaredFieldRecursive2.getType().newInstance();
            declaredFieldRecursive2.set(objNewInstance, objNewInstance2);
        }
        setObjectField(objNewInstance2, "name", "Business");
        setObjectField(objNewInstance2, "sku", "fr24_business_yearly");
        setObjectField(objNewInstance2, "typePlatform", "android");
        setObjectField(objNewInstance2, "typeSubscription", "yearly");
        setObjectField(objNewInstance2, "isOnTrial", Boolean.FALSE);
        setObjectField(objNewInstance2, "dateExpires", 4102444800000L);
    }

    public static void mockUserFeatures(Object obj) {
        if (obj == null) {
            Log.i("FlightradarHelper", "mockUserFeatures received null object");
            return;
        }
        try {
            Class<?> cls = obj.getClass();
            Log.i("FlightradarHelper", "mockUserFeatures running on class: " + cls.getName());
            try {
                for (Field field : cls.getDeclaredFields()) {
                    Log.i("FlightradarHelper", "  Found field: " + field.getName() + " of type " + field.getType().getName());
                }
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass != null && superclass != Object.class) {
                    Log.i("FlightradarHelper", "  Superclass: " + superclass.getName());
                    Field[] declaredFields = superclass.getDeclaredFields();
                    int length = declaredFields.length;
                    for (int i = 0; i < length; i++) {
                        Field field2 = declaredFields[i];
                        Log.i("FlightradarHelper", "    Found super field: " + field2.getName() + " of type " + field2.getType().getName());
                    }
                }
            } catch (Throwable th) {
                Log.e("FlightradarHelper", "Error listing fields", th);
            }
            HashMap map = new HashMap();
            map.put("mapLabelsRows", 4);
            map.put("mapFiltersMax", 60);
            map.put("userAlertsMax", 60);
            map.put("userBookmarksMax", 60);
            map.put("historyFlightKml", 60);
            map.put("historyPlaybackDays", 1095);
            map.put("airportFlightHistory", 1095);
            map.put("airportPanelArrivalsDepartures", 72);
            map.put("airportPanelOnGround", 90);
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                int iIntValue = ((Integer) entry.getValue()).intValue();
                try {
                    Field declaredFieldRecursive = getDeclaredFieldRecursive(cls, str);
                    if (declaredFieldRecursive != null) {
                        declaredFieldRecursive.setAccessible(true);
                        declaredFieldRecursive.setInt(obj, iIntValue);
                        Log.i("FlightradarHelper", "Set int field " + str + " to " + iIntValue);
                    } else {
                        Log.w("FlightradarHelper", "Int field " + str + " not found");
                    }
                } catch (Throwable th2) {
                    Log.e("FlightradarHelper", "Failed to set int field: " + str, th2);
                }
            }
            String[] strArr = {"mapFiltersCategories", "mapLayerWeatherVolcano", "mapLayerNavdata", "mapLayerWeather", "mapLayerWeatherSatellite", "mapLayerWeatherRadar", "mapLayerWeatherAirmet", "mapLayerWeatherHighLevel", "mapLayerWeatherWind", "mapLayerWeatherLightning", "mapLayerAtc", "mapLayerTracksOceanic", "mapLayerWeatherInCloudTurbulence", "mapLayerWeatherClearAirTurbulence", "mapLayerWeatherIcing", "mapLayerWeatherNorthAmericanRadar", "mapLayerWeatherAustralianRadar", "airportPanelRunwayDetails", "airportPanelMovementsPerDay", "airportPanelRunwayUsage", "airportPanelLatestEvents", "mapView3d"};
            for (int i2 = 0; i2 < 22; i2++) {
                String str2 = strArr[i2];
                try {
                    Field declaredFieldRecursive2 = getDeclaredFieldRecursive(cls, str2);
                    if (declaredFieldRecursive2 != null) {
                        declaredFieldRecursive2.setAccessible(true);
                        declaredFieldRecursive2.set(obj, "enabled");
                        Log.i("FlightradarHelper", "Set string field " + str2 + " to 'enabled'");
                    } else {
                        Log.w("FlightradarHelper", "String field " + str2 + " not found");
                    }
                } catch (Throwable th3) {
                    Log.e("FlightradarHelper", "Failed to set string field: " + str2, th3);
                }
            }
            try {
                Field declaredFieldRecursive3 = getDeclaredFieldRecursive(cls, "mapInfoAircraft");
                if (declaredFieldRecursive3 != null) {
                    declaredFieldRecursive3.setAccessible(true);
                    declaredFieldRecursive3.set(obj, "full");
                    Log.i("FlightradarHelper", "Set mapInfoAircraft to 'full'");
                } else {
                    Log.w("FlightradarHelper", "mapInfoAircraft field not found");
                }
            } catch (Throwable th4) {
                Log.e("FlightradarHelper", "Failed to set mapInfoAircraft", th4);
            }
            try {
                Field declaredFieldRecursive4 = getDeclaredFieldRecursive(cls, "adverts");
                if (declaredFieldRecursive4 != null) {
                    declaredFieldRecursive4.setAccessible(true);
                    declaredFieldRecursive4.set(obj, "disabled");
                    Log.i("FlightradarHelper", "Set adverts to 'disabled'");
                } else {
                    Log.w("FlightradarHelper", "adverts field not found");
                }
            } catch (Throwable th5) {
                Log.e("FlightradarHelper", "Failed to set adverts", th5);
            }
        } catch (Throwable th6) {
            Log.e("FlightradarHelper", "Error in mockUserFeatures", th6);
        }
    }

    public static void mockUserFeaturesFromTemp() {
        mockUserFeatures(tempFeatures);
    }

    public static void mockUserSessionData(Object obj) {
        if (obj == null) {
            return;
        }
        try {
            try {
                Field declaredFieldRecursive = getDeclaredFieldRecursive(obj.getClass(), "accountType");
                if (declaredFieldRecursive != null) {
                    declaredFieldRecursive.setAccessible(true);
                    declaredFieldRecursive.set(obj, "Business");
                    Log.i("FlightradarHelper", "Set accountType to Business");
                }
                Field declaredFieldRecursive2 = getDeclaredFieldRecursive(obj.getClass(), "subscriptionKey");
                if (declaredFieldRecursive2 != null) {
                    declaredFieldRecursive2.setAccessible(true);
                    declaredFieldRecursive2.set(obj, "Business");
                    Log.i("FlightradarHelper", "Set subscriptionKey to Business");
                }
            } catch (Exception e) {
                Log.e("FlightradarHelper", "Error mocking UserSessionData strings", e);
            }
            try {
                mockSubscriptionItem(obj);
            } catch (Exception e2) {
                Log.e("FlightradarHelper", "Error mocking subscription item", e2);
            }
            Field declaredFieldRecursive3 = getDeclaredFieldRecursive(obj.getClass(), "features");
            if (declaredFieldRecursive3 != null) {
                declaredFieldRecursive3.setAccessible(true);
                Object objNewInstance = declaredFieldRecursive3.get(obj);
                if (objNewInstance == null) {
                    objNewInstance = declaredFieldRecursive3.getType().newInstance();
                    declaredFieldRecursive3.set(obj, objNewInstance);
                    Log.i("FlightradarHelper", "Created new UserFeatures instance for sessionData");
                }
                mockUserFeatures(objNewInstance);
            }
        } catch (Exception e3) {
            Log.e("FlightradarHelper", "Error mocking UserSessionData features", e3);
        }
    }

    private static void setObjectField(Object obj, String str, Object obj2) throws Exception {
        Field declaredFieldRecursive = getDeclaredFieldRecursive(obj.getClass(), str);
        if (declaredFieldRecursive != null) {
            declaredFieldRecursive.setAccessible(true);
            declaredFieldRecursive.set(obj, obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void spoofApplicationInfo(ApplicationInfo applicationInfo) {
        if (applicationInfo.metaData == null) {
            applicationInfo.metaData = new Bundle();
        }
        applicationInfo.metaData.putString("com.google.android.maps.v2.API_KEY", BuildConfig.FLIGHTRADAR_MAPS_API_KEY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void spoofPackageInfo(PackageInfo packageInfo) {
        Object objNewInstance;
        Class<?> cls;
        Signature signature = new Signature(hexStringToByteArray("308202013082016aa00302010202044c8f605b300d06092a864886f70d01010505003045310b3009060355040613023436311230100603550407130953746f636b686f6c6d31223020060355040a0c195376656e736b6120526573656ec3a4747665726b6574204142301e170d3130303931343131343533315a170d3335303930383131343533315a3045310b3009060355040613023436311230100603550407130953746f636b686f6c6d31223020060355040a0c195376656e736b6120526573656ec3a4747665726b657420414230819f300d06092a864886f70d010101050003818d0030818902818100807e5535e0e8b9ea9de684bc056c03ab244526ef4487252cf235bba572f56f0bbf1c22de30110ee0936f041d01ec07d672475a71a2536e3bfa2702ac59527b6b18fa75c39e0f2139bc5358a782ccc6b100ce177145f4f5b4c16211a80371f511cd42219e4425574dca9fcdd68d12767e35d72bf10dbebcab1c05dd05bd898c4f0203010001300d06092a864886f70d010105050003818100056626bedce30fec1f0fc5b27dd3047954dc8a5ccbfe20e7521e9b44e85e4ee3e5dcadc5702651308eaa89a92fdbb8baa533565fc1e9470069617b160f5cb10dcbc06d940d788413e37ef89728fb02355b1e7bd6ffc29152ab16308f3335471acc2535861864c99cd6bbcee367ed684744b958d7a3055976734ee06f266a0e10"));
        packageInfo.signatures = new Signature[]{signature};
        SigningInfo signingInfoM = null;
        try {
            Class<?> cls2 = Class.forName("android.content.pm.SigningDetails");
            try {
                Class<?> cls3 = Class.forName("android.content.pm.SigningDetails$Builder");
                Object objNewInstance2 = cls3.getConstructor(null).newInstance(null);
                Method declaredMethod = cls3.getDeclaredMethod("setSignatures", Signature[].class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(objNewInstance2, new Signature[]{signature});
                Method declaredMethod2 = cls3.getDeclaredMethod("setSignatureSchemeVersion", Integer.TYPE);
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(objNewInstance2, 1);
                Method declaredMethod3 = cls3.getDeclaredMethod("build", null);
                declaredMethod3.setAccessible(true);
                objNewInstance = declaredMethod3.invoke(objNewInstance2, null);
            } catch (Throwable unused) {
                Constructor<?>[] declaredConstructors = cls2.getDeclaredConstructors();
                int length = declaredConstructors.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        objNewInstance = null;
                        break;
                    }
                    Constructor<?> constructor = declaredConstructors[i];
                    constructor.setAccessible(true);
                    Class<?>[] parameterTypes = constructor.getParameterTypes();
                    try {
                        if (parameterTypes.length != 2 || parameterTypes[0] != Signature[].class || parameterTypes[1] != Integer.TYPE) {
                            if (parameterTypes.length == 4 && parameterTypes[0] == Signature[].class && parameterTypes[1] == Integer.TYPE && (((cls = parameterTypes[2]) == Set.class || cls.getName().contains("ArraySet")) && parameterTypes[3] == Signature[].class)) {
                                objNewInstance = constructor.newInstance(new Signature[]{signature}, 1, null, null);
                                break;
                            }
                            i++;
                        } else {
                            objNewInstance = constructor.newInstance(new Signature[]{signature}, 1);
                            break;
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
            if (objNewInstance != null) {
                try {
                    Constructor declaredConstructor = CitymapperHelper$$ExternalSyntheticApiModelOutline0.m141m().getDeclaredConstructor(cls2);
                    declaredConstructor.setAccessible(true);
                    signingInfoM = CitymapperHelper$$ExternalSyntheticApiModelOutline0.m(declaredConstructor.newInstance(objNewInstance));
                } catch (Throwable unused3) {
                    CitymapperHelper$$ExternalSyntheticApiModelOutline0.m142m();
                    signingInfoM = CitymapperHelper$$ExternalSyntheticApiModelOutline0.m();
                    Field declaredField = CitymapperHelper$$ExternalSyntheticApiModelOutline0.m141m().getDeclaredField("mSigningDetails");
                    declaredField.setAccessible(true);
                    declaredField.set(signingInfoM, objNewInstance);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        packageInfo.signingInfo = signingInfoM;
    }
}
