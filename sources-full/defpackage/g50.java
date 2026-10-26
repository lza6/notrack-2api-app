package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import app.template.extension.BuildConfig;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g50 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ e60 d;

    public /* synthetic */ g50(e60 e60Var, int i) {
        this.c = i;
        this.d = e60Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        byte[] byteArray;
        Signature[] apkContentsSigners;
        int i = this.c;
        Signature signature = null;
        int i2 = 16;
        e60 e60Var = this.d;
        switch (i) {
            case 0:
                return e60Var.b.getSharedPreferences("ui", 0);
            case 1:
                Context context = e60Var.b;
                try {
                    PackageManager packageManager = context.getPackageManager();
                    String packageName = context.getPackageName();
                    if (Build.VERSION.SDK_INT >= 28) {
                        SigningInfo signingInfo = packageManager.getPackageInfo(packageName, 134217728).signingInfo;
                        if (signingInfo != null && (apkContentsSigners = signingInfo.getApkContentsSigners()) != null && apkContentsSigners.length != 0) {
                            signature = apkContentsSigners[0];
                        }
                    } else {
                        Signature[] signatureArr = packageManager.getPackageInfo(packageName, 64).signatures;
                        if (signatureArr != null && signatureArr.length != 0) {
                            signature = signatureArr[0];
                        }
                    }
                    if (signature != null && (byteArray = signature.toByteArray()) != null) {
                        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(byteArray);
                        bArrDigest.getClass();
                        StringBuilder sb = new StringBuilder();
                        sb.append((CharSequence) BuildConfig.VERSION_NAME);
                        int i3 = 0;
                        for (byte b : bArrDigest) {
                            i3++;
                            if (i3 > 1) {
                                sb.append((CharSequence) BuildConfig.VERSION_NAME);
                            }
                            sb.append((CharSequence) String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
                        }
                        sb.append((CharSequence) BuildConfig.VERSION_NAME);
                        return mo3.T0(16, sb.toString());
                    }
                } catch (Exception unused) {
                }
                return "none";
            case 2:
                return e60Var.k;
            case 3:
                String strE = e60Var.g.e();
                if (strE == null || mo3.C0(strE)) {
                    return null;
                }
                return strE;
            case 4:
                return e60Var.k;
            case 5:
                return e60Var.k;
            case 6:
                return new k2(new g50(e60Var, 4), e60Var.g, e60Var.l);
            case 7:
                Context context2 = e60Var.b;
                context2.getClass();
                return new tw2(context2, new jb(i2, e60Var));
            case 8:
                return new ge4(new g50(e60Var, 5), e60Var.l);
            case 9:
                return new gp(new g50(e60Var, 2), new g50(e60Var, 3), e60Var.l);
            default:
                Context context3 = e60Var.b;
                context3.getClass();
                return new yg1(context3);
        }
    }
}
