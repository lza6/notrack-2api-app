package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class bs2 {
    public static final String a = v72.h("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z) {
        String str = a;
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z2 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z2 = true;
            }
            if (z == z2) {
                v72.f().c(str, "Skipping component enablement for ".concat(cls.getName()));
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            v72 v72VarF = v72.f();
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z ? "enabled" : "disabled");
            v72VarF.c(str, sb.toString());
        } catch (Exception e) {
            v72 v72VarF2 = v72.f();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            sb2.append(z ? "enabled" : "disabled");
            String string = sb2.toString();
            if (v72VarF2.c <= 3) {
                Log.d(str, string, e);
            }
        }
    }
}
