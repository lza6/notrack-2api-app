package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class yj4 extends g13 {
    public final /* synthetic */ int h;

    @Override // defpackage.g13
    public mg n(Context context, Looper looper, f13 f13Var, Object obj, xf1 xf1Var, yf1 yf1Var) {
        switch (this.h) {
            case 0:
                f13Var.getClass();
                Integer num = (Integer) f13Var.f;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new nh3(context, looper, f13Var, bundle, xf1Var, yf1Var);
            case 1:
                obj.getClass();
                throw new ClassCastException();
            default:
                return super.n(context, looper, f13Var, obj, xf1Var, yf1Var);
        }
    }

    @Override // defpackage.g13
    public /* synthetic */ mg o(Context context, Looper looper, f13 f13Var, Object obj, ek4 ek4Var, ek4 ek4Var2) {
        switch (this.h) {
            case 2:
                return new cl4(context, looper, f13Var, (ht3) obj, ek4Var, ek4Var2);
            default:
                return super.o(context, looper, f13Var, obj, ek4Var, ek4Var2);
        }
    }
}
