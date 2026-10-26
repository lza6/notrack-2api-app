package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class ln extends BiometricPrompt$AuthenticationCallback {
    public final /* synthetic */ on a;

    public ln(on onVar) {
        this.a = onVar;
    }

    public void onAuthenticationError(int i, CharSequence charSequence) {
        this.a.a(i, charSequence);
    }

    public void onAuthenticationFailed() {
        WeakReference weakReference = ((yu) this.a).a;
        if (weakReference.get() == null || !((av) weakReference.get()).l) {
            return;
        }
        av avVar = (av) weakReference.get();
        if (avVar.t == null) {
            avVar.t = new ih2();
        }
        av.j(avVar.t, Boolean.TRUE);
    }

    public void onAuthenticationHelp(int i, CharSequence charSequence) {
    }

    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        BiometricPrompt.CryptoObject cryptoObjectB;
        PresentationSession presentationSessionB;
        IdentityCredential identityCredentialB;
        vu vuVar = null;
        if (authenticationResult != null && (cryptoObjectB = mn.b(authenticationResult)) != null) {
            Cipher cipherD = uq0.d(cryptoObjectB);
            if (cipherD != null) {
                vuVar = new vu(cipherD);
            } else {
                Signature signatureF = uq0.f(cryptoObjectB);
                if (signatureF != null) {
                    vuVar = new vu(signatureF);
                } else {
                    Mac macE = uq0.e(cryptoObjectB);
                    if (macE != null) {
                        vuVar = new vu(macE);
                    } else {
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 30 && (identityCredentialB = vq0.b(cryptoObjectB)) != null) {
                            vu vuVar2 = new vu();
                            vuVar2.c = null;
                            vuVar2.d = null;
                            vuVar2.h = null;
                            vuVar2.l = identityCredentialB;
                            vuVar2.m = null;
                            vuVar = vuVar2;
                        } else if (i >= 33 && (presentationSessionB = wq0.b(cryptoObjectB)) != null) {
                            vu vuVar3 = new vu();
                            vuVar3.c = null;
                            vuVar3.d = null;
                            vuVar3.h = null;
                            vuVar3.l = null;
                            vuVar3.m = presentationSessionB;
                            vuVar = vuVar3;
                        }
                    }
                }
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        int iA = -1;
        if (i2 >= 30) {
            if (authenticationResult != null) {
                iA = nn.a(authenticationResult);
            }
        } else if (i2 != 29) {
            iA = 2;
        }
        this.a.b(new uu(vuVar, iA));
    }
}
