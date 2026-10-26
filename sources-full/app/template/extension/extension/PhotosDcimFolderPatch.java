package app.template.extension.extension;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class PhotosDcimFolderPatch {
    private PhotosDcimFolderPatch() {
    }

    private static boolean containsDcim(String str) {
        return str != null && str.toLowerCase(Locale.US).contains("/dcim/");
    }

    private static String findDcimPath(Object obj) {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            for (Field field : superclass.getDeclaredFields()) {
                try {
                    field.setAccessible(true);
                    String path = readPath(field.get(obj));
                    if (path != null) {
                        return path;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return null;
    }

    public static boolean fixInCameraFolder(Object obj, boolean z) {
        String strFindDcimPath;
        return (!z || obj == null || (strFindDcimPath = findDcimPath(obj)) == null) ? z : isCameraFolderPath(strFindDcimPath);
    }

    public static boolean isCameraFolderPath(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        return lowerCase.contains("/dcim/camera/") || lowerCase.endsWith("/dcim/camera");
    }

    private static String readPath(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            if (containsDcim(str)) {
                return str;
            }
            return null;
        }
        if (obj != null && obj.getClass().getName().contains("Optional")) {
            try {
                if (!Boolean.TRUE.equals(obj.getClass().getMethod("isPresent", null).invoke(obj, null))) {
                    return null;
                }
                Object objInvoke = obj.getClass().getMethod("get", null).invoke(obj, null);
                if ((objInvoke instanceof String) && containsDcim((String) objInvoke)) {
                    return (String) objInvoke;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
