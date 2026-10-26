package defpackage;

import android.content.Context;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public final class zt {
    public final Object a;
    public volatile Object b;
    public volatile Object c;

    public /* synthetic */ zt(Object obj) {
        this.a = obj;
    }

    public boolean a() {
        try {
            Context context = (Context) this.a;
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), Uuid.SIZE_BITS).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e) {
            tm4.i("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e);
            return false;
        }
    }
}
