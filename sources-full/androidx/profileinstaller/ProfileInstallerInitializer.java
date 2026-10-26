package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import defpackage.e03;
import defpackage.ko1;
import defpackage.qn0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements ko1 {
    @Override // defpackage.ko1
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.ko1
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new e03(this, context.getApplicationContext()));
        return new qn0(25);
    }
}
