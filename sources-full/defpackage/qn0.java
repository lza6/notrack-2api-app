package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import javax.crypto.KeyAgreement;

/* JADX INFO: loaded from: classes.dex */
public class qn0 implements sn0, wp0, a41, p42, sl2, nn2, lw2, c03, zk0, rg3 {
    public final /* synthetic */ int c;

    public /* synthetic */ qn0(int i) {
        this.c = i;
    }

    public qn0(int i, int i2) {
        this.c = 16;
    }

    public qn0(rn0 rn0Var) {
        this.c = 14;
    }

    public static Typeface a(String str, ic1 ic1Var, int i) {
        if (i == 0 && kr1.n(ic1Var, ic1.h) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), ic1Var.c, i == 1);
    }

    public static um1 i(String str) {
        if (!TextUtils.isEmpty(str)) {
            int length = str.length();
            int i = length - 1;
            int i2 = i;
            while (i2 > -1) {
                if (Character.isDigit(str.charAt(i2))) {
                    int i3 = i2 + 1;
                    try {
                        return new um1(i2 == i ? null : str.substring(i3, length), Float.parseFloat(str.substring(0, i3)));
                    } catch (NumberFormatException unused) {
                        break;
                    }
                }
                i2--;
            }
        }
        return null;
    }

    public static String r(x0 x0Var) {
        String str = (String) x0Var.h;
        if ("br".equals(str)) {
            return "\n";
        }
        if ("img".equals(str)) {
            String str2 = (String) x0Var.e().get("alt");
            return (str2 == null || str2.length() == 0) ? "￼" : str2;
        }
        if ("iframe".equals(str)) {
            return " ";
        }
        return null;
    }

    @Override // defpackage.sn0
    public long b(long j, long j2) {
        switch (this.c) {
            case 0:
                float fMax = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
                int i = pa3.a;
                return jFloatToRawIntBits;
            default:
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
                    int i2 = pa3.a;
                    return jFloatToRawIntBits2;
                }
                float fH = vl0.h(j, j2);
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fH)) << 32) | (((long) Float.floatToRawIntBits(fH)) & 4294967295L);
                int i3 = pa3.a;
                return jFloatToRawIntBits3;
        }
    }

    @Override // defpackage.a41
    public Object c(String str, Provider provider) {
        switch (this.c) {
            case 6:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
            case 7:
                return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
            default:
                return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [oi2] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [oi2] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r8v0, types: [of2] */
    /* JADX WARN: Type inference failed for: r8v1, types: [of2] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [of2] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.sl2
    public boolean d(of2 of2Var) {
        ?? oi2Var = 0;
        while (of2Var != 0) {
            if (of2Var instanceof hx2) {
                ((hx2) of2Var).p0();
            } else if ((of2Var.getKindSet$ui_release() & 16) != 0 && (of2Var instanceof ju0)) {
                of2 child$ui_release = ((ju0) of2Var).d;
                int i = 0;
                oi2Var = oi2Var;
                of2Var = of2Var;
                while (child$ui_release != null) {
                    if ((child$ui_release.getKindSet$ui_release() & 16) != 0) {
                        i++;
                        if (i == 1) {
                            oi2Var = oi2Var;
                            of2Var = child$ui_release;
                        } else {
                            if (oi2Var == 0) {
                                oi2Var = new oi2(0, new of2[16]);
                            }
                            if (of2Var != 0) {
                                oi2Var.c(of2Var);
                                of2Var = 0;
                            }
                            oi2Var.c(child$ui_release);
                        }
                    }
                    child$ui_release = child$ui_release.getChild$ui_release();
                    oi2Var = oi2Var;
                    of2Var = of2Var;
                }
                if (i == 1) {
                }
            }
            of2Var = y64.e(oi2Var);
        }
        return false;
    }

    @Override // defpackage.p42
    public void e(View view, String str) {
        Uri uriBuild = Uri.parse(str);
        if (TextUtils.isEmpty(uriBuild.getScheme())) {
            uriBuild = uriBuild.buildUpon().scheme("https").build();
        }
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", uriBuild);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Log.w("LinkResolverDef", "Actvity was not found for the link: '" + str + "'");
        }
    }

    @Override // defpackage.lw2
    public Typeface f(ic1 ic1Var, int i) {
        return a(null, ic1Var, i);
    }

    @Override // defpackage.sl2
    public int g() {
        return 16;
    }

    @Override // defpackage.lw2
    public Typeface h(hf1 hf1Var, ic1 ic1Var, int i) {
        return a(hf1Var.f, ic1Var, i);
    }

    @Override // defpackage.sl2
    public void j(ux1 ux1Var, long j, ii1 ii1Var, int i, boolean z) {
        ux1Var.y(j, ii1Var, i, z);
    }

    @Override // defpackage.c03
    public void k() {
    }

    @Override // defpackage.rg3
    public rq2 l(long j, dx1 dx1Var, wu0 wu0Var) {
        return new pq2(xp1.a(0L, j));
    }

    @Override // defpackage.c03
    public void m(int i, Object obj) {
    }

    @Override // defpackage.nn2
    public int n(int i) {
        return i;
    }

    @Override // defpackage.nn2
    public int o(int i) {
        return i;
    }

    @Override // defpackage.sl2
    public boolean p(ux1 ux1Var) {
        return true;
    }

    public Signature[] q(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public void s(rx2 rx2Var, int i, int i2) {
    }

    public String toString() {
        switch (this.c) {
            case 27:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
