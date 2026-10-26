package defpackage;

import android.hardware.fingerprint.FingerprintManager;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class l71 extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ jb a;

    public l71(jb jbVar) {
        this.a = jbVar;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        ((yu) ((ci4) this.a.d).l).a(i, charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((yu) ((ci4) this.a.d).l).a;
        if (weakReference.get() == null || !((av) weakReference.get()).l) {
            return;
        }
        av avVar = (av) weakReference.get();
        if (avVar.t == null) {
            avVar.t = new ih2();
        }
        av.j(avVar.t, Boolean.TRUE);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        WeakReference weakReference = ((yu) ((ci4) this.a.d).l).a;
        if (weakReference.get() != null) {
            av avVar = (av) weakReference.get();
            if (avVar.s == null) {
                avVar.s = new ih2();
            }
            av.j(avVar.s, charSequence);
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        jb jbVar = this.a;
        ci4 ci4VarF = m71.f(m71.b(authenticationResult));
        jbVar.getClass();
        vu vuVar = null;
        if (ci4VarF != null) {
            Cipher cipher = (Cipher) ci4VarF.h;
            if (cipher != null) {
                vuVar = new vu(cipher);
            } else {
                Signature signature = (Signature) ci4VarF.d;
                if (signature != null) {
                    vuVar = new vu(signature);
                } else {
                    Mac mac = (Mac) ci4VarF.l;
                    if (mac != null) {
                        vuVar = new vu(mac);
                    }
                }
            }
        }
        ((yu) ((ci4) jbVar.d).l).b(new uu(vuVar, 2));
    }
}
