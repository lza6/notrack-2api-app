package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.ng2;
import defpackage.og2;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {
    public int c;
    public final LinkedHashMap d = new LinkedHashMap();
    public final og2 h = new og2(this);
    public final ng2 l = new ng2(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.l;
    }
}
