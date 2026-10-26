package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.util.Log;
import androidx.compose.foundation.text.input.a;
import java.util.Arrays;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class bg1 implements wp0, qy, wn1, lp3, sw, nk3, a, rg3, el, gl, jz, bl0 {
    public static bg1 d;
    public final /* synthetic */ int c;
    public static final bg1 h = new bg1(1);
    public static final bg1 l = new bg1(2);
    public static final /* synthetic */ bg1 m = new bg1(3);
    public static final bg1 n = new bg1(4);
    public static final bg1 o = new bg1(5);
    public static final dx1 p = dx1.c;
    public static final xu0 q = new xu0(1.0f, 1.0f);
    public static final bg1 r = new bg1(6);
    public static final /* synthetic */ bg1 s = new bg1(7);
    public static final /* synthetic */ bg1 t = new bg1(8);
    public static final bg1 u = new bg1(9);
    public static final bg1 v = new bg1(10);
    public static final bg1 w = new bg1(11);
    public static final bg1 x = new bg1(12);
    public static final bg1 y = new bg1(13);
    public static final bg1 z = new bg1(14);
    public static final bg1 A = new bg1(15);
    public static final bg1 B = new bg1(16);
    public static final bg1 C = new bg1(17);
    public static final bg1 D = new bg1(18);

    public bg1() {
        this.c = 23;
        new t82(16);
        long[] jArr = qa3.a;
        new fi2();
    }

    public /* synthetic */ bg1(int i) {
        this.c = i;
    }

    public static final boolean g(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo;
        wl4 wl4Var;
        int i;
        if (packageInfo != null) {
            boolean z2 = (("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) && ((applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 129) == 0)) ? false : true;
            try {
                wl4 wl4Var2 = z2 ? hs4.c : hs4.b;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] byteArray = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        byteArray = signatureArr[0].toByteArray();
                    }
                    if (byteArray != null) {
                        nl4 nl4Var = ul4.d;
                        Object[] objArr = {byteArray};
                        ud4.b(1, objArr);
                        wl4Var = new wl4(1, objArr);
                    } else {
                        nl4 nl4Var2 = ul4.d;
                        wl4Var = wl4.m;
                    }
                } else {
                    if (i2 < 28) {
                        throw new IllegalStateException();
                    }
                    SigningInfo signingInfo = packageInfo.signingInfo;
                    if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                        nl4 nl4Var3 = ul4.d;
                        wl4Var = wl4.m;
                    } else {
                        nl4 nl4Var4 = ul4.d;
                        Object[] objArrCopyOf = new Object[4];
                        Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                        int length = signingCertificateHistory.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            byte[] byteArray2 = signingCertificateHistory[i3].toByteArray();
                            byteArray2.getClass();
                            int length2 = objArrCopyOf.length;
                            int i5 = i4 + 1;
                            if (i5 < 0) {
                                throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                            }
                            if (i5 <= length2) {
                                i = length2;
                            } else {
                                i = (length2 >> 1) + length2 + 1;
                                if (i < i5) {
                                    int iHighestOneBit = Integer.highestOneBit(i4);
                                    i = iHighestOneBit + iHighestOneBit;
                                }
                                if (i < 0) {
                                    i = IntCompanionObject.MAX_VALUE;
                                }
                            }
                            if (i > length2) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i);
                            }
                            objArrCopyOf[i4] = byteArray2;
                            i3++;
                            i4 = i5;
                        }
                        wl4Var = i4 == 0 ? wl4.m : new wl4(i4, objArrCopyOf);
                    }
                }
                if (wl4Var.isEmpty()) {
                    throw new IllegalArgumentException("Unable to obtain package certificate history.");
                }
                ul4 ul4VarK = wl4Var.k();
                int size = ul4VarK.size();
                int i6 = 0;
                while (i6 < size) {
                    byte[] bArr = (byte[]) ul4VarK.get(i6);
                    nl4 nl4VarM = wl4Var2.listIterator(0);
                    do {
                        int i7 = i6 + 1;
                        if (!nl4VarM.hasNext()) {
                            i6 = i7;
                        }
                    } while (!Arrays.equals(bArr, (byte[]) nl4VarM.next()));
                    return true;
                }
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z2 ? i(packageInfo, hs4.a) : i(packageInfo, hs4.a[0])) == null) {
                    return false;
                }
            }
        }
        return false;
    }

    public static wq4 i(PackageInfo packageInfo, wq4... wq4VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            hr4 hr4Var = new hr4(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < wq4VarArr.length; i++) {
                if (wq4VarArr[i].equals(hr4Var)) {
                    return wq4VarArr[i];
                }
            }
        }
        return null;
    }

    @Override // defpackage.el, defpackage.gl
    public float a() {
        return 0.0f;
    }

    @Override // defpackage.qy
    public long b() {
        return 9205357640488583168L;
    }

    @Override // defpackage.wn1
    public void c(wx1 wx1Var) {
        wx1Var.a();
    }

    @Override // defpackage.lp3
    public void d(kp3 kp3Var) {
        kp3Var.clear();
    }

    @Override // defpackage.lp3
    public boolean e(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.jz
    public byte[] f(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // defpackage.qy
    public wu0 getDensity() {
        return q;
    }

    @Override // defpackage.qy
    public dx1 getLayoutDirection() {
        return p;
    }

    @Override // defpackage.el
    public void h(wu0 wu0Var, int i, int[] iArr, dx1 dx1Var, int[] iArr2) {
        if (dx1Var == dx1.c) {
            hl.a(i, iArr, iArr2, false);
        } else {
            hl.a(i, iArr, iArr2, true);
        }
    }

    @Override // defpackage.gl
    public void k(wu0 wu0Var, int i, int[] iArr, int[] iArr2) {
        hl.a(i, iArr, iArr2, false);
    }

    @Override // defpackage.rg3
    public rq2 l(long j, dx1 dx1Var, wu0 wu0Var) {
        float fO = wu0Var.O(30.0f);
        return new pq2(new h43(-fO, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fO, Float.intBitsToFloat((int) (j & 4294967295L))));
    }

    @Override // defpackage.sw
    public long m(bd3 bd3Var, int i) {
        return bd3Var.f.j(i);
    }

    public String toString() {
        switch (this.c) {
            case 15:
                return "Center";
            case 16:
                return "TextFieldLineLimits.SingleLine";
            case 22:
                return "Arrangement#Center";
            default:
                return super.toString();
        }
    }
}
