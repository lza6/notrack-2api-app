package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hi implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;

    public /* synthetic */ hi(Context context, int i) {
        this.c = i;
        this.d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        Context context = this.d;
        switch (i) {
            case 0:
                if (Build.VERSION.SDK_INT >= 33) {
                    ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (li.b().a.a.isEmpty()) {
                            String strG = av1.G(context);
                            Object systemService = context.getSystemService("locale");
                            if (systemService != null) {
                                ji.b(systemService, ii.a(strG));
                            }
                        }
                        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                li.n = true;
                break;
            case 1:
                li.p(context);
                break;
            case 2:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new hi(context, 3));
                break;
            default:
                d03.b(context, new al(1), d03.a, false);
                break;
        }
    }
}
