package defpackage;

import ai.notrack.app.R;
import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class lm2 {
    public final Bundle a;
    public IconCompat b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final CharSequence f;
    public final PendingIntent g;

    public lm2(String str, PendingIntent pendingIntent) {
        IconCompat iconCompatA = IconCompat.a(R.drawable.common_full_open_on_phone);
        Bundle bundle = new Bundle();
        this.d = true;
        this.b = iconCompatA;
        if (iconCompatA != null) {
            int iIntValue = iconCompatA.a;
            if (iIntValue == -1) {
                Object obj = iconCompatA.b;
                if (Build.VERSION.SDK_INT >= 28) {
                    iIntValue = og.o(obj);
                } else {
                    try {
                        iIntValue = ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
                    } catch (IllegalAccessException e) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e);
                        iIntValue = -1;
                    } catch (NoSuchMethodException e2) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e2);
                        iIntValue = -1;
                    } catch (InvocationTargetException e3) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e3);
                        iIntValue = -1;
                    }
                }
            }
            if (iIntValue == 2) {
                this.e = iconCompatA.b();
            }
        }
        this.f = mm2.b(str);
        this.g = pendingIntent;
        this.a = bundle;
        this.c = true;
        this.d = true;
    }
}
