package defpackage;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: loaded from: classes.dex */
public final class og2 extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public og2(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        ((yk1) iInterface).getClass();
        obj.getClass();
        this.a.d.remove((Integer) obj);
    }
}
