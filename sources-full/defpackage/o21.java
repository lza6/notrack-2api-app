package defpackage;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class o21 extends v11 implements Runnable {
    public final WeakReference c;

    public o21(EditText editText) {
        this.c = new WeakReference(editText);
    }

    @Override // defpackage.v11
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.c.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        p21.a((EditText) this.c.get(), 1);
    }
}
