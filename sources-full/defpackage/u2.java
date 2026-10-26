package defpackage;

import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final class u2 implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u2(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        int i = this.c;
        Message messageObtain = null;
        messageObtain = null;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((k3) obj).a();
                break;
            case 1:
                f7 f7Var = (f7) obj;
                if (view == f7Var.i && (message = f7Var.k) != null) {
                    messageObtain = Message.obtain(message);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                f7Var.z.obtainMessage(1, f7Var.b).sendToTarget();
                break;
            default:
                i44 i44Var = ((Toolbar) obj).T;
                mc2 mc2Var = i44Var != null ? i44Var.d : null;
                if (mc2Var != null) {
                    mc2Var.collapseActionView();
                }
                break;
        }
    }
}
