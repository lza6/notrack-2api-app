package defpackage;

import ai.notrack.app.R;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import android.text.TextUtils;
import android.util.Log;
import app.template.extension.BuildConfig;
import java.lang.ref.WeakReference;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public class qu extends xc1 {
    public av c0;
    public final Handler d0 = new Handler(Looper.getMainLooper());

    @Override // defpackage.xc1
    public final void C() {
        this.M = true;
        if (Build.VERSION.SDK_INT == 29 && xr0.g0(this.c0.e())) {
            av avVar = this.c0;
            avVar.o = true;
            this.d0.postDelayed(new pu(avVar, 2), 250L);
        }
    }

    @Override // defpackage.xc1
    public final void D() {
        this.M = true;
        if (Build.VERSION.SDK_INT >= 29 || this.c0.m) {
            return;
        }
        zc1 zc1Var = this.C;
        zh zhVar = zc1Var == null ? null : zc1Var.u;
        if (zhVar == null || !zhVar.isChangingConfigurations()) {
            I(0);
        }
    }

    public final void I(int i) {
        if (i == 3 || !this.c0.o) {
            if (M()) {
                this.c0.j = i;
                if (i == 1) {
                    P(10, av1.x(j(), 10));
                }
            }
            av avVar = this.c0;
            if (avVar.g == null) {
                avVar.g = new bi4(3);
            }
            bi4 bi4Var = avVar.g;
            CancellationSignal cancellationSignal = (CancellationSignal) bi4Var.c;
            if (cancellationSignal != null) {
                try {
                    v00.a(cancellationSignal);
                } catch (NullPointerException e) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
                }
                bi4Var.c = null;
            }
            wu wuVar = (wu) bi4Var.d;
            if (wuVar != null) {
                try {
                    wuVar.c();
                } catch (NullPointerException e2) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e2);
                }
                bi4Var.d = null;
            }
        }
    }

    public final void J() {
        K();
        av avVar = this.c0;
        avVar.k = false;
        if (!avVar.m && p()) {
            er erVar = new er(l());
            erVar.h(this);
            erVar.e(true, true);
        }
        Context contextJ = j();
        if (contextJ != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && str != null) {
                for (String str2 : contextJ.getResources().getStringArray(R.array.delay_showing_prompt_models)) {
                    if (str.equals(str2)) {
                        av avVar2 = this.c0;
                        avVar2.n = true;
                        this.d0.postDelayed(new pu(avVar2, 1), 600L);
                        return;
                    }
                }
            }
        }
    }

    public final void K() {
        this.c0.k = false;
        if (p()) {
            nd1 nd1VarL = l();
            k71 k71Var = (k71) nd1VarL.D("androidx.biometric.FingerprintDialogFragment");
            if (k71Var != null) {
                if (k71Var.p()) {
                    k71Var.I(false);
                    return;
                }
                er erVar = new er(nd1VarL);
                erVar.h(k71Var);
                erVar.e(true, true);
            }
        }
    }

    public final boolean L() {
        return Build.VERSION.SDK_INT <= 28 && xr0.g0(this.c0.e());
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003e  */
    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056 A[LOOP:1: B:23:0x004b->B:27:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:22:0x003e, please report this as an issue */
    public final boolean M() {
        Bundle bundle;
        Context contextJ;
        boolean z;
        String str;
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            Context contextJ2 = j();
            if (contextJ2 == null || this.c0.e == null) {
                if (i2 == 28) {
                    bundle = this.n;
                    contextJ = j();
                    if (contextJ == null && contextJ.getPackageManager() != null && ds2.a(contextJ.getPackageManager())) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!bundle.getBoolean("has_fingerprint", z)) {
                    }
                }
                return false;
            }
            String str2 = Build.MANUFACTURER;
            String str3 = Build.MODEL;
            if (i2 != 28) {
                if (i2 == 28) {
                    bundle = this.n;
                    contextJ = j();
                    if (contextJ == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (!bundle.getBoolean("has_fingerprint", z)) {
                    }
                }
                return false;
            }
            if (str2 == null) {
                str = Build.MODEL;
                if (str == null) {
                    if (i2 == 28) {
                        bundle = this.n;
                        contextJ = j();
                        if (contextJ == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (!bundle.getBoolean("has_fingerprint", z)) {
                        }
                    }
                    return false;
                }
                for (String str4 : contextJ2.getResources().getStringArray(R.array.crypto_fingerprint_fallback_prefixes)) {
                    if (str.startsWith(str4)) {
                    }
                }
                if (i2 == 28) {
                    bundle = this.n;
                    contextJ = j();
                    if (contextJ == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (!bundle.getBoolean("has_fingerprint", z)) {
                    }
                }
                return false;
            }
            for (String str5 : contextJ2.getResources().getStringArray(R.array.crypto_fingerprint_fallback_vendors)) {
                if (!str2.equalsIgnoreCase(str5)) {
                }
            }
            str = Build.MODEL;
            if (str == null) {
                if (i2 == 28) {
                    bundle = this.n;
                    contextJ = j();
                    if (contextJ == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (!bundle.getBoolean("has_fingerprint", z)) {
                    }
                }
                return false;
            }
            while (i < r6) {
                if (str.startsWith(str4)) {
                }
            }
            if (i2 == 28) {
                bundle = this.n;
                contextJ = j();
                if (contextJ == null) {
                    z = false;
                } else {
                    z = false;
                }
                if (!bundle.getBoolean("has_fingerprint", z)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void N() throws Exception {
        Context contextJ = j();
        KeyguardManager keyguardManagerA = contextJ != null ? cw1.a(contextJ) : null;
        if (keyguardManagerA == null) {
            O(12, m(R.string.generic_error_no_keyguard));
            return;
        }
        av avVar = this.c0;
        gj gjVar = avVar.d;
        CharSequence charSequence = gjVar != null ? (CharSequence) gjVar.c : null;
        CharSequence charSequence2 = gjVar != null ? (CharSequence) gjVar.d : null;
        avVar.getClass();
        if (charSequence2 == null) {
            charSequence2 = null;
        }
        Intent intentA = ku.a(keyguardManagerA, charSequence, charSequence2);
        if (intentA == null) {
            O(14, m(R.string.generic_error_no_device_credential));
            return;
        }
        this.c0.m = true;
        if (M()) {
            K();
        }
        intentA.setFlags(134742016);
        if (this.C == null) {
            m51.j(this, " not attached to Activity", "Fragment ");
            return;
        }
        nd1 nd1VarL = l();
        if (nd1VarL.C == null) {
            nd1VarL.w.getClass();
            intentA.getClass();
            u41.r("Starting activity with a requestCode requires a FragmentActivity host");
        } else {
            String str = this.m;
            jd1 jd1Var = new jd1();
            jd1Var.c = str;
            jd1Var.d = 1;
            nd1VarL.F.addLast(jd1Var);
            nd1VarL.C.a(intentA, null);
        }
    }

    public final void O(int i, CharSequence charSequence) {
        P(i, charSequence);
        J();
    }

    public final void P(int i, CharSequence charSequence) {
        av avVar = this.c0;
        if (avVar.m) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
            return;
        }
        if (!avVar.l) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
            return;
        }
        avVar.l = false;
        Executor ouVar = avVar.b;
        if (ouVar == null) {
            ouVar = new ou(1);
        }
        ouVar.execute(new hu(this, i, charSequence));
    }

    public final void Q(uu uuVar) {
        av avVar = this.c0;
        if (avVar.l) {
            avVar.l = false;
            Executor ouVar = avVar.b;
            if (ouVar == null) {
                ouVar = new ou(1);
            }
            ouVar.execute(new ba(this, 2, uuVar));
        } else {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        }
        J();
    }

    public final void R(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = m(R.string.default_error_msg);
        }
        this.c0.h(2);
        this.c0.g(charSequence);
    }

    public final void S() {
        int i;
        ci4 ci4Var;
        boolean z;
        boolean z2;
        if (this.c0.k) {
            return;
        }
        if (j() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        av avVar = this.c0;
        avVar.k = true;
        avVar.l = true;
        Context contextJ = j();
        int i2 = 0;
        if (contextJ != null) {
            String str = Build.MANUFACTURER;
            if (Build.VERSION.SDK_INT != 29) {
                z2 = false;
            } else {
                if (str != null) {
                    String[] stringArray = contextJ.getResources().getStringArray(R.array.keyguard_biometric_and_credential_exclude_vendors);
                    int length = stringArray.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            z = false;
                            break;
                        } else {
                            if (str.equalsIgnoreCase(stringArray[i3])) {
                                z = true;
                                break;
                            }
                            i3++;
                        }
                    }
                } else {
                    z = false;
                    break;
                }
                z2 = !z;
            }
            if (z2) {
                int iE = this.c0.e();
                if ((iE & KotlinVersion.MAX_COMPONENT_VALUE) == 255 && xr0.g0(iE)) {
                    this.c0.p = true;
                    N();
                    return;
                }
            }
        }
        String str2 = null;
        CancellationSignal cancellationSignal = null;
        if (!M()) {
            BiometricPrompt.Builder builderD = lu.d(F().getApplicationContext());
            av avVar2 = this.c0;
            gj gjVar = avVar2.d;
            CharSequence charSequence = gjVar != null ? (CharSequence) gjVar.c : null;
            CharSequence charSequence2 = gjVar != null ? (CharSequence) gjVar.d : null;
            avVar2.getClass();
            if (charSequence != null) {
                lu.g(builderD, charSequence);
            }
            if (charSequence2 != null) {
                lu.f(builderD, charSequence2);
            }
            av avVar3 = this.c0;
            String str3 = avVar3.i;
            if (str3 != null) {
                str2 = str3;
            } else if (avVar3.d != null) {
                str2 = BuildConfig.VERSION_NAME;
            }
            if (!TextUtils.isEmpty(str2)) {
                Executor ouVar = this.c0.b;
                if (ouVar == null) {
                    ouVar = new ou(1);
                }
                av avVar4 = this.c0;
                if (avVar4.h == null) {
                    avVar4.h = new zu(avVar4);
                }
                lu.e(builderD, str2, ouVar, avVar4.h);
            }
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 29) {
                gj gjVar2 = this.c0.d;
                mu.a(builderD, true);
            }
            int iE2 = this.c0.e();
            if (i4 >= 30) {
                nu.a(builderD, iE2);
            } else if (i4 >= 29) {
                mu.b(builderD, xr0.g0(iE2));
            }
            BiometricPrompt biometricPromptC = lu.c(builderD);
            Context contextJ2 = j();
            BiometricPrompt.CryptoObject cryptoObjectL0 = vl0.l0(this.c0.e);
            av avVar5 = this.c0;
            if (avVar5.g == null) {
                avVar5.g = new bi4(3);
            }
            bi4 bi4Var = avVar5.g;
            if (((CancellationSignal) bi4Var.c) == null) {
                bi4Var.c = v00.b();
            }
            CancellationSignal cancellationSignal2 = (CancellationSignal) bi4Var.c;
            ou ouVar2 = new ou(0);
            av avVar6 = this.c0;
            if (avVar6.f == null) {
                avVar6.f = new ci4(new yu(avVar6));
            }
            ci4 ci4Var2 = avVar6.f;
            if (((BiometricPrompt$AuthenticationCallback) ci4Var2.d) == null) {
                ci4Var2.d = mn.a((yu) ci4Var2.l);
            }
            BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback = (BiometricPrompt$AuthenticationCallback) ci4Var2.d;
            try {
                if (cryptoObjectL0 == null) {
                    lu.b(biometricPromptC, cancellationSignal2, ouVar2, biometricPrompt$AuthenticationCallback);
                } else {
                    lu.a(biometricPromptC, cryptoObjectL0, cancellationSignal2, ouVar2, biometricPrompt$AuthenticationCallback);
                }
                return;
            } catch (NullPointerException e) {
                Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e);
                O(1, contextJ2 != null ? contextJ2.getString(R.string.default_error_msg) : BuildConfig.VERSION_NAME);
                return;
            }
        }
        Context applicationContext = F().getApplicationContext();
        FingerprintManager fingerprintManagerC = m71.c(applicationContext);
        if (fingerprintManagerC == null || !m71.e(fingerprintManagerC)) {
            i = 12;
        } else {
            FingerprintManager fingerprintManagerC2 = m71.c(applicationContext);
            i = (fingerprintManagerC2 == null || !m71.d(fingerprintManagerC2)) ? 11 : 0;
        }
        if (i != 0) {
            O(i, av1.x(applicationContext, i));
            return;
        }
        if (p()) {
            this.c0.v = true;
            String str4 = Build.MODEL;
            if (Build.VERSION.SDK_INT != 28 || str4 == null) {
                this.d0.postDelayed(new hu(this, i2), 500L);
                boolean z3 = this.n.getBoolean("host_activity", true);
                k71 k71Var = new k71();
                Bundle bundle = new Bundle();
                bundle.putBoolean("host_activity", z3);
                k71Var.H(bundle);
                nd1 nd1VarL = l();
                k71Var.p0 = false;
                k71Var.q0 = true;
                er erVar = new er(nd1VarL);
                erVar.o = true;
                erVar.f(0, k71Var, "androidx.biometric.FingerprintDialogFragment");
                erVar.e(false, true);
                break;
            }
            String[] stringArray2 = applicationContext.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes);
            int length2 = stringArray2.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length2) {
                    this.d0.postDelayed(new hu(this, i2), 500L);
                    boolean z4 = this.n.getBoolean("host_activity", true);
                    k71 k71Var2 = new k71();
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("host_activity", z4);
                    k71Var2.H(bundle2);
                    nd1 nd1VarL2 = l();
                    k71Var2.p0 = false;
                    k71Var2.q0 = true;
                    er erVar2 = new er(nd1VarL2);
                    erVar2.o = true;
                    erVar2.f(0, k71Var2, "androidx.biometric.FingerprintDialogFragment");
                    erVar2.e(false, true);
                    break;
                }
                if (str4.startsWith(stringArray2[i5])) {
                    break;
                } else {
                    i5++;
                }
            }
            av avVar7 = this.c0;
            avVar7.j = 0;
            vu vuVar = avVar7.e;
            if (vuVar != null) {
                Cipher cipher = (Cipher) vuVar.d;
                if (cipher != null) {
                    ci4Var = new ci4(cipher);
                } else {
                    Signature signature = (Signature) vuVar.c;
                    if (signature != null) {
                        ci4Var = new ci4(signature);
                    } else {
                        Mac mac = (Mac) vuVar.h;
                        if (mac != null) {
                            ci4Var = new ci4(mac);
                        } else {
                            int i6 = Build.VERSION.SDK_INT;
                            if (i6 >= 30 && ((IdentityCredential) vuVar.l) != null) {
                                Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
                            } else if (i6 >= 33 && ((PresentationSession) vuVar.m) != null) {
                                Log.e("CryptoObjectUtils", "Presentation session is not supported by FingerprintManager.");
                            }
                            ci4Var = null;
                        }
                    }
                }
            } else {
                ci4Var = null;
            }
            av avVar8 = this.c0;
            if (avVar8.g == null) {
                avVar8.g = new bi4(3);
            }
            bi4 bi4Var2 = avVar8.g;
            if (((wu) bi4Var2.d) == null) {
                bi4Var2.d = new wu();
            }
            wu wuVar = (wu) bi4Var2.d;
            av avVar9 = this.c0;
            if (avVar9.f == null) {
                avVar9.f = new ci4(new yu(avVar9));
            }
            ci4 ci4Var3 = avVar9.f;
            if (((jb) ci4Var3.h) == null) {
                ci4Var3.h = new jb(10, ci4Var3);
            }
            jb jbVar = (jb) ci4Var3.h;
            if (wuVar != null) {
                try {
                    synchronized (wuVar) {
                        try {
                            if (((CancellationSignal) wuVar.b) == null) {
                                CancellationSignal cancellationSignal3 = new CancellationSignal();
                                wuVar.b = cancellationSignal3;
                                if (wuVar.a) {
                                    cancellationSignal3.cancel();
                                }
                            }
                            cancellationSignal = (CancellationSignal) wuVar.b;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (NullPointerException e2) {
                    Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e2);
                    O(1, av1.x(applicationContext, 1));
                    return;
                }
            }
            FingerprintManager fingerprintManagerC3 = m71.c(applicationContext);
            if (fingerprintManagerC3 != null) {
                m71.a(fingerprintManagerC3, m71.g(ci4Var), cancellationSignal, new l71(jbVar));
            }
        }
    }

    @Override // defpackage.xc1
    public final void t(int i, int i2, Intent intent) {
        super.t(i, i2, intent);
        int i3 = 1;
        if (i == 1) {
            av avVar = this.c0;
            avVar.m = false;
            if (i2 != -1) {
                O(10, m(R.string.generic_error_user_canceled));
                return;
            }
            if (avVar.p) {
                avVar.p = false;
                i3 = -1;
            }
            Q(new uu(null, i3));
        }
    }

    @Override // defpackage.xc1
    public final void v(Bundle bundle) {
        super.v(bundle);
        final int i = 1;
        if (this.c0 == null) {
            this.c0 = wu.d(this, this.n.getBoolean("host_activity", true));
        }
        av avVar = this.c0;
        zc1 zc1Var = this.C;
        zh zhVar = zc1Var == null ? null : zc1Var.u;
        avVar.getClass();
        new WeakReference(zhVar);
        av avVar2 = this.c0;
        if (avVar2.q == null) {
            avVar2.q = new ih2();
        }
        final int i2 = 0;
        avVar2.q.d(this, new in2(this) { // from class: ju
            public final /* synthetic */ qu d;

            {
                this.d = this;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x0164 A[LOOP:0: B:97:0x0159->B:101:0x0164, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:102:0x0167  */
            /* JADX WARN: Code duplicated, block: B:105:0x0172 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:107:0x0175  */
            /* JADX WARN: Code duplicated, block: B:118:0x0167 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:119:0x0169 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:73:0x0105  */
            /* JADX WARN: Code duplicated, block: B:75:0x010b A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:77:0x010e  */
            /* JADX WARN: Code duplicated, block: B:80:0x011b  */
            /* JADX WARN: Code duplicated, block: B:84:0x0122  */
            /* JADX WARN: Code duplicated, block: B:86:0x012a  */
            /* JADX WARN: Code duplicated, block: B:88:0x012e  */
            /* JADX WARN: Code duplicated, block: B:89:0x0132  */
            /* JADX WARN: Code duplicated, block: B:91:0x0142  */
            /* JADX WARN: Code duplicated, block: B:98:0x015b  */
            /* JADX WARN: Instruction removed from duplicated block: B:107:0x0175, please report this as an issue */
            @Override // defpackage.in2
            public final void r(Object obj) throws Exception {
                av avVar3;
                Context contextJ;
                String str;
                String[] stringArray;
                int length;
                int i3;
                int i4;
                int i5 = i2;
                int i6 = 2;
                int i7 = 0;
                String strM = null;
                qu quVar = this.d;
                switch (i5) {
                    case 0:
                        uu uuVar = (uu) obj;
                        if (uuVar != null) {
                            quVar.Q(uuVar);
                            av avVar4 = quVar.c0;
                            if (avVar4.q == null) {
                                avVar4.q = new ih2();
                            }
                            av.j(avVar4.q, null);
                        }
                        break;
                    case 1:
                        gu guVar = (gu) obj;
                        if (guVar != null) {
                            int i8 = guVar.a;
                            CharSequence charSequenceX = guVar.b;
                            switch (i8) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                case 6:
                                default:
                                    i8 = 8;
                                    break;
                            }
                            Context contextJ2 = quVar.j();
                            int i9 = Build.VERSION.SDK_INT;
                            if (i9 < 29 && ((i8 == 7 || i8 == 9) && contextJ2 != null)) {
                                KeyguardManager keyguardManagerA = cw1.a(contextJ2);
                                if ((keyguardManagerA == null ? false : cw1.b(keyguardManagerA)) && xr0.g0(quVar.c0.e())) {
                                    quVar.N();
                                } else if (quVar.M()) {
                                    if (charSequenceX == null) {
                                        charSequenceX = av1.x(quVar.j(), i8);
                                    }
                                    avVar3 = quVar.c0;
                                    if (i8 == 5) {
                                        i4 = avVar3.j;
                                        if (i4 != 0) {
                                            quVar.P(i8, charSequenceX);
                                        } else {
                                            quVar.P(i8, charSequenceX);
                                        }
                                        quVar.J();
                                    } else {
                                        if (avVar3.v) {
                                            quVar.O(i8, charSequenceX);
                                        } else {
                                            quVar.R(charSequenceX);
                                            Handler handler = quVar.d0;
                                            iu iuVar = new iu(i8, i7, quVar, charSequenceX);
                                            contextJ = quVar.j();
                                            if (contextJ != null) {
                                                str = Build.MODEL;
                                                if (i9 == 28) {
                                                    i7 = 2000;
                                                } else {
                                                    stringArray = contextJ.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes);
                                                    length = stringArray.length;
                                                    i3 = 0;
                                                    while (true) {
                                                        if (i3 < length) {
                                                            i7 = 2000;
                                                        } else if (str.startsWith(stringArray[i3])) {
                                                            i3++;
                                                        }
                                                    }
                                                }
                                            } else {
                                                i7 = 2000;
                                            }
                                            handler.postDelayed(iuVar, i7);
                                        }
                                        quVar.c0.v = true;
                                    }
                                } else {
                                    if (charSequenceX == null) {
                                        charSequenceX = quVar.m(R.string.default_error_msg) + " " + i8;
                                    }
                                    quVar.O(i8, charSequenceX);
                                }
                            } else if (quVar.M()) {
                                if (charSequenceX == null) {
                                    charSequenceX = av1.x(quVar.j(), i8);
                                }
                                avVar3 = quVar.c0;
                                if (i8 == 5) {
                                    i4 = avVar3.j;
                                    if (i4 != 0 || i4 == 3) {
                                        quVar.P(i8, charSequenceX);
                                    }
                                    quVar.J();
                                } else {
                                    if (avVar3.v) {
                                        quVar.O(i8, charSequenceX);
                                    } else {
                                        quVar.R(charSequenceX);
                                        Handler handler2 = quVar.d0;
                                        iu iuVar2 = new iu(i8, i7, quVar, charSequenceX);
                                        contextJ = quVar.j();
                                        if (contextJ != null) {
                                            str = Build.MODEL;
                                            if (i9 == 28 || str == null) {
                                                i7 = 2000;
                                            } else {
                                                stringArray = contextJ.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes);
                                                length = stringArray.length;
                                                i3 = 0;
                                                while (true) {
                                                    if (i3 < length) {
                                                        i7 = 2000;
                                                    } else if (str.startsWith(stringArray[i3])) {
                                                        i3++;
                                                    }
                                                }
                                            }
                                        } else {
                                            i7 = 2000;
                                        }
                                        handler2.postDelayed(iuVar2, i7);
                                    }
                                    quVar.c0.v = true;
                                }
                            } else {
                                if (charSequenceX == null) {
                                    charSequenceX = quVar.m(R.string.default_error_msg) + " " + i8;
                                }
                                quVar.O(i8, charSequenceX);
                            }
                            quVar.c0.f(null);
                        }
                        break;
                    case 2:
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null) {
                            if (quVar.M()) {
                                quVar.R(charSequence);
                            }
                            quVar.c0.f(null);
                        }
                        break;
                    case 3:
                        if (((Boolean) obj).booleanValue()) {
                            if (quVar.M()) {
                                quVar.R(quVar.m(R.string.fingerprint_not_recognized));
                            }
                            av avVar5 = quVar.c0;
                            if (avVar5.l) {
                                Executor ouVar = avVar5.b;
                                if (ouVar == null) {
                                    ouVar = new ou(1);
                                }
                                ouVar.execute(new hu(quVar, i6));
                            } else {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            av avVar6 = quVar.c0;
                            if (avVar6.t == null) {
                                avVar6.t = new ih2();
                            }
                            av.j(avVar6.t, Boolean.FALSE);
                        }
                        break;
                    case 4:
                        if (((Boolean) obj).booleanValue()) {
                            if (quVar.L()) {
                                quVar.N();
                            } else {
                                av avVar7 = quVar.c0;
                                String str2 = avVar7.i;
                                if (str2 != null) {
                                    strM = str2;
                                } else if (avVar7.d != null) {
                                    strM = BuildConfig.VERSION_NAME;
                                }
                                if (strM == null) {
                                    strM = quVar.m(R.string.default_error_msg);
                                }
                                quVar.O(13, strM);
                                quVar.I(2);
                            }
                            quVar.c0.i(false);
                        }
                        break;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            quVar.I(1);
                            quVar.J();
                            av avVar8 = quVar.c0;
                            if (avVar8.w == null) {
                                avVar8.w = new ih2();
                            }
                            av.j(avVar8.w, Boolean.FALSE);
                        }
                        break;
                }
            }
        });
        av avVar3 = this.c0;
        if (avVar3.r == null) {
            avVar3.r = new ih2();
        }
        avVar3.r.d(this, new in2(this) { // from class: ju
            public final /* synthetic */ qu d;

            {
                this.d = this;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x0164 A[LOOP:0: B:97:0x0159->B:101:0x0164, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:102:0x0167  */
            /* JADX WARN: Code duplicated, block: B:105:0x0172 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:107:0x0175  */
            /* JADX WARN: Code duplicated, block: B:118:0x0167 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:119:0x0169 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:73:0x0105  */
            /* JADX WARN: Code duplicated, block: B:75:0x010b A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:77:0x010e  */
            /* JADX WARN: Code duplicated, block: B:80:0x011b  */
            /* JADX WARN: Code duplicated, block: B:84:0x0122  */
            /* JADX WARN: Code duplicated, block: B:86:0x012a  */
            /* JADX WARN: Code duplicated, block: B:88:0x012e  */
            /* JADX WARN: Code duplicated, block: B:89:0x0132  */
            /* JADX WARN: Code duplicated, block: B:91:0x0142  */
            /* JADX WARN: Code duplicated, block: B:98:0x015b  */
            /* JADX WARN: Instruction removed from duplicated block: B:107:0x0175, please report this as an issue */
            @Override // defpackage.in2
            public final void r(Object obj) throws Exception {
                av avVar4;
                Context contextJ;
                String str;
                String[] stringArray;
                int length;
                int i3;
                int i4;
                int i5 = i;
                int i6 = 2;
                int i7 = 0;
                String strM = null;
                qu quVar = this.d;
                switch (i5) {
                    case 0:
                        uu uuVar = (uu) obj;
                        if (uuVar != null) {
                            quVar.Q(uuVar);
                            av avVar5 = quVar.c0;
                            if (avVar5.q == null) {
                                avVar5.q = new ih2();
                            }
                            av.j(avVar5.q, null);
                        }
                        break;
                    case 1:
                        gu guVar = (gu) obj;
                        if (guVar != null) {
                            int i8 = guVar.a;
                            CharSequence charSequenceX = guVar.b;
                            switch (i8) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                case 6:
                                default:
                                    i8 = 8;
                                    break;
                            }
                            Context contextJ2 = quVar.j();
                            int i9 = Build.VERSION.SDK_INT;
                            if (i9 < 29 && ((i8 == 7 || i8 == 9) && contextJ2 != null)) {
                                KeyguardManager keyguardManagerA = cw1.a(contextJ2);
                                if ((keyguardManagerA == null ? false : cw1.b(keyguardManagerA)) && xr0.g0(quVar.c0.e())) {
                                    quVar.N();
                                } else if (quVar.M()) {
                                    if (charSequenceX == null) {
                                        charSequenceX = av1.x(quVar.j(), i8);
                                    }
                                    avVar4 = quVar.c0;
                                    if (i8 == 5) {
                                        i4 = avVar4.j;
                                        if (i4 != 0) {
                                            quVar.P(i8, charSequenceX);
                                        } else {
                                            quVar.P(i8, charSequenceX);
                                        }
                                        quVar.J();
                                    } else {
                                        if (avVar4.v) {
                                            quVar.O(i8, charSequenceX);
                                        } else {
                                            quVar.R(charSequenceX);
                                            Handler handler2 = quVar.d0;
                                            iu iuVar2 = new iu(i8, i7, quVar, charSequenceX);
                                            contextJ = quVar.j();
                                            if (contextJ != null) {
                                                str = Build.MODEL;
                                                if (i9 == 28) {
                                                    i7 = 2000;
                                                } else {
                                                    stringArray = contextJ.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes);
                                                    length = stringArray.length;
                                                    i3 = 0;
                                                    while (true) {
                                                        if (i3 < length) {
                                                            i7 = 2000;
                                                        } else if (str.startsWith(stringArray[i3])) {
                                                            i3++;
                                                        }
                                                    }
                                                }
                                            } else {
                                                i7 = 2000;
                                            }
                                            handler2.postDelayed(iuVar2, i7);
                                        }
                                        quVar.c0.v = true;
                                    }
                                } else {
                                    if (charSequenceX == null) {
                                        charSequenceX = quVar.m(R.string.default_error_msg) + " " + i8;
                                    }
                                    quVar.O(i8, charSequenceX);
                                }
                            } else if (quVar.M()) {
                                if (charSequenceX == null) {
                                    charSequenceX = av1.x(quVar.j(), i8);
                                }
                                avVar4 = quVar.c0;
                                if (i8 == 5) {
                                    i4 = avVar4.j;
                                    if (i4 != 0 || i4 == 3) {
                                        quVar.P(i8, charSequenceX);
                                    }
                                    quVar.J();
                                } else {
                                    if (avVar4.v) {
                                        quVar.O(i8, charSequenceX);
                                    } else {
                                        quVar.R(charSequenceX);
                                        Handler handler3 = quVar.d0;
                                        iu iuVar3 = new iu(i8, i7, quVar, charSequenceX);
                                        contextJ = quVar.j();
                                        if (contextJ != null) {
                                            str = Build.MODEL;
                                            if (i9 == 28 || str == null) {
                                                i7 = 2000;
                                            } else {
                                                stringArray = contextJ.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes);
                                                length = stringArray.length;
                                                i3 = 0;
                                                while (true) {
                                                    if (i3 < length) {
                                                        i7 = 2000;
                                                    } else if (str.startsWith(stringArray[i3])) {
                                                        i3++;
                                                    }
                                                }
                                            }
                                        } else {
                                            i7 = 2000;
                                        }
                                        handler3.postDelayed(iuVar3, i7);
                                    }
                                    quVar.c0.v = true;
                                }
                            } else {
                                if (charSequenceX == null) {
                                    charSequenceX = quVar.m(R.string.default_error_msg) + " " + i8;
                                }
                                quVar.O(i8, charSequenceX);
                            }
                            quVar.c0.f(null);
                        }
                        break;
                    case 2:
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null) {
                            if (quVar.M()) {
                                quVar.R(charSequence);
                            }
                            quVar.c0.f(null);
                        }
                        break;
                    case 3:
                        if (((Boolean) obj).booleanValue()) {
                            if (quVar.M()) {
                                quVar.R(quVar.m(R.string.fingerprint_not_recognized));
                            }
                            av avVar6 = quVar.c0;
                            if (avVar6.l) {
                                Executor ouVar = avVar6.b;
                                if (ouVar == null) {
                                    ouVar = new ou(1);
                                }
                                ouVar.execute(new hu(quVar, i6));
                            } else {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            av avVar7 = quVar.c0;
                            if (avVar7.t == null) {
                                avVar7.t = new ih2();
                            }
                            av.j(avVar7.t, Boolean.FALSE);
                        }
                        break;
                    case 4:
                        if (((Boolean) obj).booleanValue()) {
                            if (quVar.L()) {
                                quVar.N();
                            } else {
                                av avVar8 = quVar.c0;
                                String str2 = avVar8.i;
                                if (str2 != null) {
                                    strM = str2;
                                } else if (avVar8.d != null) {
                                    strM = BuildConfig.VERSION_NAME;
                                }
                                if (strM == null) {
                                    strM = quVar.m(R.string.default_error_msg);
                                }
                                quVar.O(13, strM);
                                quVar.I(2);
                            }
                            quVar.c0.i(false);
                        }
                        break;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            quVar.I(1);
                            quVar.J();
                            av avVar9 = quVar.c0;
                            if (avVar9.w == null) {
                                avVar9.w = new ih2();
                            }
                            av.j(avVar9.w, Boolean.FALSE);
                        }
                        break;
                }
            }
        });
        av avVar4 = this.c0;
        if (avVar4.s == null) {
            avVar4.s = new ih2();
        }
        final int i3 = 2;
        avVar4.s.d(this, new in2(this) { // from class: ju
            public final /* synthetic */ qu d;

            {
                this.d = this;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x0164 A[LOOP:0: B:97:0x0159->B:101:0x0164, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:102:0x0167  */
            /* JADX WARN: Code duplicated, block: B:105:0x0172 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:107:0x0175  */
            /* JADX WARN: Code duplicated, block: B:118:0x0167 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:119:0x0169 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:73:0x0105  */
            /* JADX WARN: Code duplicated, block: B:75:0x010b A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:77:0x010e  */
            /* JADX WARN: Code duplicated, block: B:80:0x011b  */
            /* JADX WARN: Code duplicated, block: B:84:0x0122  */
            /* JADX WARN: Code duplicated, block: B:86:0x012a  */
            /* JADX WARN: Code duplicated, block: B:88:0x012e  */
            /* JADX WARN: Code duplicated, block: B:89:0x0132  */
            /* JADX WARN: Code duplicated, block: B:91:0x0142  */
            /* JADX WARN: Code duplicated, block: B:98:0x015b  */
            /* JADX WARN: Instruction removed from duplicated block: B:107:0x0175, please report this as an issue */
            @Override // defpackage.in2
            public final void r(Object obj) throws Exception {
                av avVar5;
                Context contextJ;
                String str;
                String[] stringArray;
                int length;
                int i4;
                int i5;
                int i6 = i3;
                int i7 = 2;
                int i8 = 0;
                String strM = null;
                qu quVar = this.d;
                switch (i6) {
                    case 0:
                        uu uuVar = (uu) obj;
                        if (uuVar != null) {
                            quVar.Q(uuVar);
                            av avVar6 = quVar.c0;
                            if (avVar6.q == null) {
                                avVar6.q = new ih2();
                            }
                            av.j(avVar6.q, null);
                        }
                        break;
                    case 1:
                        gu guVar = (gu) obj;
                        if (guVar != null) {
                            int i9 = guVar.a;
                            CharSequence charSequenceX = guVar.b;
                            switch (i9) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                case 6:
                                default:
                                    i9 = 8;
                                    break;
                            }
                            Context contextJ2 = quVar.j();
                            int i10 = Build.VERSION.SDK_INT;
                            if (i10 < 29 && ((i9 == 7 || i9 == 9) && contextJ2 != null)) {
                                KeyguardManager keyguardManagerA = cw1.a(contextJ2);
                                if ((keyguardManagerA == null ? false : cw1.b(keyguardManagerA)) && xr0.g0(quVar.c0.e())) {
                                    quVar.N();
                                } else if (quVar.M()) {
                                    if (charSequenceX == null) {
                                        charSequenceX = av1.x(quVar.j(), i9);
                                    }
                                    avVar5 = quVar.c0;
                                    if (i9 == 5) {
                                        i5 = avVar5.j;
                                        if (i5 != 0) {
                                            quVar.P(i9, charSequenceX);
                                        } else {
                                            quVar.P(i9, charSequenceX);
                                        }
                                        quVar.J();
                                    } else {
                                        if (avVar5.v) {
                                            quVar.O(i9, charSequenceX);
                                        } else {
                                            quVar.R(charSequenceX);
                                            Handler handler3 = quVar.d0;
                                            iu iuVar3 = new iu(i9, i8, quVar, charSequenceX);
                                            contextJ = quVar.j();
                                            if (contextJ != null) {
                                                str = Build.MODEL;
                                                if (i10 == 28) {
                                                    i8 = 2000;
                                                } else {
                                                    stringArray = contextJ.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes);
                                                    length = stringArray.length;
                                                    i4 = 0;
                                                    while (true) {
                                                        if (i4 < length) {
                                                            i8 = 2000;
                                                        } else if (str.startsWith(stringArray[i4])) {
                                                            i4++;
                                                        }
                                                    }
                                                }
                                            } else {
                                                i8 = 2000;
                                            }
                                            handler3.postDelayed(iuVar3, i8);
                                        }
                                        quVar.c0.v = true;
                                    }
                                } else {
                                    if (charSequenceX == null) {
                                        charSequenceX = quVar.m(R.string.default_error_msg) + " " + i9;
                                    }
                                    quVar.O(i9, charSequenceX);
                                }
                            } else if (quVar.M()) {
                                if (charSequenceX == null) {
                                    charSequenceX = av1.x(quVar.j(), i9);
                                }
                                avVar5 = quVar.c0;
                                if (i9 == 5) {
                                    i5 = avVar5.j;
                                    if (i5 != 0 || i5 == 3) {
                                        quVar.P(i9, charSequenceX);
                                    }
                                    quVar.J();
                                } else {
                                    if (avVar5.v) {
                                        quVar.O(i9, charSequenceX);
                                    } else {
                                        quVar.R(charSequenceX);
                                        Handler handler4 = quVar.d0;
                                        iu iuVar4 = new iu(i9, i8, quVar, charSequenceX);
                                        contextJ = quVar.j();
                                        if (contextJ != null) {
                                            str = Build.MODEL;
                                            if (i10 == 28 || str == null) {
                                                i8 = 2000;
                                            } else {
                                                stringArray = contextJ.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes);
                                                length = stringArray.length;
                                                i4 = 0;
                                                while (true) {
                                                    if (i4 < length) {
                                                        i8 = 2000;
                                                    } else if (str.startsWith(stringArray[i4])) {
                                                        i4++;
                                                    }
                                                }
                                            }
                                        } else {
                                            i8 = 2000;
                                        }
                                        handler4.postDelayed(iuVar4, i8);
                                    }
                                    quVar.c0.v = true;
                                }
                            } else {
                                if (charSequenceX == null) {
                                    charSequenceX = quVar.m(R.string.default_error_msg) + " " + i9;
                                }
                                quVar.O(i9, charSequenceX);
                            }
                            quVar.c0.f(null);
                        }
                        break;
                    case 2:
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null) {
                            if (quVar.M()) {
                                quVar.R(charSequence);
                            }
                            quVar.c0.f(null);
                        }
                        break;
                    case 3:
                        if (((Boolean) obj).booleanValue()) {
                            if (quVar.M()) {
                                quVar.R(quVar.m(R.string.fingerprint_not_recognized));
                            }
                            av avVar7 = quVar.c0;
                            if (avVar7.l) {
                                Executor ouVar = avVar7.b;
                                if (ouVar == null) {
                                    ouVar = new ou(1);
                                }
                                ouVar.execute(new hu(quVar, i7));
                            } else {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            av avVar8 = quVar.c0;
                            if (avVar8.t == null) {
                                avVar8.t = new ih2();
                            }
                            av.j(avVar8.t, Boolean.FALSE);
                        }
                        break;
                    case 4:
                        if (((Boolean) obj).booleanValue()) {
                            if (quVar.L()) {
                                quVar.N();
                            } else {
                                av avVar9 = quVar.c0;
                                String str2 = avVar9.i;
                                if (str2 != null) {
                                    strM = str2;
                                } else if (avVar9.d != null) {
                                    strM = BuildConfig.VERSION_NAME;
                                }
                                if (strM == null) {
                                    strM = quVar.m(R.string.default_error_msg);
                                }
                                quVar.O(13, strM);
                                quVar.I(2);
                            }
                            quVar.c0.i(false);
                        }
                        break;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            quVar.I(1);
                            quVar.J();
                            av avVar10 = quVar.c0;
                            if (avVar10.w == null) {
                                avVar10.w = new ih2();
                            }
                            av.j(avVar10.w, Boolean.FALSE);
                        }
                        break;
                }
            }
        });
        av avVar5 = this.c0;
        if (avVar5.t == null) {
            avVar5.t = new ih2();
        }
        final int i4 = 3;
        avVar5.t.d(this, new in2(this) { // from class: ju
            public final /* synthetic */ qu d;

            {
                this.d = this;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x0164 A[LOOP:0: B:97:0x0159->B:101:0x0164, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:102:0x0167  */
            /* JADX WARN: Code duplicated, block: B:105:0x0172 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:107:0x0175  */
            /* JADX WARN: Code duplicated, block: B:118:0x0167 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:119:0x0169 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:73:0x0105  */
            /* JADX WARN: Code duplicated, block: B:75:0x010b A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:77:0x010e  */
            /* JADX WARN: Code duplicated, block: B:80:0x011b  */
            /* JADX WARN: Code duplicated, block: B:84:0x0122  */
            /* JADX WARN: Code duplicated, block: B:86:0x012a  */
            /* JADX WARN: Code duplicated, block: B:88:0x012e  */
            /* JADX WARN: Code duplicated, block: B:89:0x0132  */
            /* JADX WARN: Code duplicated, block: B:91:0x0142  */
            /* JADX WARN: Code duplicated, block: B:98:0x015b  */
            /* JADX WARN: Instruction removed from duplicated block: B:107:0x0175, please report this as an issue */
            @Override // defpackage.in2
            public final void r(Object obj) throws Exception {
                av avVar6;
                Context contextJ;
                String str;
                String[] stringArray;
                int length;
                int i5;
                int i6;
                int i7 = i4;
                int i8 = 2;
                int i9 = 0;
                String strM = null;
                qu quVar = this.d;
                switch (i7) {
                    case 0:
                        uu uuVar = (uu) obj;
                        if (uuVar != null) {
                            quVar.Q(uuVar);
                            av avVar7 = quVar.c0;
                            if (avVar7.q == null) {
                                avVar7.q = new ih2();
                            }
                            av.j(avVar7.q, null);
                        }
                        break;
                    case 1:
                        gu guVar = (gu) obj;
                        if (guVar != null) {
                            int i10 = guVar.a;
                            CharSequence charSequenceX = guVar.b;
                            switch (i10) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                case 6:
                                default:
                                    i10 = 8;
                                    break;
                            }
                            Context contextJ2 = quVar.j();
                            int i11 = Build.VERSION.SDK_INT;
                            if (i11 < 29 && ((i10 == 7 || i10 == 9) && contextJ2 != null)) {
                                KeyguardManager keyguardManagerA = cw1.a(contextJ2);
                                if ((keyguardManagerA == null ? false : cw1.b(keyguardManagerA)) && xr0.g0(quVar.c0.e())) {
                                    quVar.N();
                                } else if (quVar.M()) {
                                    if (charSequenceX == null) {
                                        charSequenceX = av1.x(quVar.j(), i10);
                                    }
                                    avVar6 = quVar.c0;
                                    if (i10 == 5) {
                                        i6 = avVar6.j;
                                        if (i6 != 0) {
                                            quVar.P(i10, charSequenceX);
                                        } else {
                                            quVar.P(i10, charSequenceX);
                                        }
                                        quVar.J();
                                    } else {
                                        if (avVar6.v) {
                                            quVar.O(i10, charSequenceX);
                                        } else {
                                            quVar.R(charSequenceX);
                                            Handler handler4 = quVar.d0;
                                            iu iuVar4 = new iu(i10, i9, quVar, charSequenceX);
                                            contextJ = quVar.j();
                                            if (contextJ != null) {
                                                str = Build.MODEL;
                                                if (i11 == 28) {
                                                    i9 = 2000;
                                                } else {
                                                    stringArray = contextJ.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes);
                                                    length = stringArray.length;
                                                    i5 = 0;
                                                    while (true) {
                                                        if (i5 < length) {
                                                            i9 = 2000;
                                                        } else if (str.startsWith(stringArray[i5])) {
                                                            i5++;
                                                        }
                                                    }
                                                }
                                            } else {
                                                i9 = 2000;
                                            }
                                            handler4.postDelayed(iuVar4, i9);
                                        }
                                        quVar.c0.v = true;
                                    }
                                } else {
                                    if (charSequenceX == null) {
                                        charSequenceX = quVar.m(R.string.default_error_msg) + " " + i10;
                                    }
                                    quVar.O(i10, charSequenceX);
                                }
                            } else if (quVar.M()) {
                                if (charSequenceX == null) {
                                    charSequenceX = av1.x(quVar.j(), i10);
                                }
                                avVar6 = quVar.c0;
                                if (i10 == 5) {
                                    i6 = avVar6.j;
                                    if (i6 != 0 || i6 == 3) {
                                        quVar.P(i10, charSequenceX);
                                    }
                                    quVar.J();
                                } else {
                                    if (avVar6.v) {
                                        quVar.O(i10, charSequenceX);
                                    } else {
                                        quVar.R(charSequenceX);
                                        Handler handler5 = quVar.d0;
                                        iu iuVar5 = new iu(i10, i9, quVar, charSequenceX);
                                        contextJ = quVar.j();
                                        if (contextJ != null) {
                                            str = Build.MODEL;
                                            if (i11 == 28 || str == null) {
                                                i9 = 2000;
                                            } else {
                                                stringArray = contextJ.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes);
                                                length = stringArray.length;
                                                i5 = 0;
                                                while (true) {
                                                    if (i5 < length) {
                                                        i9 = 2000;
                                                    } else if (str.startsWith(stringArray[i5])) {
                                                        i5++;
                                                    }
                                                }
                                            }
                                        } else {
                                            i9 = 2000;
                                        }
                                        handler5.postDelayed(iuVar5, i9);
                                    }
                                    quVar.c0.v = true;
                                }
                            } else {
                                if (charSequenceX == null) {
                                    charSequenceX = quVar.m(R.string.default_error_msg) + " " + i10;
                                }
                                quVar.O(i10, charSequenceX);
                            }
                            quVar.c0.f(null);
                        }
                        break;
                    case 2:
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null) {
                            if (quVar.M()) {
                                quVar.R(charSequence);
                            }
                            quVar.c0.f(null);
                        }
                        break;
                    case 3:
                        if (((Boolean) obj).booleanValue()) {
                            if (quVar.M()) {
                                quVar.R(quVar.m(R.string.fingerprint_not_recognized));
                            }
                            av avVar8 = quVar.c0;
                            if (avVar8.l) {
                                Executor ouVar = avVar8.b;
                                if (ouVar == null) {
                                    ouVar = new ou(1);
                                }
                                ouVar.execute(new hu(quVar, i8));
                            } else {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            av avVar9 = quVar.c0;
                            if (avVar9.t == null) {
                                avVar9.t = new ih2();
                            }
                            av.j(avVar9.t, Boolean.FALSE);
                        }
                        break;
                    case 4:
                        if (((Boolean) obj).booleanValue()) {
                            if (quVar.L()) {
                                quVar.N();
                            } else {
                                av avVar10 = quVar.c0;
                                String str2 = avVar10.i;
                                if (str2 != null) {
                                    strM = str2;
                                } else if (avVar10.d != null) {
                                    strM = BuildConfig.VERSION_NAME;
                                }
                                if (strM == null) {
                                    strM = quVar.m(R.string.default_error_msg);
                                }
                                quVar.O(13, strM);
                                quVar.I(2);
                            }
                            quVar.c0.i(false);
                        }
                        break;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            quVar.I(1);
                            quVar.J();
                            av avVar11 = quVar.c0;
                            if (avVar11.w == null) {
                                avVar11.w = new ih2();
                            }
                            av.j(avVar11.w, Boolean.FALSE);
                        }
                        break;
                }
            }
        });
        av avVar6 = this.c0;
        if (avVar6.u == null) {
            avVar6.u = new ih2();
        }
        final int i5 = 4;
        avVar6.u.d(this, new in2(this) { // from class: ju
            public final /* synthetic */ qu d;

            {
                this.d = this;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x0164 A[LOOP:0: B:97:0x0159->B:101:0x0164, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:102:0x0167  */
            /* JADX WARN: Code duplicated, block: B:105:0x0172 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:107:0x0175  */
            /* JADX WARN: Code duplicated, block: B:118:0x0167 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:119:0x0169 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:73:0x0105  */
            /* JADX WARN: Code duplicated, block: B:75:0x010b A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:77:0x010e  */
            /* JADX WARN: Code duplicated, block: B:80:0x011b  */
            /* JADX WARN: Code duplicated, block: B:84:0x0122  */
            /* JADX WARN: Code duplicated, block: B:86:0x012a  */
            /* JADX WARN: Code duplicated, block: B:88:0x012e  */
            /* JADX WARN: Code duplicated, block: B:89:0x0132  */
            /* JADX WARN: Code duplicated, block: B:91:0x0142  */
            /* JADX WARN: Code duplicated, block: B:98:0x015b  */
            /* JADX WARN: Instruction removed from duplicated block: B:107:0x0175, please report this as an issue */
            @Override // defpackage.in2
            public final void r(Object obj) throws Exception {
                av avVar7;
                Context contextJ;
                String str;
                String[] stringArray;
                int length;
                int i6;
                int i7;
                int i8 = i5;
                int i9 = 2;
                int i10 = 0;
                String strM = null;
                qu quVar = this.d;
                switch (i8) {
                    case 0:
                        uu uuVar = (uu) obj;
                        if (uuVar != null) {
                            quVar.Q(uuVar);
                            av avVar8 = quVar.c0;
                            if (avVar8.q == null) {
                                avVar8.q = new ih2();
                            }
                            av.j(avVar8.q, null);
                        }
                        break;
                    case 1:
                        gu guVar = (gu) obj;
                        if (guVar != null) {
                            int i11 = guVar.a;
                            CharSequence charSequenceX = guVar.b;
                            switch (i11) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                case 6:
                                default:
                                    i11 = 8;
                                    break;
                            }
                            Context contextJ2 = quVar.j();
                            int i12 = Build.VERSION.SDK_INT;
                            if (i12 < 29 && ((i11 == 7 || i11 == 9) && contextJ2 != null)) {
                                KeyguardManager keyguardManagerA = cw1.a(contextJ2);
                                if ((keyguardManagerA == null ? false : cw1.b(keyguardManagerA)) && xr0.g0(quVar.c0.e())) {
                                    quVar.N();
                                } else if (quVar.M()) {
                                    if (charSequenceX == null) {
                                        charSequenceX = av1.x(quVar.j(), i11);
                                    }
                                    avVar7 = quVar.c0;
                                    if (i11 == 5) {
                                        i7 = avVar7.j;
                                        if (i7 != 0) {
                                            quVar.P(i11, charSequenceX);
                                        } else {
                                            quVar.P(i11, charSequenceX);
                                        }
                                        quVar.J();
                                    } else {
                                        if (avVar7.v) {
                                            quVar.O(i11, charSequenceX);
                                        } else {
                                            quVar.R(charSequenceX);
                                            Handler handler5 = quVar.d0;
                                            iu iuVar5 = new iu(i11, i10, quVar, charSequenceX);
                                            contextJ = quVar.j();
                                            if (contextJ != null) {
                                                str = Build.MODEL;
                                                if (i12 == 28) {
                                                    i10 = 2000;
                                                } else {
                                                    stringArray = contextJ.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes);
                                                    length = stringArray.length;
                                                    i6 = 0;
                                                    while (true) {
                                                        if (i6 < length) {
                                                            i10 = 2000;
                                                        } else if (str.startsWith(stringArray[i6])) {
                                                            i6++;
                                                        }
                                                    }
                                                }
                                            } else {
                                                i10 = 2000;
                                            }
                                            handler5.postDelayed(iuVar5, i10);
                                        }
                                        quVar.c0.v = true;
                                    }
                                } else {
                                    if (charSequenceX == null) {
                                        charSequenceX = quVar.m(R.string.default_error_msg) + " " + i11;
                                    }
                                    quVar.O(i11, charSequenceX);
                                }
                            } else if (quVar.M()) {
                                if (charSequenceX == null) {
                                    charSequenceX = av1.x(quVar.j(), i11);
                                }
                                avVar7 = quVar.c0;
                                if (i11 == 5) {
                                    i7 = avVar7.j;
                                    if (i7 != 0 || i7 == 3) {
                                        quVar.P(i11, charSequenceX);
                                    }
                                    quVar.J();
                                } else {
                                    if (avVar7.v) {
                                        quVar.O(i11, charSequenceX);
                                    } else {
                                        quVar.R(charSequenceX);
                                        Handler handler6 = quVar.d0;
                                        iu iuVar6 = new iu(i11, i10, quVar, charSequenceX);
                                        contextJ = quVar.j();
                                        if (contextJ != null) {
                                            str = Build.MODEL;
                                            if (i12 == 28 || str == null) {
                                                i10 = 2000;
                                            } else {
                                                stringArray = contextJ.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes);
                                                length = stringArray.length;
                                                i6 = 0;
                                                while (true) {
                                                    if (i6 < length) {
                                                        i10 = 2000;
                                                    } else if (str.startsWith(stringArray[i6])) {
                                                        i6++;
                                                    }
                                                }
                                            }
                                        } else {
                                            i10 = 2000;
                                        }
                                        handler6.postDelayed(iuVar6, i10);
                                    }
                                    quVar.c0.v = true;
                                }
                            } else {
                                if (charSequenceX == null) {
                                    charSequenceX = quVar.m(R.string.default_error_msg) + " " + i11;
                                }
                                quVar.O(i11, charSequenceX);
                            }
                            quVar.c0.f(null);
                        }
                        break;
                    case 2:
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null) {
                            if (quVar.M()) {
                                quVar.R(charSequence);
                            }
                            quVar.c0.f(null);
                        }
                        break;
                    case 3:
                        if (((Boolean) obj).booleanValue()) {
                            if (quVar.M()) {
                                quVar.R(quVar.m(R.string.fingerprint_not_recognized));
                            }
                            av avVar9 = quVar.c0;
                            if (avVar9.l) {
                                Executor ouVar = avVar9.b;
                                if (ouVar == null) {
                                    ouVar = new ou(1);
                                }
                                ouVar.execute(new hu(quVar, i9));
                            } else {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            av avVar10 = quVar.c0;
                            if (avVar10.t == null) {
                                avVar10.t = new ih2();
                            }
                            av.j(avVar10.t, Boolean.FALSE);
                        }
                        break;
                    case 4:
                        if (((Boolean) obj).booleanValue()) {
                            if (quVar.L()) {
                                quVar.N();
                            } else {
                                av avVar11 = quVar.c0;
                                String str2 = avVar11.i;
                                if (str2 != null) {
                                    strM = str2;
                                } else if (avVar11.d != null) {
                                    strM = BuildConfig.VERSION_NAME;
                                }
                                if (strM == null) {
                                    strM = quVar.m(R.string.default_error_msg);
                                }
                                quVar.O(13, strM);
                                quVar.I(2);
                            }
                            quVar.c0.i(false);
                        }
                        break;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            quVar.I(1);
                            quVar.J();
                            av avVar12 = quVar.c0;
                            if (avVar12.w == null) {
                                avVar12.w = new ih2();
                            }
                            av.j(avVar12.w, Boolean.FALSE);
                        }
                        break;
                }
            }
        });
        av avVar7 = this.c0;
        if (avVar7.w == null) {
            avVar7.w = new ih2();
        }
        final int i6 = 5;
        avVar7.w.d(this, new in2(this) { // from class: ju
            public final /* synthetic */ qu d;

            {
                this.d = this;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x0164 A[LOOP:0: B:97:0x0159->B:101:0x0164, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:102:0x0167  */
            /* JADX WARN: Code duplicated, block: B:105:0x0172 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:107:0x0175  */
            /* JADX WARN: Code duplicated, block: B:118:0x0167 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:119:0x0169 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:73:0x0105  */
            /* JADX WARN: Code duplicated, block: B:75:0x010b A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:77:0x010e  */
            /* JADX WARN: Code duplicated, block: B:80:0x011b  */
            /* JADX WARN: Code duplicated, block: B:84:0x0122  */
            /* JADX WARN: Code duplicated, block: B:86:0x012a  */
            /* JADX WARN: Code duplicated, block: B:88:0x012e  */
            /* JADX WARN: Code duplicated, block: B:89:0x0132  */
            /* JADX WARN: Code duplicated, block: B:91:0x0142  */
            /* JADX WARN: Code duplicated, block: B:98:0x015b  */
            /* JADX WARN: Instruction removed from duplicated block: B:107:0x0175, please report this as an issue */
            @Override // defpackage.in2
            public final void r(Object obj) throws Exception {
                av avVar8;
                Context contextJ;
                String str;
                String[] stringArray;
                int length;
                int i7;
                int i8;
                int i9 = i6;
                int i10 = 2;
                int i11 = 0;
                String strM = null;
                qu quVar = this.d;
                switch (i9) {
                    case 0:
                        uu uuVar = (uu) obj;
                        if (uuVar != null) {
                            quVar.Q(uuVar);
                            av avVar9 = quVar.c0;
                            if (avVar9.q == null) {
                                avVar9.q = new ih2();
                            }
                            av.j(avVar9.q, null);
                        }
                        break;
                    case 1:
                        gu guVar = (gu) obj;
                        if (guVar != null) {
                            int i12 = guVar.a;
                            CharSequence charSequenceX = guVar.b;
                            switch (i12) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                case 6:
                                default:
                                    i12 = 8;
                                    break;
                            }
                            Context contextJ2 = quVar.j();
                            int i13 = Build.VERSION.SDK_INT;
                            if (i13 < 29 && ((i12 == 7 || i12 == 9) && contextJ2 != null)) {
                                KeyguardManager keyguardManagerA = cw1.a(contextJ2);
                                if ((keyguardManagerA == null ? false : cw1.b(keyguardManagerA)) && xr0.g0(quVar.c0.e())) {
                                    quVar.N();
                                } else if (quVar.M()) {
                                    if (charSequenceX == null) {
                                        charSequenceX = av1.x(quVar.j(), i12);
                                    }
                                    avVar8 = quVar.c0;
                                    if (i12 == 5) {
                                        i8 = avVar8.j;
                                        if (i8 != 0) {
                                            quVar.P(i12, charSequenceX);
                                        } else {
                                            quVar.P(i12, charSequenceX);
                                        }
                                        quVar.J();
                                    } else {
                                        if (avVar8.v) {
                                            quVar.O(i12, charSequenceX);
                                        } else {
                                            quVar.R(charSequenceX);
                                            Handler handler6 = quVar.d0;
                                            iu iuVar6 = new iu(i12, i11, quVar, charSequenceX);
                                            contextJ = quVar.j();
                                            if (contextJ != null) {
                                                str = Build.MODEL;
                                                if (i13 == 28) {
                                                    i11 = 2000;
                                                } else {
                                                    stringArray = contextJ.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes);
                                                    length = stringArray.length;
                                                    i7 = 0;
                                                    while (true) {
                                                        if (i7 < length) {
                                                            i11 = 2000;
                                                        } else if (str.startsWith(stringArray[i7])) {
                                                            i7++;
                                                        }
                                                    }
                                                }
                                            } else {
                                                i11 = 2000;
                                            }
                                            handler6.postDelayed(iuVar6, i11);
                                        }
                                        quVar.c0.v = true;
                                    }
                                } else {
                                    if (charSequenceX == null) {
                                        charSequenceX = quVar.m(R.string.default_error_msg) + " " + i12;
                                    }
                                    quVar.O(i12, charSequenceX);
                                }
                            } else if (quVar.M()) {
                                if (charSequenceX == null) {
                                    charSequenceX = av1.x(quVar.j(), i12);
                                }
                                avVar8 = quVar.c0;
                                if (i12 == 5) {
                                    i8 = avVar8.j;
                                    if (i8 != 0 || i8 == 3) {
                                        quVar.P(i12, charSequenceX);
                                    }
                                    quVar.J();
                                } else {
                                    if (avVar8.v) {
                                        quVar.O(i12, charSequenceX);
                                    } else {
                                        quVar.R(charSequenceX);
                                        Handler handler7 = quVar.d0;
                                        iu iuVar7 = new iu(i12, i11, quVar, charSequenceX);
                                        contextJ = quVar.j();
                                        if (contextJ != null) {
                                            str = Build.MODEL;
                                            if (i13 == 28 || str == null) {
                                                i11 = 2000;
                                            } else {
                                                stringArray = contextJ.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes);
                                                length = stringArray.length;
                                                i7 = 0;
                                                while (true) {
                                                    if (i7 < length) {
                                                        i11 = 2000;
                                                    } else if (str.startsWith(stringArray[i7])) {
                                                        i7++;
                                                    }
                                                }
                                            }
                                        } else {
                                            i11 = 2000;
                                        }
                                        handler7.postDelayed(iuVar7, i11);
                                    }
                                    quVar.c0.v = true;
                                }
                            } else {
                                if (charSequenceX == null) {
                                    charSequenceX = quVar.m(R.string.default_error_msg) + " " + i12;
                                }
                                quVar.O(i12, charSequenceX);
                            }
                            quVar.c0.f(null);
                        }
                        break;
                    case 2:
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null) {
                            if (quVar.M()) {
                                quVar.R(charSequence);
                            }
                            quVar.c0.f(null);
                        }
                        break;
                    case 3:
                        if (((Boolean) obj).booleanValue()) {
                            if (quVar.M()) {
                                quVar.R(quVar.m(R.string.fingerprint_not_recognized));
                            }
                            av avVar10 = quVar.c0;
                            if (avVar10.l) {
                                Executor ouVar = avVar10.b;
                                if (ouVar == null) {
                                    ouVar = new ou(1);
                                }
                                ouVar.execute(new hu(quVar, i10));
                            } else {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            av avVar11 = quVar.c0;
                            if (avVar11.t == null) {
                                avVar11.t = new ih2();
                            }
                            av.j(avVar11.t, Boolean.FALSE);
                        }
                        break;
                    case 4:
                        if (((Boolean) obj).booleanValue()) {
                            if (quVar.L()) {
                                quVar.N();
                            } else {
                                av avVar12 = quVar.c0;
                                String str2 = avVar12.i;
                                if (str2 != null) {
                                    strM = str2;
                                } else if (avVar12.d != null) {
                                    strM = BuildConfig.VERSION_NAME;
                                }
                                if (strM == null) {
                                    strM = quVar.m(R.string.default_error_msg);
                                }
                                quVar.O(13, strM);
                                quVar.I(2);
                            }
                            quVar.c0.i(false);
                        }
                        break;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            quVar.I(1);
                            quVar.J();
                            av avVar13 = quVar.c0;
                            if (avVar13.w == null) {
                                avVar13.w = new ih2();
                            }
                            av.j(avVar13.w, Boolean.FALSE);
                        }
                        break;
                }
            }
        });
    }
}
