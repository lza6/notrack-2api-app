package defpackage;

import android.os.CancellationSignal;
import java.util.HashMap;
import kotlin.text.Typography;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public class wu {
    public boolean a = true;
    public Object b;

    public wu(kn4 kn4Var) {
        this.b = kn4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [nd4, ph1] */
    /* JADX WARN: Type inference failed for: r4v8, types: [xc1] */
    public static av d(xc1 xc1Var, boolean z) {
        ?? r4;
        zc1 zc1Var;
        zh zhVar;
        if (!z || (zc1Var = xc1Var.C) == null) {
            r4 = 0;
        } else {
            zhVar = zc1Var.u;
        }
        if (r4 == 0) {
            r4 = zhVar;
            r4 = xc1Var.E;
        }
        if (r4 == 0) {
            u41.r("view model not found");
            return null;
        }
        md4 md4VarG = r4.g();
        kd4 kd4VarD = r4.d();
        zg2 zg2VarE = r4.e();
        md4VarG.getClass();
        kd4VarD.getClass();
        iy2 iy2Var = new iy2(md4VarG, kd4VarD, zg2VarE);
        vc0 vc0VarA = r43.a(av.class);
        String classQualifiedName = Options$Companion.getClassQualifiedName(vc0VarA.c);
        if (classQualifiedName != null) {
            return (av) iy2Var.j(vc0VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(classQualifiedName));
        }
        u41.k("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public void a(ds3 ds3Var) {
        HashMap map = (HashMap) this.b;
        for (String str : ds3Var.b()) {
            if (!map.containsKey(str)) {
                map.put(str, ds3Var);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0199  */
    /* JADX WARN: Code duplicated, block: B:108:0x019e  */
    /* JADX WARN: Code duplicated, block: B:114:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:116:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:62:0x0106  */
    /* JADX WARN: Code duplicated, block: B:64:0x010c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0120  */
    /* JADX WARN: Code duplicated, block: B:68:0x0124  */
    /* JADX WARN: Code duplicated, block: B:70:0x012a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0130  */
    /* JADX WARN: Code duplicated, block: B:73:0x0136  */
    /* JADX WARN: Code duplicated, block: B:74:0x0139  */
    /* JADX WARN: Code duplicated, block: B:76:0x013f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0145  */
    /* JADX WARN: Code duplicated, block: B:80:0x014b  */
    /* JADX WARN: Code duplicated, block: B:81:0x014d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0154  */
    /* JADX WARN: Code duplicated, block: B:85:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0159  */
    /* JADX WARN: Code duplicated, block: B:88:0x015d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0161  */
    /* JADX WARN: Code duplicated, block: B:90:0x0167  */
    /* JADX WARN: Code duplicated, block: B:92:0x016b  */
    /* JADX WARN: Code duplicated, block: B:93:0x016d  */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01a0, code lost:
    
        if (r2 != 0) goto L110;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(defpackage.gj r11) {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wu.b(gj):void");
    }

    public void c() {
        synchronized (this) {
            try {
                if (this.a) {
                    return;
                }
                this.a = true;
                CancellationSignal cancellationSignal = (CancellationSignal) this.b;
                if (cancellationSignal != null) {
                    try {
                        cancellationSignal.cancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (this) {
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e() {
        this.a = false;
    }

    public void f(byte b) {
        ((kn4) this.b).p(String.valueOf(b));
    }

    public void g(char c) {
        kn4 kn4Var = (kn4) this.b;
        kn4Var.h(kn4Var.b, 1);
        char[] cArr = (char[]) kn4Var.c;
        int i = kn4Var.b;
        kn4Var.b = i + 1;
        cArr[i] = c;
    }

    public void h(int i) {
        ((kn4) this.b).p(String.valueOf(i));
    }

    public void i(long j) {
        ((kn4) this.b).p(String.valueOf(j));
    }

    public void j(short s) {
        ((kn4) this.b).p(String.valueOf(s));
    }

    public void k(String str) {
        byte b;
        str.getClass();
        kn4 kn4Var = (kn4) this.b;
        kn4Var.h(kn4Var.b, str.length() + 2);
        char[] cArr = (char[]) kn4Var.c;
        int i = kn4Var.b;
        int i2 = i + 1;
        cArr[i] = Typography.quote;
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = jo3.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    kn4Var.h(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = jo3.b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) kn4Var.c)[i4] = cCharAt;
                        i4 = i6;
                    } else if (b == 1) {
                        String str2 = jo3.a[cCharAt];
                        str2.getClass();
                        kn4Var.h(i4, str2.length());
                        str2.getChars(0, str2.length(), (char[]) kn4Var.c, i4);
                        int length3 = str2.length() + i4;
                        kn4Var.b = length3;
                        i4 = length3;
                    } else {
                        char[] cArr2 = (char[]) kn4Var.c;
                        cArr2[i4] = '\\';
                        cArr2[i4 + 1] = (char) b;
                        i4 += 2;
                        kn4Var.b = i4;
                    }
                }
                kn4Var.h(i4, 1);
                ((char[]) kn4Var.c)[i4] = Typography.quote;
                kn4Var.b = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = Typography.quote;
        kn4Var.b = i3 + 1;
    }

    public void l() {
    }

    public void m() {
    }

    public void n(sr4 sr4Var) {
        if (this.a) {
            tm4.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((iy2) this.b).o(new lo(sr4Var));
        } catch (Throwable unused) {
            tm4.h("BillingLogger", "logging failed.");
        }
    }
}
