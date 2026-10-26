package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: loaded from: classes.dex */
public final class jr3 {
    public static final String d = v72.h("SystemJobInfoConverter");
    public final ComponentName a;
    public final sb3 b;
    public final boolean c;

    public jr3(Context context, sb3 sb3Var, boolean z) {
        this.b = sb3Var;
        this.a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.c = z;
    }
}
