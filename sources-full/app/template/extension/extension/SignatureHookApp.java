package app.template.extension.extension;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.lang.reflect.Field;
import java.util.Map;
import org.lsposed.hiddenapibypass.HiddenApiBypass;

/* JADX INFO: loaded from: classes.dex */
public class SignatureHookApp extends Application {
    static {
        killPackageManager("ai.notrack.app", "MIIFiTCCA3GgAwIBAgIVALftxLfMgy+JPHx0mT00AT5hr6EfMA0GCSqGSIb3DQEBCwUAMHQxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpDYWxpZm9ybmlhMRYwFAYDVQQHEw1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKEwtHb29nbGUgSW5jLjEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDAgFw0yNjA4MDgwOTEwMzRaGA8yMDU2MDgwODA5MTAzNFowdDELMAkGA1UEBhMCVVMxEzARBgNVBAgTCkNhbGlmb3JuaWExFjAUBgNVBAcTDU1vdW50YWluIFZpZXcxFDASBgNVBAoTC0dvb2dsZSBJbmMuMRAwDgYDVQQLEwdBbmRyb2lkMRAwDgYDVQQDEwdBbmRyb2lkMIICIjANBgkqhkiG9w0BAQEFAAOCAg8AMIICCgKCAgEArzCJ6OcvrMvnYYKpmzmcTtaZjDBZR56ppv7he/hJOseVW9HKoK3aKaW0UJx2S5y6hJml7r+YNaYMAFQM15XLVMp3i5pjOy3WYU5XvD7PCeLCzOOWqKQsfQXzPZdZDdU3Fe5co1Ip2D+lJRgn7kuMYeNYI9q2/xOAFkeNd32KcR87UYteCnlSaj2bQtXFpFCCBZaEE40TgKkBVgVbM3lEoO87QuZi02DEJUJl8kd//jK+Zb6smO0jJlCu4kz3AiHXLq19i9OdW8o2sNa7T6oQ/kdgKbj0UUBlOy7oSZjKXLtvkxEP6Huq4+Q8aXLMwZjcA2gkIURA+8uFS6hL+zcu0Sm5x57uh/fvDOEiBrwL+vPSGaUrpR9C93rt1GI+KDNJ94/EYSwUY5xUy7GU8cFUeP6RnU4VcBWd2LQK6yMtyGTzF9h5PzUIp4yP3/SJozfDF6xsb5wL14g537Fi48Zo8I4M7KfdC7sRq/rXkVq/KqyF/7/w0Q9iiZr6k6TRFBXpIQaCqMJmGFsvUCPXRQjPBmv2xpH3XeexSvp5KgpfFrfW1g1yJds/0kxzcOzBO6eQALQO1DuhgAaSkngndUNduflamgRMAYU0MmclCyPj3FRmFRz42FUV/dBUj+3mJ242lzmi5S2wqm1Y9xcL6j9YrhNczJvp9qsqKc+vjC2YNw0CAwEAAaMQMA4wDAYDVR0TBAUwAwEB/zANBgkqhkiG9w0BAQsFAAOCAgEAmrrwHuDLDlYWcaW2tq6c9KcaJoQvchbhpc+Xl56sT9zhtamQ6pCaFDB6w0gdJ99uvP77MP2rb0LF/7i8hZLBgVnmVA0d1WI9tcwiFc6Jhf3TuwvtC3V+xcH5SIt36ZCwNmfQn3SJFcyccizP2dAQoeBz4aKgGdBtZEhT1nXEstjr5ddJlYkP0p3vyQx1WsJGEZ8BzjSrIw/7HLmetM/nb+hVRsgqTWhClwLzJbul10ILSCrMuz+SqQNVQXb9DcfH0jTWEddiBXl0Xs/HYu0KBWHzwhFDQhDDLGH1aUKv8K3hem2zRQ+0umfN9D4HPDAhLuj2KNOyKIAGIWrKS/AP09L6coTDEHdWh8LDvfUjB/X0nSNZ+dymNnIDoqYBGFe5DvqrFJAi363oEkJOKtbVrybL4Cf7Axim0H2FAxY4vGZX+EfNm0aUHcIFguRf2dHxntSzZI8jER8tCAySGpE2HmLTyTAtmEcoyMqDKLgJ5tW0xEqCjn7VBGTNoxQnjJdiqDyI4g7/wbQC+e2VlgL6jjZQVfsa8wzwPeXc62036KtsUxG7/M/PcMKpLUP14szMGKXiX9VLnwSlvL41aGi+mLjtiBSdOqkXDJ28kYOVmRv/o4hrJejj20xPOBEmXieXQTsHcpdKYP0SUiIJMeL2/0fL5vsLL/c05xu1dIlwxwM=");
    }

