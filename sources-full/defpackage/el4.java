package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class el4 extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el4(Looper looper, int i) {
        super(looper);
        switch (i) {
            case 2:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }
}
