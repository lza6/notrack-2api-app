package defpackage;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.IllegalFormatException;
import java.util.Locale;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public final class d5 implements i21, cq3 {
    public static final d5 A;
    public static final d5 B;
    public static final d5 C;
    public static final d5 D;
    public static final d5 E;
    public static final d5 F;
    public static final d5 G;
    public static final d5 H;
    public static final d5 I;
    public static final d5 J;
    public static final d5 K;
    public static final d5 L;
    public static final d5 M;
    public static final d5 N;
    public static final d5 O;
    public static final d5 h;
    public static final d5 l;
    public static final d5 m;
    public static final d5 n;
    public static final d5 o;
    public static final d5 p;
    public static final d5 q;
    public static final d5 r;
    public static final d5 s;
    public static final d5 t;
    public static final d5 u;
    public static final d5 v;
    public static final d5 w;
    public static final d5 x;
    public static final d5 y;
    public static final d5 z;
    public final /* synthetic */ int c;
    public String d;

    static {
        int i = 0;
        h = new d5("TINK", i);
        l = new d5("CRUNCHY", i);
        m = new d5("LEGACY", i);
        n = new d5("NO_PREFIX", i);
        int i2 = 1;
        o = new d5("TINK", i2);
        p = new d5("CRUNCHY", i2);
        q = new d5("NO_PREFIX", i2);
        int i3 = 2;
        r = new d5("TINK", i3);
        s = new d5("CRUNCHY", i3);
        t = new d5("NO_PREFIX", i3);
        int i4 = 3;
        u = new d5("TINK", i4);
        v = new d5("CRUNCHY", i4);
        w = new d5("NO_PREFIX", i4);
        int i5 = 4;
        x = new d5("TINK", i5);
        y = new d5("CRUNCHY", i5);
        z = new d5("NO_PREFIX", i5);
        int i6 = 5;
        A = new d5("SHA1", i6);
        B = new d5("SHA224", i6);
        C = new d5("SHA256", i6);
        D = new d5("SHA384", i6);
        E = new d5("SHA512", i6);
        int i7 = 6;
        F = new d5("TINK", i7);
        G = new d5("CRUNCHY", i7);
        H = new d5("LEGACY", i7);
        I = new d5("NO_PREFIX", i7);
        int i8 = 7;
        J = new d5("ENABLED", i8);
        K = new d5("DISABLED", i8);
        L = new d5("DESTROYED", i8);
        int i9 = 8;
        M = new d5("TINK", i9);
        N = new d5("CRUNCHY", i9);
        O = new d5("NO_PREFIX", i9);
    }

    public /* synthetic */ d5(d5 d5Var) {
        this.c = 13;
        this.d = d5Var.d;
    }

    public d5(String str) {
        this.c = 17;
        this.d = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    public /* synthetic */ d5(String str, int i) {
        this.c = i;
        this.d = str;
    }

    public d5(String str, Object obj) {
        this.c = 11;
        this.d = str;
    }

    public static String g(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    @Override // defpackage.i21
    public Object a() {
        return this;
    }

    @Override // defpackage.i21
    public boolean b(CharSequence charSequence, int i, int i2, h74 h74Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.d)) {
            return true;
        }
        h74Var.c = (h74Var.c & 3) | 4;
        return false;
    }

    @Override // defpackage.cq3
    public String c() {
        return this.d;
    }

    public void d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", g(this.d, str, objArr));
        }
    }

    public void e(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", g(this.d, str, objArr), remoteException);
        }
    }

    public void f(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", g(this.d, str, objArr));
        }
    }

    @Override // defpackage.cq3
    public void h(bq3 bq3Var) {
    }

    public String toString() {
        boolean zContainsAlias;
        switch (this.c) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            case 2:
                return this.d;
            case 3:
                return this.d;
            case 4:
                return this.d;
            case 5:
                return this.d;
            case 6:
                return this.d;
            case 7:
                return this.d;
            case 8:
                return this.d;
            case 9:
            case 10:
            case 12:
            case 13:
            case 14:
            case 15:
            default:
                return super.toString();
            case 11:
                StringBuilder sb = new StringBuilder("MasterKey{keyAlias=");
                String str = this.d;
                sb.append(str);
                sb.append(", isKeyStoreBacked=");
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    zContainsAlias = keyStore.containsAlias(str);
                    break;
                } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
                    zContainsAlias = false;
                }
                sb.append(zContainsAlias);
                sb.append("}");
                return sb.toString();
            case 16:
                return ud2.r(new StringBuilder("<"), this.d, Typography.greater);
        }
    }
}