    private static void clearPackageInfoCache() {
        try {
            Object obj = findField(PackageManager.class, "sPackageInfoCache").get(null);
            if (obj != null) {
                obj.getClass().getMethod("clear", null).invoke(obj, null);
            }
        } catch (Exception unused) {
        }
    }

    private static void clearParcelCreators() {
        try {
            Map map = (Map) findField(Parcel.class, "mCreators").get(null);
            if (map != null) {
                map.clear();
            }
        } catch (Exception unused) {
        }
        try {
            Map map2 = (Map) findField(Parcel.class, "sPairedCreators").get(null);
            if (map2 != null) {
                map2.clear();
            }
        } catch (Exception unused2) {
        }
    }

    private static Field findField(Class<?> cls, String str) throws NoSuchFieldException {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException e) {
            while (true) {
                cls = cls.getSuperclass();
                if (cls == null || cls.equals(Object.class)) {
                    break;
                }
                try {
                    Field declaredField2 = cls.getDeclaredField(str);
                    declaredField2.setAccessible(true);
                    return declaredField2;
                } catch (NoSuchFieldException unused) {
                }
            }
            throw e;
        }
    }

    private static Parcelable.Creator<PackageInfo> getPackageInfoCreator(final String str, final Signature signature) {
        final Parcelable.Creator creator = PackageInfo.CREATOR;
        return new Parcelable.Creator<PackageInfo>() { // from class: app.template.extension.extension.SignatureHookApp.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public PackageInfo createFromParcel(Parcel parcel) {
                PackageInfo packageInfo = (PackageInfo) creator.createFromParcel(parcel);
                if (packageInfo.packageName.equals(str)) {
                    if (packageInfo.signatures != null && packageInfo.signatures.length > 0) {
                        packageInfo.signatures[0] = signature;
                    }
                    if (Build.VERSION.SDK_INT >= 28 && packageInfo.signingInfo != null) {
                        Signature[] apkContentsSigners = packageInfo.signingInfo.getApkContentsSigners();
                        if (apkContentsSigners != null && apkContentsSigners.length > 0) {
                            apkContentsSigners[0] = signature;
                        }
                        Signature[] signingCertificateHistory = packageInfo.signingInfo.getSigningCertificateHistory();
                        if (signingCertificateHistory != null && signingCertificateHistory.length > 0) {
                            for (int i = 0; i < signingCertificateHistory.length; i++) {
                                signingCertificateHistory[i] = signature;
                            }
                        }
                    }
                }
                return packageInfo;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public PackageInfo[] newArray(int i) {
                return (PackageInfo[]) creator.newArray(i);
            }
        };
    }

    private static void killPackageManager(String str, String str2) {
        try {
            findField(PackageInfo.class, "CREATOR").set(null, getPackageInfoCreator(str, new Signature(Base64.decode(str2, 0))));
            if (Build.VERSION.SDK_INT >= 28) {
                HiddenApiBypass.addHiddenApiExemptions("Landroid/os/Parcel;", "Landroid/content/pm", "Landroid/app");
            }
            clearPackageInfoCache();
            clearParcelCreators();
        } catch (Exception e) {
            throw new RuntimeException("Failed to modify package manager", e);
        }
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        System.loadLibrary("null");
        super.attachBaseContext(context);
    }
}
