package defpackage;

import android.content.Intent;
import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class ck implements Runnable {
    public final /* synthetic */ int c;
    public final int d;
    public final Object h;
    public final Object l;

    public /* synthetic */ ck(int i, int i2, Object obj, Object obj2) {
        this.c = i2;
        this.h = obj;
        this.l = obj2;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        int i2 = this.d;
        Object obj = this.l;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                ((TextView) obj2).setTypeface((Typeface) obj, i2);
                break;
            default:
                ((br3) obj2).a((Intent) obj, i2);
                break;
        }
    }
}
