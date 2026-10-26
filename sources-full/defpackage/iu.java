package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iu implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;

    public /* synthetic */ iu(int i, int i2, Object obj, Object obj2) {
        this.c = i2;
        this.h = obj;
        this.d = i;
        this.l = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        Object obj = this.l;
        int i2 = this.d;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                ((qu) obj2).O(i2, (CharSequence) obj);
                break;
            case 1:
                ng0 ng0Var = (ng0) obj2;
                Serializable serializable = (Serializable) ((jb) obj).d;
                String str = (String) ng0Var.a.get(Integer.valueOf(i2));
                if (str != null) {
                    b4 b4Var = (b4) ng0Var.e.get(str);
                    if ((b4Var != null ? b4Var.a : null) != null) {
                        r3 r3Var = b4Var.a;
                        if (ng0Var.d.remove(str)) {
                            r3Var.b(serializable);
                        }
                    } else {
                        ng0Var.g.remove(str);
                        ng0Var.f.put(str, serializable);
                    }
                    break;
                }
                break;
            case 2:
                ((ng0) obj2).a(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            default:
                ((c03) ((lv0) obj2).c).m(i2, obj);
                break;
        }
    }
}
