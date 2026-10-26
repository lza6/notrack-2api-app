package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s2 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;

    public /* synthetic */ s2(Context context, int i) {
        this.c = i;
        this.d = context;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        Context context = this.d;
        switch (i) {
            case 0:
                return kr1.W(context, "secure_account", "account_fallback");
            case 1:
                try {
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?package=ai.notrack.app")));
                    break;
                } catch (Throwable unused) {
                }
                return w84.a;
            default:
                return kr1.W(context, "secure_cookies", "cookies_fallback");
        }
    }
}
