package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class um4 {
    public final d5 a;
    public final IntentFilter b;
    public final Context c;
    public final HashSet d;
    public vi e;

    public um4(Context context) {
        d5 d5Var = new d5("AppUpdateListenerRegistry");
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        this.d = new HashSet();
        this.e = null;
        this.a = d5Var;
        this.b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext != null ? applicationContext : context;
    }

    public final void a() {
        vi viVar;
        HashSet hashSet = this.d;
        boolean zIsEmpty = hashSet.isEmpty();
        Context context = this.c;
        if (!zIsEmpty && this.e == null) {
            vi viVar2 = new vi(2, this);
            this.e = viVar2;
            int i = Build.VERSION.SDK_INT;
            IntentFilter intentFilter = this.b;
            if (i >= 33) {
                context.registerReceiver(viVar2, intentFilter, 2);
            } else {
                context.registerReceiver(viVar2, intentFilter);
            }
        }
        if (!hashSet.isEmpty() || (viVar = this.e) == null) {
            return;
        }
        context.unregisterReceiver(viVar);
        this.e = null;
    }
}
