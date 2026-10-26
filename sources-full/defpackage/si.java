package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;
import kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class si {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, zi ziVar) {
        Objects.requireNonNull(ziVar);
        ri riVar = new ri(0, ziVar);
        i1.n(obj).registerOnBackInvokedCallback(DurationKt.NANOS_IN_MILLIS, riVar);
        return riVar;
    }

    public static void c(Object obj, Object obj2) {
        i1.n(obj).unregisterOnBackInvokedCallback(i1.k(obj2));
    }
}
